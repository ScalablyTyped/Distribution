package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChangeTokenResponse extends StObject {
  
  /**
    * The ChangeToken that you used in the request. Use this value in a GetChangeTokenStatus request to get the current status of the request. 
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
}
object GetChangeTokenResponse {
  
  @scala.inline
  def apply(): GetChangeTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenResponse]
  }
  
  @scala.inline
  implicit class GetChangeTokenResponseMutableBuilder[Self <: GetChangeTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
