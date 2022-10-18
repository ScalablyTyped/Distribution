package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.providers.InfuraProvider
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInfuraProvider
  extends StObject
     with Instantiable0[InfuraProvider] {
  
  def getApiKey(apiKey: Any): Any = js.native
  
  def getUrl(network: Network, apiKey: Any): ConnectionInfo = js.native
  
  def getWebSocketProvider(): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Unit, apiKey: Any): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish, apiKey: Any): InfuraWebSocketProvider = js.native
}
