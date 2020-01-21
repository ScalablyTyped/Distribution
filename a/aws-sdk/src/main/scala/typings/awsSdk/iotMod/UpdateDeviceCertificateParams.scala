package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceCertificateParams extends js.Object {
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
}

