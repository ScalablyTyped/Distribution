package typings.cypressDashAxe.cypressDashAxeMod.Global.CypressNs

import typings.axeDashCore.axeDashCoreMod.ElementContext
import typings.axeDashCore.axeDashCoreMod.RunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chainable[Subject] extends js.Object {
  def checkA11y(): Unit = js.native
  def checkA11y(context: ElementContext): Unit = js.native
  def checkA11y(context: ElementContext, options: RunOptions): Unit = js.native
  def configureAxe(): Unit = js.native
  def configureAxe(options: RunOptions): Unit = js.native
  def injectAxe(): Unit = js.native
}

