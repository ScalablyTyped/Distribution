package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchPermissionModifications extends StObject {
  
  /**
    * The AWS account ID to add to the list of launch permissions for the AMI.
    */
  var Add: js.UndefOr[LaunchPermissionList] = js.native
  
  /**
    * The AWS account ID to remove from the list of launch permissions for the AMI.
    */
  var Remove: js.UndefOr[LaunchPermissionList] = js.native
}
object LaunchPermissionModifications {
  
  @scala.inline
  def apply(): LaunchPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionModifications]
  }
  
  @scala.inline
  implicit class LaunchPermissionModificationsMutableBuilder[Self <: LaunchPermissionModifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: LaunchPermissionList): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: LaunchPermission*): Self = StObject.set(x, "Add", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: LaunchPermissionList): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: LaunchPermission*): Self = StObject.set(x, "Remove", js.Array(value :_*))
  }
}
