package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsContext extends StObject {
  
  /**
    * The value of the serverName key in a TLS authorization request.
    */
  var serverName: js.UndefOr[ServerName] = js.native
}
object TlsContext {
  
  @scala.inline
  def apply(): TlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsContext]
  }
  
  @scala.inline
  implicit class TlsContextMutableBuilder[Self <: TlsContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
  }
}
