package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachDiskRequest extends js.Object {
  
  /**
    * The unique name of the disk you want to detach from your instance (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
}
object DetachDiskRequest {
  
  @scala.inline
  def apply(diskName: ResourceName): DetachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachDiskRequest]
  }
  
  @scala.inline
  implicit class DetachDiskRequestOps[Self <: DetachDiskRequest] (val x: Self) extends AnyVal {
    
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
  }
}
