package typings.atBabelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: js.UndefOr[String] = js.undefined
  var raw: String
}

object Anon_Cooked {
  @scala.inline
  def apply(raw: String, cooked: String = null): Anon_Cooked = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (cooked != null) __obj.updateDynamic("cooked")(cooked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cooked]
  }
}

