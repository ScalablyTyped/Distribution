package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepAliveOptions extends StObject {
  
  /**
    * When true, connections will be kept alive for multiple requests.
    * Defaults to true.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
}
object KeepAliveOptions {
  
  inline def apply(): KeepAliveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepAliveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeepAliveOptions] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
