package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataColorPalette extends StObject {
  
  /**
    * The hexadecimal codes for the colors.
    */
  var Colors: js.UndefOr[ColorList] = js.undefined
  
  /**
    * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
    */
  var EmptyFillColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The minimum and maximum hexadecimal codes that describe a color gradient. 
    */
  var MinMaxGradient: js.UndefOr[ColorList] = js.undefined
}
object DataColorPalette {
  
  @scala.inline
  def apply(): DataColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataColorPalette]
  }
  
  @scala.inline
  implicit class DataColorPaletteMutableBuilder[Self <: DataColorPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: ColorList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: HexColor*): Self = StObject.set(x, "Colors", js.Array(value :_*))
    
    @scala.inline
    def setEmptyFillColor(value: HexColor): Self = StObject.set(x, "EmptyFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyFillColorUndefined: Self = StObject.set(x, "EmptyFillColor", js.undefined)
    
    @scala.inline
    def setMinMaxGradient(value: ColorList): Self = StObject.set(x, "MinMaxGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMaxGradientUndefined: Self = StObject.set(x, "MinMaxGradient", js.undefined)
    
    @scala.inline
    def setMinMaxGradientVarargs(value: HexColor*): Self = StObject.set(x, "MinMaxGradient", js.Array(value :_*))
  }
}
