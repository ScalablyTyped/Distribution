package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskSnapshotInfo extends StObject {
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.native
}
object DiskSnapshotInfo {
  
  @scala.inline
  def apply(): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
  
  @scala.inline
  implicit class DiskSnapshotInfoMutableBuilder[Self <: DiskSnapshotInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
