package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsContext extends StObject {
  
  /**
    * The value of the serverName key in a TLS authorization request.
    */
  var serverName: js.UndefOr[ServerName] = js.undefined
}
object TlsContext {
  
  inline def apply(): TlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsContext]
  }
  
  extension [Self <: TlsContext](x: Self) {
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
  }
}
