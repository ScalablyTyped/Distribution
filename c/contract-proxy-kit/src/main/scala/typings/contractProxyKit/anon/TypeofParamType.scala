package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable4
import typings.ethers.mod.ethers.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofParamType
  extends StObject
     with Instantiable4[/* guard */ Any, /* name */ String, /* type */ String, /* baseType */ String, ParamType] {
  
  /**
    *  Creates a new **ParamType** for %%obj%%.
    *
    *  If %%allowIndexed%% then the ``indexed`` keyword is permitted,
    *  otherwise the ``indexed`` keyword will throw an error.
    */
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ParamType = js.native
  def from(obj: Any, allowIndexed: Boolean): typings.ethers.typesAbiFragmentsMod.ParamType = js.native
  
  /**
    *  Returns true if %%value%% is a **ParamType**.
    */
  def isParamType(value: Any): /* is ethers.ethers/types/abi/fragments.ParamType */ Boolean = js.native
}
