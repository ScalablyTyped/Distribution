package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlightDuration extends StObject {
  
  var flightDuration: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var scene: typings.cesium.mod.Scene = js.native
  
  var url: js.UndefOr[String] = js.native
}
object FlightDuration {
  
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene): FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightDuration]
  }
  
  @scala.inline
  implicit class FlightDurationMutableBuilder[Self <: FlightDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
