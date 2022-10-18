package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxVector3 extends StObject {
  
  var max: Vector3
  
  var min: Vector3
}
object MaxVector3 {
  
  inline def apply(max: Vector3, min: Vector3): MaxVector3 = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxVector3]
  }
  
  extension [Self <: MaxVector3](x: Self) {
    
    inline def setMax(value: Vector3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Vector3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
