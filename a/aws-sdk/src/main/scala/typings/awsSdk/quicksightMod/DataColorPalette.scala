package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataColorPalette extends js.Object {
  
  /**
    * The hexadecimal codes for the colors.
    */
  var Colors: js.UndefOr[ColorList] = js.native
  
  /**
    * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
    */
  var EmptyFillColor: js.UndefOr[HexColor] = js.native
  
  /**
    * The minimum and maximum hexadecimal codes that describe a color gradient. 
    */
  var MinMaxGradient: js.UndefOr[ColorList] = js.native
}
object DataColorPalette {
  
  @scala.inline
  def apply(): DataColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataColorPalette]
  }
  
  @scala.inline
  implicit class DataColorPaletteOps[Self <: DataColorPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorsVarargs(value: HexColor*): Self = this.set("Colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: ColorList): Self = this.set("Colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("Colors", js.undefined)
    
    @scala.inline
    def setEmptyFillColor(value: HexColor): Self = this.set("EmptyFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyFillColor: Self = this.set("EmptyFillColor", js.undefined)
    
    @scala.inline
    def setMinMaxGradientVarargs(value: HexColor*): Self = this.set("MinMaxGradient", js.Array(value :_*))
    
    @scala.inline
    def setMinMaxGradient(value: ColorList): Self = this.set("MinMaxGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMaxGradient: Self = this.set("MinMaxGradient", js.undefined)
  }
}
