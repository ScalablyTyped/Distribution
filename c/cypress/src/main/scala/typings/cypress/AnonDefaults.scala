package typings.cypress

import typings.cypress.cypressMod.Cypress.ServerOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaults extends js.Object {
  def defaults(options: Partial[ServerOptions]): Unit
}

object AnonDefaults {
  @scala.inline
  def apply(defaults: Partial[ServerOptions] => Unit): AnonDefaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[AnonDefaults]
  }
}

