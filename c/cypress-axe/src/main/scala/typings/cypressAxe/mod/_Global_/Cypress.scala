package typings.cypressAxe.mod._Global_

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Cypress")
@js.native
object Cypress extends js.Object {
  @js.native
  trait Chainable[Subject] extends js.Object {
    def checkA11y(): Unit = js.native
    def checkA11y(context: ElementContext): Unit = js.native
    def checkA11y(context: ElementContext, options: RunOptions): Unit = js.native
    def configureAxe(): Unit = js.native
    def configureAxe(options: RunOptions): Unit = js.native
    def injectAxe(): Unit = js.native
  }
  
}

