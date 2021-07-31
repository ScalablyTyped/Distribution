package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorsSpacing extends StObject {
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object ColorsSpacing {
  
  @scala.inline
  def apply(): ColorsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsSpacing]
  }
  
  @scala.inline
  implicit class ColorsSpacingMutableBuilder[Self <: ColorsSpacing] (val x: Self) extends AnyVal {
    
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
