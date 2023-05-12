package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipModel[Model] extends StObject {
  
  var tooltip: Model
}
object TooltipModel {
  
  inline def apply[Model](tooltip: Model): TooltipModel[Model] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipModel[Model]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipModel[?], Model] (val x: Self & TooltipModel[Model]) extends AnyVal {
    
    inline def setTooltip(value: Model): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
