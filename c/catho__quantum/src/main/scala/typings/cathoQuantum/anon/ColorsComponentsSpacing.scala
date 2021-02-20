package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorsComponentsSpacing extends StObject {
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[Tag] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object ColorsComponentsSpacing {
  
  @scala.inline
  def apply(): ColorsComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsComponentsSpacing]
  }
  
  @scala.inline
  implicit class ColorsComponentsSpacingMutableBuilder[Self <: ColorsComponentsSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setComponents(value: Tag): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
