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
  
  @scala.inline
  def apply(): ClientSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSendOptions]
  }
  
  @scala.inline
  implicit class ClientSendOptionsMutableBuilder[Self <: ClientSendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
