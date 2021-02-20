package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends StObject {
  
  var actions: Nullable[_] = js.native
  
  var freezeWorldMatrix: Nullable[Boolean] = js.native
  
  var lods: Nullable[_] = js.native
}
object Actions {
  
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
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
