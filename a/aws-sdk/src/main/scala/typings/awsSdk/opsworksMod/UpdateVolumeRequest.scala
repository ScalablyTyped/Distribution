package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVolumeRequest extends js.Object {
  
  /**
    * The new mount point.
    */
  var MountPoint: js.UndefOr[String] = js.native
  
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}
object UpdateVolumeRequest {
  
  @scala.inline
  def apply(VolumeId: String): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
  
  @scala.inline
  implicit class UpdateVolumeRequestOps[Self <: UpdateVolumeRequest] (val x: Self) extends AnyVal {
    
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
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPoint(value: String): Self = this.set("MountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPoint: Self = this.set("MountPoint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
