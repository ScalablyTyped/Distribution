package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  def defaults(options: PartialServerOptions): Unit
}

object Defaults {
  @scala.inline
  def apply(defaults: PartialServerOptions => Unit): Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[Defaults]
  }
}

