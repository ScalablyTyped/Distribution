package typings.bootstrapSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeHighlight extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object RangeHighlight {
  
  @scala.inline
  def apply(): RangeHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeHighlight]
  }
  
  @scala.inline
  implicit class RangeHighlightMutableBuilder[Self <: RangeHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
