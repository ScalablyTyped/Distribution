package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libBaseProviderMod.BaseProvider
import typings.ethersprojectProviders.libFallbackProviderMod.FallbackProviderConfig
import typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider
import typings.ethersprojectProviders.libWeb3ProviderMod.ExternalProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofproviders extends StObject {
  
  var AlchemyProvider: TypeofAlchemyProvider = js.native
  
  var AlchemyWebSocketProvider: Instantiable0[typings.ethers.mod.ethers.providers.AlchemyWebSocketProvider] = js.native
  
  var AnkrProvider: TypeofAnkrProvider = js.native
  
  var BaseProvider: TypeofBaseProvider = js.native
  
  var CloudflareProvider: TypeofCloudflareProvider = js.native
  
  var EtherscanProvider: Instantiable0[typings.ethers.mod.ethers.providers.EtherscanProvider] = js.native
  
  var FallbackProvider: Instantiable1[
    /* providers */ js.Array[Provider | FallbackProviderConfig], 
    typings.ethers.mod.ethers.providers.FallbackProvider
  ] = js.native
  
  var Formatter: TypeofFormatter = js.native
  
  var InfuraProvider: TypeofInfuraProvider = js.native
  
  var InfuraWebSocketProvider: Instantiable0[typings.ethers.mod.ethers.providers.InfuraWebSocketProvider] = js.native
  
  var IpcProvider: Instantiable1[/* path */ String, typings.ethers.mod.ethers.providers.IpcProvider] = js.native
  
  var JsonRpcBatchProvider: Instantiable0[typings.ethers.mod.ethers.providers.JsonRpcBatchProvider] = js.native
  
  var JsonRpcProvider: TypeofJsonRpcProvider = js.native
  
  var JsonRpcSigner: Instantiable2[
    /* constructorGuard */ Any, 
    /* provider */ JsonRpcProvider, 
    typings.ethers.mod.ethers.providers.JsonRpcSigner
  ] = js.native
  
  var NodesmithProvider: TypeofNodesmithProvider = js.native
  
  var PocketProvider: TypeofPocketProvider = js.native
  
  var Provider: TypeofProvider = js.native
  
  var Resolver: Instantiable3[
    /* provider */ BaseProvider, 
    /* address */ String, 
    /* name */ String, 
    typings.ethers.mod.ethers.providers.Resolver
  ] = js.native
  
  var StaticJsonRpcProvider: Instantiable0[typings.ethers.mod.ethers.providers.StaticJsonRpcProvider] = js.native
  
  var UrlJsonRpcProvider: TypeofUrlJsonRpcProvider = js.native
  
  var Web3Provider: Instantiable1[/* provider */ ExternalProvider, typings.ethers.mod.ethers.providers.Web3Provider] = js.native
  
  var WebSocketProvider: TypeofWebSocketProvider = js.native
  
  def getDefaultProvider(): BaseProvider = js.native
  def getDefaultProvider(network: Unit, options: Any): BaseProvider = js.native
  def getDefaultProvider(network: Networkish): BaseProvider = js.native
  def getDefaultProvider(network: Networkish, options: Any): BaseProvider = js.native
  
  def getNetwork(network: Networkish): Network = js.native
  
  def isCommunityResourcable(value: Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = js.native
  
  def isCommunityResource(value: Any): Boolean = js.native
  
  def showThrottleMessage(): Unit = js.native
}
