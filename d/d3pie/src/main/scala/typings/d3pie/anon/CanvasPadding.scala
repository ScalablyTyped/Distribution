package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPadding extends StObject {
  
  var canvasPadding: js.UndefOr[Bottom] = js.undefined
  
  var colors: js.UndefOr[Background] = js.undefined
  
  var cssPrefix: js.UndefOr[String] = js.undefined
  
  var gradient: js.UndefOr[ColorEnabled] = js.undefined
  
  var pieCenterOffset: js.UndefOr[X] = js.undefined
}
object CanvasPadding {
  
  @scala.inline
  def apply(): CanvasPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasPadding]
  }
  
  @scala.inline
  implicit class CanvasPaddingMutableBuilder[Self <: CanvasPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasPadding(value: Bottom): Self = StObject.set(x, "canvasPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasPaddingUndefined: Self = StObject.set(x, "canvasPadding", js.undefined)
    
    @scala.inline
    def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    @scala.inline
    def setGradient(value: ColorEnabled): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setPieCenterOffset(value: X): Self = StObject.set(x, "pieCenterOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieCenterOffsetUndefined: Self = StObject.set(x, "pieCenterOffset", js.undefined)
  }
}
