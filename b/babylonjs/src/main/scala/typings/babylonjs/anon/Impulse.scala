package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impulse extends StObject {
  
  var body: Any
  
  var distance: Double
  
  var impulse: Double
  
  var normal: Nullable[Vector3]
  
  var point: Nullable[Vector3]
}
object Impulse {
  
  inline def apply(body: Any, distance: Double, impulse: Double): Impulse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], impulse = impulse.asInstanceOf[js.Any], normal = null, point = null)
    __obj.asInstanceOf[Impulse]
  }
  
  extension [Self <: Impulse](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setImpulse(value: Double): Self = StObject.set(x, "impulse", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Nullable[Vector3]): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalNull: Self = StObject.set(x, "normal", null)
    
    inline def setPoint(value: Nullable[Vector3]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointNull: Self = StObject.set(x, "point", null)
  }
}
