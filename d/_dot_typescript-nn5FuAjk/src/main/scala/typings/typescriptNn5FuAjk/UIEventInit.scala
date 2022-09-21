package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIEventInit
  extends StObject
     with EventInit {
  
  var detail: js.UndefOr[Double] = js.undefined
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  /** @deprecated */
  var which: js.UndefOr[Double] = js.undefined
}
object UIEventInit {
  
  inline def apply(): UIEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIEventInit]
  }
  
  extension [Self <: UIEventInit](x: Self) {
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
  }
}
