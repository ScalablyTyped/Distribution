package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.InfuraProvider
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderInfuraMod.InfuraWebSocketProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInfuraProvider
  extends StObject
     with Instantiable0[InfuraProvider] {
  
  /**
    *  Returns a prepared request for connecting to %%network%%
    *  with %%projectId%% and %%projectSecret%%.
    */
  def getRequest(network: Network): FetchRequest = js.native
  def getRequest(network: Network, projectId: String): FetchRequest = js.native
  def getRequest(network: Network, projectId: String, projectSecret: String): FetchRequest = js.native
  def getRequest(network: Network, projectId: Null, projectSecret: String): FetchRequest = js.native
  def getRequest(network: Network, projectId: Unit, projectSecret: String): FetchRequest = js.native
  
  /**
    *  Creates a new **InfuraWebSocketProvider**.
    */
  def getWebSocketProvider(): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Unit, projectId: String): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish, projectId: String): InfuraWebSocketProvider = js.native
}
