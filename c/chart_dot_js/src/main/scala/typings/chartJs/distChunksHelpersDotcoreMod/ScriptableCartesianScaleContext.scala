package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableCartesianScaleContext extends StObject {
  
  var scale: "linear" | "logarithmic" | "category" | "time" | "timeseries"
  
  var `type`: String
}
object ScriptableCartesianScaleContext {
  
  inline def apply(scale: "linear" | "logarithmic" | "category" | "time" | "timeseries", `type`: String): ScriptableCartesianScaleContext = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableCartesianScaleContext]
  }
  
  extension [Self <: ScriptableCartesianScaleContext](x: Self) {
    
    inline def setScale(value: "linear" | "logarithmic" | "category" | "time" | "timeseries"): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
