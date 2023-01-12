package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityImdsOptionsMod {
  
  trait ImdsOptions extends StObject {
    
    var headers: js.UndefOr[Metadata] = js.undefined
    
    var proxyUrl: js.UndefOr[String] = js.undefined
  }
  object ImdsOptions {
    
    inline def apply(): ImdsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImdsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImdsOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Metadata): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    }
  }
}
