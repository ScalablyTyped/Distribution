package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ButtonMap options for alerts modals */
trait BootboxAlertButtonMap
  extends StObject
     with BootboxButtonMap {
  
  var ok: BootboxButton | js.Function
}
object BootboxAlertButtonMap {
  
  inline def apply(ok: BootboxButton | js.Function): BootboxAlertButtonMap = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxAlertButtonMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootboxAlertButtonMap] (val x: Self) extends AnyVal {
    
    inline def setOk(value: BootboxButton | js.Function): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
