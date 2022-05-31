package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect extends StObject {
  
  var effect: typings.babylonjs.effectMod.Effect
  
  var subMesh: Nullable[typings.babylonjs.subMeshMod.SubMesh]
}
object Effect {
  
  inline def apply(effect: typings.babylonjs.effectMod.Effect): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], subMesh = null)
    __obj.asInstanceOf[Effect]
  }
  
  extension [Self <: Effect](x: Self) {
    
    inline def setEffect(value: typings.babylonjs.effectMod.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setSubMesh(value: Nullable[typings.babylonjs.subMeshMod.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    inline def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
