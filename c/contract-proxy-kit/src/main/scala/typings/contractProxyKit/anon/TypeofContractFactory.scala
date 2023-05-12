package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.ContractFactory
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContractFactory
  extends StObject
     with Instantiable2[
      /* abi */ Interface, 
      /* bytecode */ BytesLike, 
      ContractFactory[js.Array[Any], js.Object]
    ] {
  
  def fromSolidity[A /* <: js.Array[Any] */, I](output: Any): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = js.native
  def fromSolidity[A /* <: js.Array[Any] */, I](output: Any, runner: ContractRunner): typings.ethers.typesContractFactoryMod.ContractFactory[A, I] = js.native
}
