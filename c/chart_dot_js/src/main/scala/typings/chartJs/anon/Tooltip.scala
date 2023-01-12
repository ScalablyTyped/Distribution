package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip[Model] extends StObject {
  
  var tooltip: Model
}
object Tooltip {
  
  inline def apply[Model](tooltip: Model): Tooltip[Model] = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip[Model]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip[?], Model] (val x: Self & Tooltip[Model]) extends AnyVal {
    
    inline def setTooltip(value: Model): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
