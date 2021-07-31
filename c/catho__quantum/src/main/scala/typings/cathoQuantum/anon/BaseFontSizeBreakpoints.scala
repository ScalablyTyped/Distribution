package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeBreakpoints extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.undefined
  
  var breakpoints: js.UndefOr[js.Object] = js.undefined
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var components: js.UndefOr[Snackbar] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object BaseFontSizeBreakpoints {
  
  @scala.inline
  def apply(): BaseFontSizeBreakpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSizeBreakpoints]
  }
  
  @scala.inline
  implicit class BaseFontSizeBreakpointsMutableBuilder[Self <: BaseFontSizeBreakpoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setComponents(value: Snackbar): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
