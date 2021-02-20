package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConfiguration extends StObject {
  
  /**
    * Color properties that apply to chart data colors.
    */
  var DataColorPalette: js.UndefOr[typings.awsSdk.quicksightMod.DataColorPalette] = js.native
  
  /**
    * Display options related to sheets.
    */
  var Sheet: js.UndefOr[SheetStyle] = js.native
  
  /**
    * Color properties that apply to the UI and to charts, excluding the colors that apply to data. 
    */
  var UIColorPalette: js.UndefOr[typings.awsSdk.quicksightMod.UIColorPalette] = js.native
}
object ThemeConfiguration {
  
  @scala.inline
  def apply(): ThemeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeConfiguration]
  }
  
  @scala.inline
  implicit class ThemeConfigurationMutableBuilder[Self <: ThemeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataColorPalette(value: DataColorPalette): Self = StObject.set(x, "DataColorPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataColorPaletteUndefined: Self = StObject.set(x, "DataColorPalette", js.undefined)
    
    @scala.inline
    def setSheet(value: SheetStyle): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "Sheet", js.undefined)
    
    @scala.inline
    def setUIColorPalette(value: UIColorPalette): Self = StObject.set(x, "UIColorPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIColorPaletteUndefined: Self = StObject.set(x, "UIColorPalette", js.undefined)
  }
}
