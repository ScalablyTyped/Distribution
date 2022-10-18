package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.utils.Fragment
import typings.ethersprojectAbi.libFragmentsMod.JsonFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFragment
  extends StObject
     with Instantiable2[/* constructorGuard */ Any, /* params */ Any, Fragment] {
  
  def from(value: String): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  def from(value: typings.ethersprojectAbi.libFragmentsMod.Fragment): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  def from(value: JsonFragment): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  
  def fromObject(value: typings.ethersprojectAbi.libFragmentsMod.Fragment): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  def fromObject(value: JsonFragment): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  
  def fromString(value: String): typings.ethersprojectAbi.libFragmentsMod.Fragment = js.native
  
  def isFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
}
