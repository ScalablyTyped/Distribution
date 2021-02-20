package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskInfo extends StObject {
  
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  
  /**
    * The disk name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The disk path.
    */
  var path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.native
}
object DiskInfo {
  
  @scala.inline
  def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  
  @scala.inline
  implicit class DiskInfoMutableBuilder[Self <: DiskInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSystemDisk(value: Boolean): Self = StObject.set(x, "isSystemDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemDiskUndefined: Self = StObject.set(x, "isSystemDisk", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
