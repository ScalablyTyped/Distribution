package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedClientOptions extends StObject {
  
  /**
    * Options to disable keep alive.
    */
  var keepAliveOptions: js.UndefOr[KeepAliveOptions] = js.undefined
  
  /**
    * Options to redirect requests.
    */
  var redirectOptions: js.UndefOr[RedirectOptions] = js.undefined
}
object ExtendedClientOptions {
  
  inline def apply(): ExtendedClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedClientOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepAliveOptions(value: KeepAliveOptions): Self = StObject.set(x, "keepAliveOptions", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveOptionsUndefined: Self = StObject.set(x, "keepAliveOptions", js.undefined)
    
    inline def setRedirectOptions(value: RedirectOptions): Self = StObject.set(x, "redirectOptions", value.asInstanceOf[js.Any])
    
    inline def setRedirectOptionsUndefined: Self = StObject.set(x, "redirectOptions", js.undefined)
  }
}
