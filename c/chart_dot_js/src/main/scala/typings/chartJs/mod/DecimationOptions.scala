package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.mod.LttbDecimationOptions
  - typings.chartJs.mod.MinMaxDecimationOptions
*/
trait DecimationOptions extends StObject
object DecimationOptions {
  
  inline def LttbDecimationOptions(enabled: Boolean): typings.chartJs.mod.LttbDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "lttb", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chartJs.mod.LttbDecimationOptions]
  }
  
  inline def MinMaxDecimationOptions(enabled: Boolean): typings.chartJs.mod.MinMaxDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "min-max", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chartJs.mod.MinMaxDecimationOptions]
  }
}
