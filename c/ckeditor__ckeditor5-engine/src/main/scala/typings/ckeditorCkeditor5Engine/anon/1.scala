package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var includeSelf: js.UndefOr[Boolean] = js.undefined
}

object `1` {
  @scala.inline
  def apply(includeSelf: js.UndefOr[Boolean] = js.undefined): `1` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

