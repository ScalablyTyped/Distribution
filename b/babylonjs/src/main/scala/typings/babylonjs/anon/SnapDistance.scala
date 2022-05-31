package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapDistance extends StObject {
  
  var snapDistance: Double
}
object SnapDistance {
  
  inline def apply(snapDistance: Double): SnapDistance = {
    val __obj = js.Dynamic.literal(snapDistance = snapDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapDistance]
  }
  
  extension [Self <: SnapDistance](x: Self) {
    
    inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
  }
}
