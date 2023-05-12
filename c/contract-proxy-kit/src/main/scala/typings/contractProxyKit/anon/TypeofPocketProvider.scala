package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.PocketProvider
import typings.ethers.typesProvidersNetworkMod.Network
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPocketProvider
  extends StObject
     with Instantiable0[PocketProvider] {
  
  /**
    *  Returns a prepared request for connecting to %%network%% with
    *  %%applicationId%%.
    */
  def getRequest(network: Network): FetchRequest = js.native
  def getRequest(network: Network, applicationId: String): FetchRequest = js.native
  def getRequest(network: Network, applicationId: String, applicationSecret: String): FetchRequest = js.native
  def getRequest(network: Network, applicationId: Null, applicationSecret: String): FetchRequest = js.native
  def getRequest(network: Network, applicationId: Unit, applicationSecret: String): FetchRequest = js.native
}
