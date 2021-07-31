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
  
  @scala.inline
  def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setSegmentStroke(value: String): Self = StObject.set(x, "segmentStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentStrokeUndefined: Self = StObject.set(x, "segmentStroke", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
