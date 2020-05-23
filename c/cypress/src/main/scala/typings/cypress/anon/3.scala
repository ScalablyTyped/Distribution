package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  def defaults(options: PartialScreenshotDefaults): Unit
}

object `3` {
  @scala.inline
  def apply(defaults: PartialScreenshotDefaults => Unit): `3` = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[`3`]
  }
}

