package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable4
import typings.ethers.mod.ethers.ConstructorFragment
import typings.ethers.typesAbiFragmentsMod.FragmentType
import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofConstructorFragment
  extends StObject
     with Instantiable4[
      /* guard */ Any, 
      /* type */ FragmentType, 
      /* inputs */ js.Array[ParamType], 
      /* payable */ Boolean, 
      ConstructorFragment
    ] {
  
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ConstructorFragment = js.native
  
  def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = js.native
}
