package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.Fragment
import typings.ethers.typesAbiFragmentsMod.FragmentType
import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFragment
  extends StObject
     with Instantiable3[/* guard */ Any, /* type */ FragmentType, /* inputs */ js.Array[ParamType], Fragment] {
  
  /**
    *  Creates a new **Fragment** for %%obj%%, wich can be any supported
    *  ABI frgament type.
    */
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.Fragment = js.native
  
  /**
    *  Returns true if %%value%% is a [[ConstructorFragment]].
    */
  def isConstructor(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = js.native
  
  /**
    *  Returns true if %%value%% is an [[ErrorFragment]].
    */
  def isError(value: Any): /* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean = js.native
  
  /**
    *  Returns true if %%value%% is an [[EventFragment]].
    */
  def isEvent(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = js.native
  
  /**
    *  Returns true if %%value%% is a [[FunctionFragment]].
    */
  def isFunction(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = js.native
  
  /**
    *  Returns true if %%value%% is a [[StructFragment]].
    */
  def isStruct(value: Any): /* is ethers.ethers/types/abi/fragments.StructFragment */ Boolean = js.native
}
