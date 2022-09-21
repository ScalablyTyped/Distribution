package typings.chartJs.mod

import typings.chartJs.chartJsStrings.lttb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LttbDecimationOptions
  extends StObject
     with BaseDecimationOptions
     with DecimationOptions {
  
  var algorithm: lttb
  
  var samples: js.UndefOr[Double] = js.undefined
}
object LttbDecimationOptions {
  
  inline def apply(enabled: Boolean): LttbDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "lttb", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LttbDecimationOptions]
  }
  
  extension [Self <: LttbDecimationOptions](x: Self) {
    
    inline def setAlgorithm(value: lttb): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
  }
}
