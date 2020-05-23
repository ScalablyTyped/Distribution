package typings.coreJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Escape extends js.Object {
  def escape(str: String): String
}

object Escape {
  @scala.inline
  def apply(escape: String => String): Escape = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[Escape]
  }
}

