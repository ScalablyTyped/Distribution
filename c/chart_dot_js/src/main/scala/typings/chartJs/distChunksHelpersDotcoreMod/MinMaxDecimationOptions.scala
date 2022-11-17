package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinMaxDecimationOptions
  extends StObject
     with BaseDecimationOptions {
  
  var algorithm: "min-max"
}
object MinMaxDecimationOptions {
  
  inline def apply(enabled: Boolean): MinMaxDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "min-max", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxDecimationOptions]
  }
  
  extension [Self <: MinMaxDecimationOptions](x: Self) {
    
    inline def setAlgorithm(value: "min-max"): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
  }
}
