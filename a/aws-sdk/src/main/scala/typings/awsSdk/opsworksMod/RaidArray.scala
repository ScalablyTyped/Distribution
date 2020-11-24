package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaidArray extends js.Object {
  
  /**
    * The array's Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * When the RAID array was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The array's Linux device. For example /dev/mdadm0.
    */
  var Device: js.UndefOr[String] = js.native
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * The array's mount point.
    */
  var MountPoint: js.UndefOr[String] = js.native
  
  /**
    * The array name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The number of disks in the array.
    */
  var NumberOfDisks: js.UndefOr[Integer] = js.native
  
  /**
    * The array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.native
  
  /**
    * The RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.native
  
  /**
    * The array's size.
    */
  var Size: js.UndefOr[Integer] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  
  /**
    * The volume type, standard or PIOPS.
    */
  var VolumeType: js.UndefOr[String] = js.native
}
object RaidArray {
  
  @scala.inline
  def apply(): RaidArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaidArray]
  }
  
  @scala.inline
  implicit class RaidArrayOps[Self <: RaidArray] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = this.set("Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setMountPoint(value: String): Self = this.set("MountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPoint: Self = this.set("MountPoint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNumberOfDisks(value: Integer): Self = this.set("NumberOfDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfDisks: Self = this.set("NumberOfDisks", js.undefined)
    
    @scala.inline
    def setRaidArrayId(value: String): Self = this.set("RaidArrayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidArrayId: Self = this.set("RaidArrayId", js.undefined)
    
    @scala.inline
    def setRaidLevel(value: Integer): Self = this.set("RaidLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidLevel: Self = this.set("RaidLevel", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setVolumeType(value: String): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
}
