package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewOptions
  extends StObject
     with BaseOptions {
  
  var url: js.UndefOr[String] = js.undefined
}
object NewOptions {
  
  inline def apply(): NewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewOptions]
  }
  
  extension [Self <: NewOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
