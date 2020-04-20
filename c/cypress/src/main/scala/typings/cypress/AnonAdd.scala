package typings.cypress

import typings.cypress.mod.Cypress.CommandOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  def add(name: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def add(name: String, options: CommandOptions, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def overwrite(name: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

