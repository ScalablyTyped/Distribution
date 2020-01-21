package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The ARN of the certificate associated with the device.
    */
  var CertificateArn: string = js.native
  /**
    * A descriptive or arbitrary ID for the device. This value must be unique within the device definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
  /**
    * If true, the device's local shadow will be automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[boolean] = js.native
  /**
    * The thing ARN of the device.
    */
  var ThingArn: string = js.native
}

object Device {
  @scala.inline
  def apply(
    CertificateArn: string,
    Id: string,
    ThingArn: string,
    SyncShadow: js.UndefOr[Boolean] = js.undefined
  ): Device = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    if (!js.isUndefined(SyncShadow)) __obj.updateDynamic("SyncShadow")(SyncShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

