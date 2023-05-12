package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsStrings.`min-max`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinMaxDecimationOptions
  extends StObject
     with BaseDecimationOptions
     with DecimationOptions {
  
  var algorithm: `min-max`
}
object MinMaxDecimationOptions {
  
  inline def apply(enabled: Boolean): MinMaxDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "min-max", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxDecimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinMaxDecimationOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: `min-max`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
  }
}
