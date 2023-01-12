package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  var alterPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var useHostName: js.UndefOr[Boolean] = js.undefined
}
object BaseOptions {
  
  inline def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
    inline def setAlterPath(value: /* path */ String => String): Self = StObject.set(x, "alterPath", js.Any.fromFunction1(value))
    
    inline def setAlterPathUndefined: Self = StObject.set(x, "alterPath", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setUseHostName(value: Boolean): Self = StObject.set(x, "useHostName", value.asInstanceOf[js.Any])
    
    inline def setUseHostNameUndefined: Self = StObject.set(x, "useHostName", js.undefined)
  }
}
