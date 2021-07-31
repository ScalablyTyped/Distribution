package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMasterAccountResponse extends StObject {
  
  /**
    * A list of details about the Security Hub master account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.undefined
}
object GetMasterAccountResponse {
  
  @scala.inline
  def apply(): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  
  @scala.inline
  implicit class GetMasterAccountResponseMutableBuilder[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: Invitation): Self = StObject.set(x, "Master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUndefined: Self = StObject.set(x, "Master", js.undefined)
  }
}
