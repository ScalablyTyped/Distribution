package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typings.ethers.mod.ethers.utils.Fragment
import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFragment
  extends Instantiable2[/* constructorGuard */ js.Any, /* params */ js.Any, Fragment] {
  
  def from(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromObject(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
}
