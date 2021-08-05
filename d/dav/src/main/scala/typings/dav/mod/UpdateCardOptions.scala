package typings.dav.mod

import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCardOptions extends StObject {
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}
object UpdateCardOptions {
  
  inline def apply(): UpdateCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCardOptions]
  }
  
  extension [Self <: UpdateCardOptions](x: Self) {
    
    inline def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
