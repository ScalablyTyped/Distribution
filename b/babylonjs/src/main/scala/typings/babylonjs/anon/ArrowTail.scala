package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowTail extends StObject {
  
  var arrowMesh: typings.babylonjs.BABYLON.Mesh
  
  var arrowTail: typings.babylonjs.BABYLON.Mesh
}
object ArrowTail {
  
  inline def apply(arrowMesh: typings.babylonjs.BABYLON.Mesh, arrowTail: typings.babylonjs.BABYLON.Mesh): ArrowTail = {
    val __obj = js.Dynamic.literal(arrowMesh = arrowMesh.asInstanceOf[js.Any], arrowTail = arrowTail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowTail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowTail] (val x: Self) extends AnyVal {
    
    inline def setArrowMesh(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "arrowMesh", value.asInstanceOf[js.Any])
    
    inline def setArrowTail(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "arrowTail", value.asInstanceOf[js.Any])
  }
}
