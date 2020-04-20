package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaults extends js.Object {
  def defaults(options: PartialServerOptions): Unit
}

object AnonDefaults {
  @scala.inline
  def apply(defaults: PartialServerOptions => Unit): AnonDefaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[AnonDefaults]
  }
}

