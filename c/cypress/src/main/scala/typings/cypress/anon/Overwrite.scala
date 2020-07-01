package typings.cypress.anon

import typings.cypress.Cypress.CanReturnChainable
import typings.cypress.Cypress.CommandOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overwrite extends js.Object {
  def add(name: String, fn: js.Function1[/* repeated */ js.Any, CanReturnChainable]): Unit = js.native
  def add(name: String, options: CommandOptions, fn: js.Function1[/* repeated */ js.Any, CanReturnChainable]): Unit = js.native
  def overwrite(name: String, fn: js.Function1[/* repeated */ js.Any, CanReturnChainable]): Unit = js.native
}

