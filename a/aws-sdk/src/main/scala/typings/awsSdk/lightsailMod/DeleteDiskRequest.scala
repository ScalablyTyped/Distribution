package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDiskRequest extends StObject {
  
  /**
    * The unique name of the disk you want to delete (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.native
}
object DeleteDiskRequest {
  
  @scala.inline
  def apply(diskName: ResourceName): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskRequest]
  }
  
  @scala.inline
  implicit class DeleteDiskRequestMutableBuilder[Self <: DeleteDiskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteAddOns(value: Boolean): Self = StObject.set(x, "forceDeleteAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteAddOnsUndefined: Self = StObject.set(x, "forceDeleteAddOns", js.undefined)
  }
}
