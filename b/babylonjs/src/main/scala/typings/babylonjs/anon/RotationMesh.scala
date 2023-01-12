package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationMesh extends StObject {
  
  var collider: typings.babylonjs.BABYLON.Mesh
  
  var rotationMesh: typings.babylonjs.BABYLON.Mesh
}
object RotationMesh {
  
  inline def apply(collider: typings.babylonjs.BABYLON.Mesh, rotationMesh: typings.babylonjs.BABYLON.Mesh): RotationMesh = {
    val __obj = js.Dynamic.literal(collider = collider.asInstanceOf[js.Any], rotationMesh = rotationMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotationMesh] (val x: Self) extends AnyVal {
    
    inline def setCollider(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setRotationMesh(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "rotationMesh", value.asInstanceOf[js.Any])
  }
}
