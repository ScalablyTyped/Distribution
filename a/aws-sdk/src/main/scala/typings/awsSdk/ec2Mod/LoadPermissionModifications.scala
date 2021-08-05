package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPermissionModifications extends StObject {
  
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.undefined
  
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.undefined
}
object LoadPermissionModifications {
  
  inline def apply(): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionModifications]
  }
  
  extension [Self <: LoadPermissionModifications](x: Self) {
    
    inline def setAdd(value: LoadPermissionListRequest): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    inline def setAddVarargs(value: LoadPermissionRequest*): Self = StObject.set(x, "Add", js.Array(value :_*))
    
    inline def setRemove(value: LoadPermissionListRequest): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    inline def setRemoveVarargs(value: LoadPermissionRequest*): Self = StObject.set(x, "Remove", js.Array(value :_*))
  }
}
