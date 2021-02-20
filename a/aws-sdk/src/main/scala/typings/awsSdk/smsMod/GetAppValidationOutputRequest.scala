package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppValidationOutputRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation = js.native
}
object GetAppValidationOutputRequest {
  
  @scala.inline
  def apply(appId: AppIdWithValidation): GetAppValidationOutputRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppValidationOutputRequest]
  }
  
  @scala.inline
  implicit class GetAppValidationOutputRequestMutableBuilder[Self <: GetAppValidationOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
