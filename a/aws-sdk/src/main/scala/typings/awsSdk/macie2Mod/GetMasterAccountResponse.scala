package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMasterAccountResponse extends StObject {
  
  /**
    * The AWS account ID for the master account. If the accounts are associated by a Macie membership invitation, this object also provides details about the invitation that was sent and accepted to establish the relationship between the accounts.
    */
  var master: js.UndefOr[Invitation] = js.undefined
}
object GetMasterAccountResponse {
  
  inline def apply(): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  
  extension [Self <: GetMasterAccountResponse](x: Self) {
    
    inline def setMaster(value: Invitation): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
  }
}
