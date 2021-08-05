package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickSegment extends StObject {
  
  var onClickSegment: js.UndefOr[js.Function] = js.undefined
  
  var onMouseoutSegment: js.UndefOr[js.Function] = js.undefined
  
  var onMouseoverSegment: js.UndefOr[js.Function] = js.undefined
  
  var onload: js.UndefOr[js.Function] = js.undefined
}
object OnClickSegment {
  
  inline def apply(): OnClickSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClickSegment]
  }
  
  extension [Self <: OnClickSegment](x: Self) {
    
    inline def setOnClickSegment(value: js.Function): Self = StObject.set(x, "onClickSegment", value.asInstanceOf[js.Any])
    
    inline def setOnClickSegmentUndefined: Self = StObject.set(x, "onClickSegment", js.undefined)
    
    inline def setOnMouseoutSegment(value: js.Function): Self = StObject.set(x, "onMouseoutSegment", value.asInstanceOf[js.Any])
    
    inline def setOnMouseoutSegmentUndefined: Self = StObject.set(x, "onMouseoutSegment", js.undefined)
    
    inline def setOnMouseoverSegment(value: js.Function): Self = StObject.set(x, "onMouseoverSegment", value.asInstanceOf[js.Any])
    
    inline def setOnMouseoverSegmentUndefined: Self = StObject.set(x, "onMouseoverSegment", js.undefined)
    
    inline def setOnload(value: js.Function): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
  }
}
