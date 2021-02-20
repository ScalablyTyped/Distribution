package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadPermissionModifications extends StObject {
  
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.native
  
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.native
}
object LoadPermissionModifications {
  
  @scala.inline
  def apply(): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPermissionModifications]
  }
  
  @scala.inline
  implicit class LoadPermissionModificationsMutableBuilder[Self <: LoadPermissionModifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: LoadPermissionListRequest): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: LoadPermissionRequest*): Self = StObject.set(x, "Add", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: LoadPermissionListRequest): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: LoadPermissionRequest*): Self = StObject.set(x, "Remove", js.Array(value :_*))
  }
}
