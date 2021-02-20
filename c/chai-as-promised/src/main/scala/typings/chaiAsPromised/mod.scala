package typings.chaiAsPromised

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiAsPromised.Chai.PromisedAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-as-promised", JSImport.Namespace)
  @js.native
  val ^ : ChaiAsPromised = js.native
  
  @js.native
  trait ChaiAsPromised extends ChaiPlugin {
    
    def transferPromiseness(assertion: PromisedAssertion, promise: js.Thenable[_]): Unit = js.native
    
    def transformAsserterArgs(values: js.Array[_]): js.Any = js.native
  }
  
  type _To = ChaiAsPromised
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiAsPromised = ^
}
