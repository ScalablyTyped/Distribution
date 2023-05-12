package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typings.ethers.mod.ethers.FallbackFragment
import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFallbackFragment
  extends StObject
     with Instantiable3[
      /* guard */ Any, 
      /* inputs */ js.Array[ParamType], 
      /* payable */ Boolean, 
      FallbackFragment
    ] {
  
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FallbackFragment = js.native
  
  def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean = js.native
}
