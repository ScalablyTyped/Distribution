package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubMesh extends StObject {
  
  var effect: typings.babylonjs.BABYLON.Effect
  
  var subMesh: Nullable[typings.babylonjs.BABYLON.SubMesh]
}
object SubMesh {
  
  inline def apply(effect: typings.babylonjs.BABYLON.Effect): SubMesh = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], subMesh = null)
    __obj.asInstanceOf[SubMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubMesh] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: typings.babylonjs.BABYLON.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setSubMesh(value: Nullable[typings.babylonjs.BABYLON.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    inline def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
