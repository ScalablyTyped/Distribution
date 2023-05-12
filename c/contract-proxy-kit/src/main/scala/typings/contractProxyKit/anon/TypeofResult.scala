package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResult
  extends StObject
     with Instantiable1[/* args (repeated) */ Any, Result] {
  
  /**
    *  Creates a new [[Result]] for %%items%% with each entry
    *  also accessible by its corresponding name in %%keys%%.
    */
  def fromItems(items: js.Array[Any]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
  def fromItems(items: js.Array[Any], keys: js.Array[Null | String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
}
