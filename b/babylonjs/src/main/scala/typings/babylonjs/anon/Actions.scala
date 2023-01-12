package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: Nullable[Any]
  
  var freezeWorldMatrix: Nullable[Boolean]
  
  var lods: Nullable[Any]
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal(actions = null, freezeWorldMatrix = null, lods = null)
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Nullable[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setFreezeWorldMatrix(value: Nullable[Boolean]): Self = StObject.set(x, "freezeWorldMatrix", value.asInstanceOf[js.Any])
    
    inline def setFreezeWorldMatrixNull: Self = StObject.set(x, "freezeWorldMatrix", null)
    
    inline def setLods(value: Nullable[Any]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    inline def setLodsNull: Self = StObject.set(x, "lods", null)
  }
}
