package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.providers.BaseProvider
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libFormatterMod.Formatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseProvider
  extends StObject
     with Instantiable1[/* network */ Networkish, BaseProvider] {
  
  def getFormatter(): Formatter = js.native
  
  def getNetwork(network: Networkish): Network = js.native
}
