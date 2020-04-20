package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def defaults(options: PartialScreenshotDefaults): Unit
}

object Anon0 {
  @scala.inline
  def apply(defaults: PartialScreenshotDefaults => Unit): Anon0 = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[Anon0]
  }
}

