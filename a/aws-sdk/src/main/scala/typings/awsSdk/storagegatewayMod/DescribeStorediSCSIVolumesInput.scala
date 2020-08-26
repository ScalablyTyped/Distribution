package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStorediSCSIVolumesInput extends js.Object {
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a stored volume. All of the specified stored volumes must be from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typings.awsSdk.storagegatewayMod.VolumeARNs = js.native
}

object DescribeStorediSCSIVolumesInput {
  @scala.inline
  def apply(VolumeARNs: VolumeARNs): DescribeStorediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorediSCSIVolumesInput]
  }
  @scala.inline
  implicit class DescribeStorediSCSIVolumesInputOps[Self <: DescribeStorediSCSIVolumesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVolumeARNsVarargs(value: VolumeARN*): Self = this.set("VolumeARNs", js.Array(value :_*))
    @scala.inline
    def setVolumeARNs(value: VolumeARNs): Self = this.set("VolumeARNs", value.asInstanceOf[js.Any])
  }
  
}

