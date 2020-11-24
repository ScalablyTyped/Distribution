package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalDeviceResourceData extends js.Object {
  
  /**
    * Group/owner related settings for local resources.
    */
  var GroupOwnerSetting: js.UndefOr[typings.awsSdk.greengrassMod.GroupOwnerSetting] = js.native
  
  /**
    * The local absolute path of the device resource. The source path for a device resource can refer only to a character device or block device under ''/dev''.
    */
  var SourcePath: js.UndefOr[string] = js.native
}
object LocalDeviceResourceData {
  
  @scala.inline
  def apply(): LocalDeviceResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDeviceResourceData]
  }
  
  @scala.inline
  implicit class LocalDeviceResourceDataOps[Self <: LocalDeviceResourceData] (val x: Self) extends AnyVal {
    
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
    def setGroupOwnerSetting(value: GroupOwnerSetting): Self = this.set("GroupOwnerSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOwnerSetting: Self = this.set("GroupOwnerSetting", js.undefined)
    
    @scala.inline
    def setSourcePath(value: string): Self = this.set("SourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePath: Self = this.set("SourcePath", js.undefined)
  }
}
