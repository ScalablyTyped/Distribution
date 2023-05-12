package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.QuickNodeProvider
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofQuickNodeProvider
  extends StObject
     with Instantiable0[QuickNodeProvider] {
  
  /**
    *  Returns a new request prepared for %%network%% and the
    *  %%token%%.
    */
  def getRequest(network: Network): FetchRequest = js.native
  def getRequest(network: Network, token: String): FetchRequest = js.native
}
