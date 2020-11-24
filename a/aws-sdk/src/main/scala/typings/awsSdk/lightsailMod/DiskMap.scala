package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskMap extends js.Object {
  
  /**
    * The new disk name (e.g., my-new-disk).
    */
  var newDiskName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The original disk path exposed to the instance (for example, /dev/sdh).
    */
  var originalDiskPath: js.UndefOr[NonEmptyString] = js.native
}
object DiskMap {
  
  @scala.inline
  def apply(): DiskMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskMap]
  }
  
  @scala.inline
  implicit class DiskMapOps[Self <: DiskMap] (val x: Self) extends AnyVal {
    
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
    def setNewDiskName(value: ResourceName): Self = this.set("newDiskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDiskName: Self = this.set("newDiskName", js.undefined)
    
    @scala.inline
    def setOriginalDiskPath(value: NonEmptyString): Self = this.set("originalDiskPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalDiskPath: Self = this.set("originalDiskPath", js.undefined)
  }
}
