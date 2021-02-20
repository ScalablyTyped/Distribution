package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceCertificateParams extends StObject {
  
  /**
    * The action that you want to apply to the device cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: DeviceCertificateUpdateAction = js.native
}
object UpdateDeviceCertificateParams {
  
  @scala.inline
  def apply(action: DeviceCertificateUpdateAction): UpdateDeviceCertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceCertificateParams]
  }
  
  @scala.inline
  implicit class UpdateDeviceCertificateParamsMutableBuilder[Self <: UpdateDeviceCertificateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: DeviceCertificateUpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
