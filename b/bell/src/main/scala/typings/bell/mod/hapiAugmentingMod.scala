package typings.bell.mod

import typings.bell.bellStrings.`try`
import typings.bell.bellStrings.bell
import typings.bell.bellStrings.optional
import typings.bell.bellStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("hapi", JSImport.Namespace)
@js.native
object hapiAugmentingMod extends js.Object {
  
  @js.native
  trait ServerAuth extends js.Object {
    
    def strategy(name: String, scheme: bell, mode: `try`, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: bell, mode: optional, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: bell, mode: required, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: bell, mode: Boolean, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit = js.native
  }
}
