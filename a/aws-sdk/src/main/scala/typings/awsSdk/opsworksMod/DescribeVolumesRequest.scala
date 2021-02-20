package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumesRequest extends StObject {
  
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
  implicit class DescribeVolumesRequestMutableBuilder[Self <: DescribeVolumesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setRaidArrayId(value: String): Self = StObject.set(x, "RaidArrayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidArrayIdUndefined: Self = StObject.set(x, "RaidArrayId", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setVolumeIds(value: Strings): Self = StObject.set(x, "VolumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdsUndefined: Self = StObject.set(x, "VolumeIds", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: String*): Self = StObject.set(x, "VolumeIds", js.Array(value :_*))
  }
}
