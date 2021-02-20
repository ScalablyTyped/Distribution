package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskMap extends StObject {
  
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
  implicit class DiskMapMutableBuilder[Self <: DiskMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewDiskName(value: ResourceName): Self = StObject.set(x, "newDiskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDiskNameUndefined: Self = StObject.set(x, "newDiskName", js.undefined)
    
    @scala.inline
    def setOriginalDiskPath(value: NonEmptyString): Self = StObject.set(x, "originalDiskPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDiskPathUndefined: Self = StObject.set(x, "originalDiskPath", js.undefined)
  }
}
