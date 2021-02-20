package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFontOptions extends StObject {
  
  var defaultFontColor: js.UndefOr[ChartColor] = js.native
  
  var defaultFontFamily: js.UndefOr[String] = js.native
  
  var defaultFontSize: js.UndefOr[Double] = js.native
  
  var defaultFontStyle: js.UndefOr[String] = js.native
}
object ChartFontOptions {
  
  @scala.inline
  def apply(): ChartFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontOptions]
  }
  
  @scala.inline
  implicit class ChartFontOptionsMutableBuilder[Self <: ChartFontOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFontColor(value: ChartColor): Self = StObject.set(x, "defaultFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFontColorUndefined: Self = StObject.set(x, "defaultFontColor", js.undefined)
    
    @scala.inline
    def setDefaultFontColorVarargs(value: String*): Self = StObject.set(x, "defaultFontColor", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFontFamily(value: String): Self = StObject.set(x, "defaultFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFontFamilyUndefined: Self = StObject.set(x, "defaultFontFamily", js.undefined)
    
    @scala.inline
    def setDefaultFontSize(value: Double): Self = StObject.set(x, "defaultFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFontSizeUndefined: Self = StObject.set(x, "defaultFontSize", js.undefined)
    
    @scala.inline
    def setDefaultFontStyle(value: String): Self = StObject.set(x, "defaultFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFontStyleUndefined: Self = StObject.set(x, "defaultFontStyle", js.undefined)
  }
}
