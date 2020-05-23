package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cooked extends js.Object {
  var cooked: String
  var raw: String
}

object Cooked {
  @scala.inline
  def apply(cooked: String, raw: String): Cooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooked]
  }
}

