package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorsComponentsSpacing extends StObject {
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var components: js.UndefOr[Tag] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object ColorsComponentsSpacing {
  
  inline def apply(): ColorsComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsComponentsSpacing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorsComponentsSpacing] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setComponents(value: Tag): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
