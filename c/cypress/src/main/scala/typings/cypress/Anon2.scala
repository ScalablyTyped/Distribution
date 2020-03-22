package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  def defaults(options: PartialScreenshotDefaults): Unit
}

object Anon2 {
  @scala.inline
  def apply(defaults: PartialScreenshotDefaults => Unit): Anon2 = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[Anon2]
  }
}

