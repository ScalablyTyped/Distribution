package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable4
import typings.ethers.mod.ethers.EventFragment
import typings.ethers.typesAbiFragmentsMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEventFragment
  extends StObject
     with Instantiable4[
      /* guard */ Any, 
      /* name */ String, 
      /* inputs */ js.Array[ParamType], 
      /* anonymous */ Boolean, 
      EventFragment
    ] {
  
  def from(obj: Any): typings.ethers.typesAbiFragmentsMod.EventFragment = js.native
  
  def getTopicHash(name: String): String = js.native
  def getTopicHash(name: String, params: js.Array[Any]): String = js.native
  
  def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = js.native
}
