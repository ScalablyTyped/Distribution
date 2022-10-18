package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.providers.UrlJsonRpcProvider
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUrlJsonRpcProvider
  extends StObject
     with Instantiable0[UrlJsonRpcProvider] {
  
  def getApiKey(apiKey: Any): Any = js.native
  
  def getUrl(network: Network, apiKey: Any): String | ConnectionInfo = js.native
}
