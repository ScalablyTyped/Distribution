package typings.convertSourceMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiline extends js.Object {
  var multiline: js.UndefOr[Boolean] = js.undefined
}

object Multiline {
  @scala.inline
  def apply(multiline: js.UndefOr[Boolean] = js.undefined): Multiline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiline]
  }
}

