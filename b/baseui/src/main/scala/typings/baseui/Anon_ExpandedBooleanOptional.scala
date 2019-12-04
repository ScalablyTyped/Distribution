package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandedBooleanOptional extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExpandedBooleanOptional {
  @scala.inline
  def apply(expanded: js.UndefOr[Boolean] = js.undefined): Anon_ExpandedBooleanOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpandedBooleanOptional]
  }
}

