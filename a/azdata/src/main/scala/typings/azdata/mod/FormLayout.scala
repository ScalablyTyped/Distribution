package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormLayout extends StObject {
  
  var height: js.UndefOr[Double | String] = js.native
  
  var padding: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object FormLayout {
  
  @scala.inline
  def apply(): FormLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormLayout]
  }
  
  @scala.inline
  implicit class FormLayoutMutableBuilder[Self <: FormLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
