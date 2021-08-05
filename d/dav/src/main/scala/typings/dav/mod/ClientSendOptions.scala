package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSendOptions extends StObject {
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  
  /**
    * relative url for request.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ClientSendOptions {
  
  inline def apply(): ClientSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSendOptions]
  }
  
  extension [Self <: ClientSendOptions](x: Self) {
    
    inline def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
