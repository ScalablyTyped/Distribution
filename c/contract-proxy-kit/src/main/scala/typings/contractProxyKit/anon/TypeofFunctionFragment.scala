package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.utils.FunctionFragment
import typings.ethersprojectAbi.libFragmentsMod.JsonFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFunctionFragment
  extends StObject
     with Instantiable2[/* constructorGuard */ Any, /* params */ Any, FunctionFragment] {
  
  def from(value: String): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  def from(value: typings.ethersprojectAbi.libFragmentsMod.FunctionFragment): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  def from(value: JsonFragment): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  
  def fromObject(value: typings.ethersprojectAbi.libFragmentsMod.FunctionFragment): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  def fromObject(value: JsonFragment): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  
  def fromString(value: String): typings.ethersprojectAbi.libFragmentsMod.FunctionFragment = js.native
  
  def isFunctionFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
}
