package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowMesh extends StObject {
  
  var arrowMesh: typings.babylonjs.meshMod.Mesh
  
  var arrowTail: typings.babylonjs.meshMod.Mesh
}
object ArrowMesh {
  
  inline def apply(arrowMesh: typings.babylonjs.meshMod.Mesh, arrowTail: typings.babylonjs.meshMod.Mesh): ArrowMesh = {
    val __obj = js.Dynamic.literal(arrowMesh = arrowMesh.asInstanceOf[js.Any], arrowTail = arrowTail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowMesh]
  }
  
  extension [Self <: ArrowMesh](x: Self) {
    
    inline def setArrowMesh(value: typings.babylonjs.meshMod.Mesh): Self = StObject.set(x, "arrowMesh", value.asInstanceOf[js.Any])
    
    inline def setArrowTail(value: typings.babylonjs.meshMod.Mesh): Self = StObject.set(x, "arrowTail", value.asInstanceOf[js.Any])
  }
}
