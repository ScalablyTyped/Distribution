package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumesRequestOps[Self <: DescribeVolumesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setRaidArrayId(value: String): Self = this.set("RaidArrayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidArrayId: Self = this.set("RaidArrayId", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: String*): Self = this.set("VolumeIds", js.Array(value :_*))
    
    @scala.inline
    def setVolumeIds(value: Strings): Self = this.set("VolumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeIds: Self = this.set("VolumeIds", js.undefined)
  }
}
