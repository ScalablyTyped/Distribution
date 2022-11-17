package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable[Model] extends StObject {
  
  var cancelable: true
  
  var tooltip: Model
}
object Cancelable {
  
  inline def apply[Model](tooltip: Model): Cancelable[Model] = {
    val __obj = js.Dynamic.literal(cancelable = true, tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable[Model]]
  }
  
  extension [Self <: Cancelable[?], Model](x: Self & Cancelable[Model]) {
    
    inline def setCancelable(value: true): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Model): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
