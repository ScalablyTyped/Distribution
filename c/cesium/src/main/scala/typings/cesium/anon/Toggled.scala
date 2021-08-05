package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toggled extends StObject {
  
  var toggled: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object Toggled {
  
  inline def apply(): Toggled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toggled]
  }
  
  extension [Self <: Toggled](x: Self) {
    
    inline def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
    
    inline def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
