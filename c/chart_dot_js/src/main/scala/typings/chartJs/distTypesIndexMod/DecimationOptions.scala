package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.distTypesIndexMod.LttbDecimationOptions
  - typings.chartJs.distTypesIndexMod.MinMaxDecimationOptions
*/
trait DecimationOptions extends StObject
object DecimationOptions {
  
  inline def LttbDecimationOptions(enabled: Boolean): typings.chartJs.distTypesIndexMod.LttbDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "lttb", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chartJs.distTypesIndexMod.LttbDecimationOptions]
  }
  
  inline def MinMaxDecimationOptions(enabled: Boolean): typings.chartJs.distTypesIndexMod.MinMaxDecimationOptions = {
    val __obj = js.Dynamic.literal(algorithm = "min-max", enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.chartJs.distTypesIndexMod.MinMaxDecimationOptions]
  }
}
