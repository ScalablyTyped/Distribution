package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaLabelOptions extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Point] = js.undefined
}
object PanoramaLabelOptions {
  
  inline def apply(): PanoramaLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaLabelOptions]
  }
  
  extension [Self <: PanoramaLabelOptions](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
