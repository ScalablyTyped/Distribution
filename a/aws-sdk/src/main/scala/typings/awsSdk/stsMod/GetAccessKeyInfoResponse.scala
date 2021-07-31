package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyInfoResponse extends StObject {
  
  /**
    * The number used to identify the AWS account.
    */
  var Account: js.UndefOr[accountType] = js.undefined
}
object GetAccessKeyInfoResponse {
  
  @scala.inline
  def apply(): GetAccessKeyInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyInfoResponse]
  }
  
  @scala.inline
  implicit class GetAccessKeyInfoResponseMutableBuilder[Self <: GetAccessKeyInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: accountType): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
