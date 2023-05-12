package typings.chromeRemoteInterface.mod

import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.ConsoleApi
import typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi.SchemaApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedDomains extends StObject {
  
  /** @deprecated This domain is deprecated - use Runtime or Log instead. */
  var Console: ConsoleApi
  
  /** @deprecated This domain is deprecated. */
  var Schema: SchemaApi
}
object DeprecatedDomains {
  
  inline def apply(Console: ConsoleApi, Schema: SchemaApi): DeprecatedDomains = {
    val __obj = js.Dynamic.literal(Console = Console.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedDomains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedDomains] (val x: Self) extends AnyVal {
    
    inline def setConsole(value: ConsoleApi): Self = StObject.set(x, "Console", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: SchemaApi): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
  }
}
