package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.Network
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNetwork
  extends StObject
     with Instantiable2[/* name */ String, /* chainId */ BigNumberish, Network] {
  
  /**
    *  Returns a new Network for the %%network%% name or chainId.
    */
  def from(): typings.ethers.typesProvidersNetworkMod.Network = js.native
  def from(network: Networkish): typings.ethers.typesProvidersNetworkMod.Network = js.native
  
  /**
    *  Register %%nameOrChainId%% with a function which returns
    *  an instance of a Network representing that chain.
    */
  def register(nameOrChainId: String, networkFunc: js.Function0[this.type]): Unit = js.native
  def register(nameOrChainId: js.BigInt, networkFunc: js.Function0[this.type]): Unit = js.native
  def register(nameOrChainId: Double, networkFunc: js.Function0[this.type]): Unit = js.native
}
