package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var segmentStroke: js.UndefOr[String] = js.undefined
  
  var segments: js.UndefOr[js.Array[String]] = js.undefined
}
object Background {
  
  inline def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setSegmentStroke(value: String): Self = StObject.set(x, "segmentStroke", value.asInstanceOf[js.Any])
    
    inline def setSegmentStrokeUndefined: Self = StObject.set(x, "segmentStroke", js.undefined)
    
    inline def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
