package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.contractProxyKit.contractProxyKitStrings.addListener
import typings.contractProxyKit.contractProxyKitStrings.buildClass
import typings.contractProxyKit.contractProxyKitStrings.connect
import typings.contractProxyKit.contractProxyKitStrings.constructor
import typings.contractProxyKit.contractProxyKitStrings.deploymentTransaction
import typings.contractProxyKit.contractProxyKitStrings.emit
import typings.contractProxyKit.contractProxyKitStrings.fallback
import typings.contractProxyKit.contractProxyKitStrings.filters
import typings.contractProxyKit.contractProxyKitStrings.from
import typings.contractProxyKit.contractProxyKitStrings.getAddress
import typings.contractProxyKit.contractProxyKitStrings.getDeployedCode
import typings.contractProxyKit.contractProxyKitStrings.getEvent
import typings.contractProxyKit.contractProxyKitStrings.getFunction
import typings.contractProxyKit.contractProxyKitStrings.interface
import typings.contractProxyKit.contractProxyKitStrings.listenerCount
import typings.contractProxyKit.contractProxyKitStrings.listeners
import typings.contractProxyKit.contractProxyKitStrings.off
import typings.contractProxyKit.contractProxyKitStrings.on
import typings.contractProxyKit.contractProxyKitStrings.once
import typings.contractProxyKit.contractProxyKitStrings.queryFilter
import typings.contractProxyKit.contractProxyKitStrings.queryTransaction
import typings.contractProxyKit.contractProxyKitStrings.removeAllListeners
import typings.contractProxyKit.contractProxyKitStrings.removeListener
import typings.contractProxyKit.contractProxyKitStrings.runner
import typings.contractProxyKit.contractProxyKitStrings.target
import typings.contractProxyKit.contractProxyKitStrings.waitForDeployment
import typings.ethers.mod.ethers.BaseContract
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseContract
  extends StObject
     with Instantiable2[/* target */ String, /* abi */ Interface, BaseContract] {
  
  def buildClass[T](abi: InterfaceAbi): Instantiable2[
    /* target */ String, 
    /* runner */ js.UndefOr[Null | ContractRunner], 
    typings.ethers.typesContractContractMod.BaseContract & (Omit[
      T, 
      /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | typings.contractProxyKit.contractProxyKitStrings.buildClass | from
    ])
  ] = js.native
  
  def from[T](target: String, abi: InterfaceAbi): typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.contractProxyKit.contractProxyKitStrings.from
  ]) = js.native
  def from[T](target: String, abi: InterfaceAbi, runner: ContractRunner): typings.ethers.typesContractContractMod.BaseContract & (Omit[
    T, 
    /* keyof ethers.ethers/types/contract/contract.BaseContract */ target | interface | runner | filters | fallback | constructor | connect | getAddress | getDeployedCode | waitForDeployment | deploymentTransaction | getFunction | getEvent | queryTransaction | queryFilter | on | once | emit | listenerCount | listeners | off | removeAllListeners | addListener | removeListener | buildClass | typings.contractProxyKit.contractProxyKitStrings.from
  ]) = js.native
}
