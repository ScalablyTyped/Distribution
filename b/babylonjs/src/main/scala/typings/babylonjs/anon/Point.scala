package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var body: Any
  
  var point: Nullable[Vector3]
}
object Point {
  
  inline def apply(body: Any): Point = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], point = null)
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Nullable[Vector3]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointNull: Self = StObject.set(x, "point", null)
  }
}
