package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.providers.AlchemyProvider
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlchemyProvider
  extends StObject
     with Instantiable0[AlchemyProvider] {
  
  def getApiKey(apiKey: Any): Any = js.native
  
  def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
  
  def getWebSocketProvider(): AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Unit, apiKey: Any): AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish, apiKey: Any): AlchemyWebSocketProvider = js.native
}
