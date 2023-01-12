package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareMenuOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}
object ShareMenuOptions {
  
  inline def apply(): ShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    inline def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
