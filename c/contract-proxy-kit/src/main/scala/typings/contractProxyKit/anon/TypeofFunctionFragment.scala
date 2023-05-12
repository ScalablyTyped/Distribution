package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable5
import typings.contractProxyKit.contractProxyKitStrings.nonpayable
import typings.contractProxyKit.contractProxyKitStrings.payable
import typings.contractProxyKit.contractProxyKitStrings.pure
import typings.contractProxyKit.contractProxyKitStrings.view
import typings.ethers.mod.ethers.FunctionFragment
import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFunctionFragment
  extends StObject
     with Instantiable5[
      /* guard */ Any, 
      /* name */ String, 
      /* stateMutability */ payable | nonpayable | view | pure, 
      /* inputs */ js.Array[ParamType], 
      /* outputs */ js.Array[ParamType], 
      FunctionFragment
    ] {
  
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FunctionFragment = js.native
  
  def getSelector(name: String): String = js.native
  def getSelector(name: String, params: js.Array[Any]): String = js.native
  
  def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = js.native
}
