package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parseable extends js.Object {
  var parse: js.UndefOr[js.Any] = js.undefined
}

object Parseable {
  @scala.inline
  def apply(parse: js.Any = null): Parseable = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parseable]
  }
}

