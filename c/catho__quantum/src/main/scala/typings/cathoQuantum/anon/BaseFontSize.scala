package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFontSize extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.native
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object BaseFontSize {
  
  @scala.inline
  def apply(): BaseFontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSize]
  }
  
  @scala.inline
  implicit class BaseFontSizeMutableBuilder[Self <: BaseFontSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
