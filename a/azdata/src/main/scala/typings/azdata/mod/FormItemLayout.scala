package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormItemLayout extends StObject {
  
  var componentHeight: js.UndefOr[Double | String] = js.native
  
  var componentWidth: js.UndefOr[Double | String] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var info: js.UndefOr[String] = js.native
  
  var titleFontSize: js.UndefOr[Double | String] = js.native
}
object FormItemLayout {
  
  @scala.inline
  def apply(): FormItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLayout]
  }
  
  @scala.inline
  implicit class FormItemLayoutMutableBuilder[Self <: FormItemLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentHeight(value: Double | String): Self = StObject.set(x, "componentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentHeightUndefined: Self = StObject.set(x, "componentHeight", js.undefined)
    
    @scala.inline
    def setComponentWidth(value: Double | String): Self = StObject.set(x, "componentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentWidthUndefined: Self = StObject.set(x, "componentWidth", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double | String): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
  }
}
