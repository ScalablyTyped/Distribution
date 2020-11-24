package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.utils.Interface
import typings.ethersprojectAbi.abiCoderMod.AbiCoder
import typings.ethersprojectAbi.fragmentsMod.EventFragment
import typings.ethersprojectAbi.fragmentsMod.FunctionFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInterface extends Instantiable1[/* fragments */ String, Interface] {
  
  def getAbiCoder(): AbiCoder = js.native
  
  def getAddress(address: String): String = js.native
  
  def getEventTopic(eventFragment: EventFragment): String = js.native
  
  def getSighash(functionFragment: FunctionFragment): String = js.native
  
  def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
}
