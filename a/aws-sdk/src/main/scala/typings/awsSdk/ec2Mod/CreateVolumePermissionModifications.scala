package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVolumePermissionModifications extends StObject {
  
  /**
    * Adds the specified AWS account ID or group to the list.
    */
  var Add: js.UndefOr[CreateVolumePermissionList] = js.native
  
  /**
    * Removes the specified AWS account ID or group from the list.
    */
  var Remove: js.UndefOr[CreateVolumePermissionList] = js.native
}
object CreateVolumePermissionModifications {
  
  @scala.inline
  def apply(): CreateVolumePermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermissionModifications]
  }
  
  @scala.inline
  implicit class CreateVolumePermissionModificationsMutableBuilder[Self <: CreateVolumePermissionModifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: CreateVolumePermissionList): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: CreateVolumePermission*): Self = StObject.set(x, "Add", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: CreateVolumePermissionList): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: CreateVolumePermission*): Self = StObject.set(x, "Remove", js.Array(value :_*))
  }
}
