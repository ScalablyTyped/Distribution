package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: Nullable[js.Any]
  
  var freezeWorldMatrix: Nullable[Boolean]
  
  var lods: Nullable[js.Any]
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal(actions = null, freezeWorldMatrix = null, lods = null)
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: Nullable[js.Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setFreezeWorldMatrix(value: Nullable[Boolean]): Self = StObject.set(x, "freezeWorldMatrix", value.asInstanceOf[js.Any])
    
    inline def setFreezeWorldMatrixNull: Self = StObject.set(x, "freezeWorldMatrix", null)
    
    inline def setLods(value: Nullable[js.Any]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    inline def setLodsNull: Self = StObject.set(x, "lods", null)
  }
}
