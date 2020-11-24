package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.ContractFactory
import typings.ethersprojectAbi.mod.Interface
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectContracts.anon.Nonce
import typings.ethersprojectContracts.mod.Contract
import typings.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContractFactory extends Instantiable2[/* contractInterface */ ContractInterface, /* bytecode */ BytesLike, ContractFactory] {
  
  def fromSolidity(compilerOutput: js.Any): typings.ethersprojectContracts.mod.ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: Signer): typings.ethersprojectContracts.mod.ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): Contract = js.native
  def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
