package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPermissionModifications extends StObject {
  
  /**
    * The AWS account ID to add to the list of launch permissions for the AMI.
    */
  var Add: js.UndefOr[LaunchPermissionList] = js.undefined
  
  /**
    * The AWS account ID to remove from the list of launch permissions for the AMI.
    */
  var Remove: js.UndefOr[LaunchPermissionList] = js.undefined
}
object LaunchPermissionModifications {
  
  inline def apply(): LaunchPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionModifications]
  }
  
  extension [Self <: LaunchPermissionModifications](x: Self) {
    
    inline def setAdd(value: LaunchPermissionList): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    inline def setAddVarargs(value: LaunchPermission*): Self = StObject.set(x, "Add", js.Array(value :_*))
    
    inline def setRemove(value: LaunchPermissionList): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    inline def setRemoveVarargs(value: LaunchPermission*): Self = StObject.set(x, "Remove", js.Array(value :_*))
  }
}
