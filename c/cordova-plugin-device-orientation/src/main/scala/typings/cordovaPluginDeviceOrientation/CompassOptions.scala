package typings.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassOptions extends StObject {
  
  var filter: js.UndefOr[Double] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
}
object CompassOptions {
  
  inline def apply(): CompassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassOptions]
  }
  
  extension [Self <: CompassOptions](x: Self) {
    
    inline def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
