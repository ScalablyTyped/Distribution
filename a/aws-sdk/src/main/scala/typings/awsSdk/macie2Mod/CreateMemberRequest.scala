package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMemberRequest extends StObject {
  
  /**
    * The details for the account to associate with the master account.
    */
  var account: AccountDetail
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie. An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateMemberRequest {
  
  inline def apply(account: AccountDetail): CreateMemberRequest = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberRequest]
  }
  
  extension [Self <: CreateMemberRequest](x: Self) {
    
    inline def setAccount(value: AccountDetail): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
