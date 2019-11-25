package typings.convertDashSourceDashMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multiline extends js.Object {
  var multiline: js.UndefOr[Boolean] = js.undefined
}

object Anon_Multiline {
  @scala.inline
  def apply(multiline: js.UndefOr[Boolean] = js.undefined): Anon_Multiline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multiline]
  }
}

