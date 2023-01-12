package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowMesh extends StObject {
  
  var arrowMesh: typings.babylonjs.meshesMeshMod.Mesh
  
  var arrowTail: typings.babylonjs.meshesMeshMod.Mesh
}
object ArrowMesh {
  
  inline def apply(arrowMesh: typings.babylonjs.meshesMeshMod.Mesh, arrowTail: typings.babylonjs.meshesMeshMod.Mesh): ArrowMesh = {
    val __obj = js.Dynamic.literal(arrowMesh = arrowMesh.asInstanceOf[js.Any], arrowTail = arrowTail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowMesh] (val x: Self) extends AnyVal {
    
    inline def setArrowMesh(value: typings.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "arrowMesh", value.asInstanceOf[js.Any])
    
    inline def setArrowTail(value: typings.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "arrowTail", value.asInstanceOf[js.Any])
  }
}
