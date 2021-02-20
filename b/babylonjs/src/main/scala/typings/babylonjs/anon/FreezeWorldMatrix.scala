package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreezeWorldMatrix extends StObject {
  
  var actions: Nullable[_] = js.native
  
  var freezeWorldMatrix: Nullable[Boolean] = js.native
  
  var lods: Nullable[_] = js.native
}
object FreezeWorldMatrix {
  
  @scala.inline
  def apply(): FreezeWorldMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreezeWorldMatrix]
  }
  
  @scala.inline
  implicit class FreezeWorldMatrixMutableBuilder[Self <: FreezeWorldMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Nullable[_]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsNull: Self = StObject.set(x, "actions", null)
    
    @scala.inline
    def setFreezeWorldMatrix(value: Nullable[Boolean]): Self = StObject.set(x, "freezeWorldMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreezeWorldMatrixNull: Self = StObject.set(x, "freezeWorldMatrix", null)
    
    @scala.inline
    def setLods(value: Nullable[_]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodsNull: Self = StObject.set(x, "lods", null)
  }
}
