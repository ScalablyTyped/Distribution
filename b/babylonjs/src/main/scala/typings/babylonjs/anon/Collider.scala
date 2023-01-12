package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collider extends StObject {
  
  var collider: typings.babylonjs.meshesMeshMod.Mesh
  
  var rotationMesh: typings.babylonjs.meshesMeshMod.Mesh
}
object Collider {
  
  inline def apply(collider: typings.babylonjs.meshesMeshMod.Mesh, rotationMesh: typings.babylonjs.meshesMeshMod.Mesh): Collider = {
    val __obj = js.Dynamic.literal(collider = collider.asInstanceOf[js.Any], rotationMesh = rotationMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collider] (val x: Self) extends AnyVal {
    
    inline def setCollider(value: typings.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setRotationMesh(value: typings.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "rotationMesh", value.asInstanceOf[js.Any])
  }
}
