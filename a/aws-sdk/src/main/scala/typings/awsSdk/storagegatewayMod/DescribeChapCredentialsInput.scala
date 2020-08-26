package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChapCredentialsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.storagegatewayMod.TargetARN = js.native
}

object DescribeChapCredentialsInput {
  @scala.inline
  def apply(TargetARN: TargetARN): DescribeChapCredentialsInput = {
    val __obj = js.Dynamic.literal(TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChapCredentialsInput]
  }
  @scala.inline
  implicit class DescribeChapCredentialsInputOps[Self <: DescribeChapCredentialsInput] (val x: Self) extends AnyVal {
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
    def setTargetARN(value: TargetARN): Self = this.set("TargetARN", value.asInstanceOf[js.Any])
  }
  
}

