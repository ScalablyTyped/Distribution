package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.ethers.utilsMod.Logger
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import typings.ethersprojectWordlists.wordlistMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofethers extends js.Object {
  
  var BigNumber: TypeofBigNumber = js.native
  
  var Contract: TypeofContract = js.native
  
  var ContractFactory: TypeofContractFactory = js.native
  
  var FixedNumber: TypeofFixedNumber = js.native
  
  var Signer: TypeofSigner = js.native
  
  var VoidSigner: Instantiable1[/* address */ String, typings.ethers.mod.ethers.VoidSigner] = js.native
  
  var Wallet: TypeofWallet = js.native
  
  var Wordlist: TypeofWordlist = js.native
  
  val constants: Typeofconstants = js.native
  
  def getDefaultProvider(): BaseProvider = js.native
  def getDefaultProvider(network: js.UndefOr[scala.Nothing], options: js.Any): BaseProvider = js.native
  def getDefaultProvider(network: String): BaseProvider = js.native
  def getDefaultProvider(network: String, options: js.Any): BaseProvider = js.native
  def getDefaultProvider(network: Network): BaseProvider = js.native
  def getDefaultProvider(network: Network, options: js.Any): BaseProvider = js.native
  
  val logger: Logger = js.native
  
  val providers: Typeofproviders = js.native
  
  val utils: Typeofutils = js.native
  
  val version: /* "ethers/5.0.21" */ String = js.native
  
  val wordlists: StringDictionary[Wordlist] = js.native
}
