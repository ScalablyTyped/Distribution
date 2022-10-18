package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.BaseContract
import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectContracts.anon.From
import typings.ethersprojectContracts.mod.ContractInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseContract
  extends StObject
     with Instantiable2[/* addressOrName */ String, /* contractInterface */ ContractInterface, BaseContract] {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
