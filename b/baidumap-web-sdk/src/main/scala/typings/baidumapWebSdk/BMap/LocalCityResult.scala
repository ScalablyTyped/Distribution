package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalCityResult extends StObject {
  
  var center: Point
  
  var level: Double
  
  var name: String
}
object LocalCityResult {
  
  inline def apply(center: Point, level: Double, name: String): LocalCityResult = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalCityResult]
  }
  
  extension [Self <: LocalCityResult](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
