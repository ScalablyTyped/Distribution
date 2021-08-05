package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilitiesProvider
  extends StObject
     with DataProvider {
  
  def getServerCapabilities(client: DataProtocolClientCapabilities): Thenable[DataProtocolServerCapabilities]
}
object CapabilitiesProvider {
  
  inline def apply(
    getServerCapabilities: DataProtocolClientCapabilities => Thenable[DataProtocolServerCapabilities],
    providerId: String
  ): CapabilitiesProvider = {
    val __obj = js.Dynamic.literal(getServerCapabilities = js.Any.fromFunction1(getServerCapabilities), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesProvider]
  }
  
  extension [Self <: CapabilitiesProvider](x: Self) {
    
    inline def setGetServerCapabilities(value: DataProtocolClientCapabilities => Thenable[DataProtocolServerCapabilities]): Self = StObject.set(x, "getServerCapabilities", js.Any.fromFunction1(value))
  }
}
