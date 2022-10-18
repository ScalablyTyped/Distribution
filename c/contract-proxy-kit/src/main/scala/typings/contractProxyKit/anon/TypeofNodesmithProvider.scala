package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.providers.NodesmithProvider
import typings.ethersprojectNetworks.libTypesMod.Network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNodesmithProvider
  extends StObject
     with Instantiable0[NodesmithProvider] {
  
  def getApiKey(apiKey: Any): Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: Any): String = js.native
}
