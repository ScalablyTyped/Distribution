package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiskRequest extends StObject {
  
  /**
    * The name of the disk (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
}
object GetDiskRequest {
  
  @scala.inline
  def apply(diskName: ResourceName): GetDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskRequest]
  }
  
  @scala.inline
  implicit class GetDiskRequestMutableBuilder[Self <: GetDiskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
  }
}
