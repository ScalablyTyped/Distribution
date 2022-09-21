package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circle extends StObject {
  
  /**
    * A single point geometry, specifying the center of the circle, using WGS 84 coordinates, in the form [longitude, latitude].
    */
  var Center: Position
  
  /**
    * The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
    */
  var Radius: Double
}
object Circle {
  
  inline def apply(Center: Position, Radius: Double): Circle = {
    val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  extension [Self <: Circle](x: Self) {
    
    inline def setCenter(value: Position): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "Center", js.Array(value*))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
  }
}
