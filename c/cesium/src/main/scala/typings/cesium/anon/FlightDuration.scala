package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlightDuration extends StObject {
  
  var flightDuration: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var scene: typings.cesium.mod.Scene
  
  var url: js.UndefOr[String] = js.undefined
}
object FlightDuration {
  
  inline def apply(scene: typings.cesium.mod.Scene): FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightDuration]
  }
  
  extension [Self <: FlightDuration](x: Self) {
    
    inline def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
    
    inline def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
