package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.AlchemyProvider
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlchemyProvider
  extends StObject
     with Instantiable0[AlchemyProvider] {
  
  def getRequest(network: Network): FetchRequest = js.native
  def getRequest(network: Network, apiKey: String): FetchRequest = js.native
}
