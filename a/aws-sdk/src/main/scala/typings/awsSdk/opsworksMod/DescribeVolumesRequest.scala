package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The RAID array ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified RAID array.
    */
  var RaidArrayId: js.UndefOr[String] = js.native
  /**
    * A stack ID. The action describes the stack's registered Amazon EBS volumes.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * Am array of volume IDs. If you use this parameter, DescribeVolumes returns descriptions of the specified volumes. Otherwise, it returns a description of every volume.
    */
  var VolumeIds: js.UndefOr[Strings] = js.native
}

object DescribeVolumesRequest {
  @scala.inline
  def apply(
    InstanceId: String = null,
    RaidArrayId: String = null,
    StackId: String = null,
    VolumeIds: Strings = null
  ): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (VolumeIds != null) __obj.updateDynamic("VolumeIds")(VolumeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
}

