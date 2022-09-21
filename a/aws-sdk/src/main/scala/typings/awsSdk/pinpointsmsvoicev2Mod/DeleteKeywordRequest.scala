package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeywordRequest extends StObject {
  
  /**
    * The keyword to delete.
    */
  var Keyword: typings.awsSdk.pinpointsmsvoicev2Mod.Keyword
  
  /**
    * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use DescribePhoneNumbers to find the values for PhoneNumberId and PhoneNumberArn and DescribePools to find the values of PoolId and PoolArn.
    */
  var OriginationIdentity: PhoneOrPoolIdOrArn
}
object DeleteKeywordRequest {
  
  inline def apply(Keyword: Keyword, OriginationIdentity: PhoneOrPoolIdOrArn): DeleteKeywordRequest = {
    val __obj = js.Dynamic.literal(Keyword = Keyword.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeywordRequest]
  }
  
  extension [Self <: DeleteKeywordRequest](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentity(value: PhoneOrPoolIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
  }
}
