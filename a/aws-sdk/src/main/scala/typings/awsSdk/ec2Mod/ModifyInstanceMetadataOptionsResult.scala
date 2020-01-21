package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceMetadataOptionsResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The metadata options for the instance.
    */
  var InstanceMetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.native
}

object ModifyInstanceMetadataOptionsResult {
  @scala.inline
  def apply(InstanceId: String = null, InstanceMetadataOptions: InstanceMetadataOptionsResponse = null): ModifyInstanceMetadataOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceMetadataOptions != null) __obj.updateDynamic("InstanceMetadataOptions")(InstanceMetadataOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceMetadataOptionsResult]
  }
}

