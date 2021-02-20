package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachDiskRequest extends StObject {
  
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
  implicit class DetachDiskRequestMutableBuilder[Self <: DetachDiskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
  }
}
