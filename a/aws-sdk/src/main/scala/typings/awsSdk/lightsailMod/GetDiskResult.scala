package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiskResult extends StObject {
  
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.native
}
object GetDiskResult {
  
  @scala.inline
  def apply(): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskResult]
  }
  
  @scala.inline
  implicit class GetDiskResultMutableBuilder[Self <: GetDiskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisk(value: Disk): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
  }
}
