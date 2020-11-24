package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachDiskRequest extends js.Object {
  
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  
  /**
    * The disk path to expose to the instance (e.g., /dev/xvdf).
    */
  var diskPath: NonEmptyString = js.native
  
  /**
    * The name of the Lightsail instance where you want to utilize the storage disk.
    */
  var instanceName: ResourceName = js.native
}
object AttachDiskRequest {
  
  @scala.inline
  def apply(diskName: ResourceName, diskPath: NonEmptyString, instanceName: ResourceName): AttachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskPath = diskPath.asInstanceOf[js.Any], instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachDiskRequest]
  }
  
  @scala.inline
  implicit class AttachDiskRequestOps[Self <: AttachDiskRequest] (val x: Self) extends AnyVal {
    
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
    def setDiskName(value: ResourceName): Self = this.set("diskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskPath(value: NonEmptyString): Self = this.set("diskPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
  }
}
