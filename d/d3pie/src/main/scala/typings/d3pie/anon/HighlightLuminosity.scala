package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightLuminosity extends StObject {
  
  var highlightLuminosity: js.UndefOr[Double] = js.undefined
  
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined
  
  var load: js.UndefOr[Effect] = js.undefined
  
  var pullOutSegmentOnClick: js.UndefOr[Size] = js.undefined
}
object HighlightLuminosity {
  
  inline def apply(): HighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightLuminosity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightLuminosity] (val x: Self) extends AnyVal {
    
    inline def setHighlightLuminosity(value: Double): Self = StObject.set(x, "highlightLuminosity", value.asInstanceOf[js.Any])
    
    inline def setHighlightLuminosityUndefined: Self = StObject.set(x, "highlightLuminosity", js.undefined)
    
    inline def setHighlightSegmentOnMouseover(value: Boolean): Self = StObject.set(x, "highlightSegmentOnMouseover", value.asInstanceOf[js.Any])
    
    inline def setHighlightSegmentOnMouseoverUndefined: Self = StObject.set(x, "highlightSegmentOnMouseover", js.undefined)
    
    inline def setLoad(value: Effect): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setPullOutSegmentOnClick(value: Size): Self = StObject.set(x, "pullOutSegmentOnClick", value.asInstanceOf[js.Any])
    
    inline def setPullOutSegmentOnClickUndefined: Self = StObject.set(x, "pullOutSegmentOnClick", js.undefined)
  }
}
