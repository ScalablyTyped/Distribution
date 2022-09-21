package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collider extends StObject {
  
  var collider: typings.babylonjs.meshMod.Mesh
  
  var rotationMesh: typings.babylonjs.meshMod.Mesh
}
object Collider {
  
  inline def apply(collider: typings.babylonjs.meshMod.Mesh, rotationMesh: typings.babylonjs.meshMod.Mesh): Collider = {
    val __obj = js.Dynamic.literal(collider = collider.asInstanceOf[js.Any], rotationMesh = rotationMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collider]
  }
  
  extension [Self <: Collider](x: Self) {
    
    inline def setCollider(value: typings.babylonjs.meshMod.Mesh): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setRotationMesh(value: typings.babylonjs.meshMod.Mesh): Self = StObject.set(x, "rotationMesh", value.asInstanceOf[js.Any])
  }
}
