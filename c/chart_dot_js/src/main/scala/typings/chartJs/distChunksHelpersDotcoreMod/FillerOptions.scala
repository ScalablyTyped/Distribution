package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillerOptions extends StObject {
  
  var drawTime: "beforeDatasetDraw" | "beforeDatasetsDraw"
  
  var propagate: Boolean
}
object FillerOptions {
  
  inline def apply(drawTime: "beforeDatasetDraw" | "beforeDatasetsDraw", propagate: Boolean): FillerOptions = {
    val __obj = js.Dynamic.literal(drawTime = drawTime.asInstanceOf[js.Any], propagate = propagate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillerOptions]
  }
  
  extension [Self <: FillerOptions](x: Self) {
    
    inline def setDrawTime(value: "beforeDatasetDraw" | "beforeDatasetsDraw"): Self = StObject.set(x, "drawTime", value.asInstanceOf[js.Any])
    
    inline def setPropagate(value: Boolean): Self = StObject.set(x, "propagate", value.asInstanceOf[js.Any])
  }
}
