package typings.contractProxyKit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ethers.jsonRpcProviderMod.JsonRpcProvider
import typings.ethers.providerMod.Provider
import typings.ethers.typesMod.AsyncProvider
import typings.ethers.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproviders extends js.Object {
  var EtherscanProvider: Instantiable0[typings.ethers.mod.ethers.providers.EtherscanProvider] = js.native
  var FallbackProvider: Instantiable1[
    /* providers */ js.Array[Provider], 
    typings.ethers.mod.ethers.providers.FallbackProvider
  ] = js.native
  var InfuraProvider: Instantiable0[typings.ethers.mod.ethers.providers.InfuraProvider] = js.native
  var IpcProvider: Instantiable1[/* path */ String, typings.ethers.mod.ethers.providers.IpcProvider] = js.native
  var JsonRpcProvider: TypeofJsonRpcProvider = js.native
  var JsonRpcSigner: Instantiable1[/* provider */ JsonRpcProvider, typings.ethers.mod.ethers.providers.JsonRpcSigner] = js.native
  var Provider: TypeofProvider = js.native
  var Web3Provider: Instantiable1[/* web3Provider */ AsyncProvider, typings.ethers.mod.ethers.providers.Web3Provider] = js.native
  def getDefaultProvider(): Provider = js.native
  def getDefaultProvider(network: String): Provider = js.native
  def getDefaultProvider(network: Network): Provider = js.native
}

