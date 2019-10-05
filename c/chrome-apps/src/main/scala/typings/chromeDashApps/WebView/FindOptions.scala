package typings.chromeDashApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOptions extends js.Object {
  /**
    * Flag to find matches in reverse order.
    * @default false
    */
  var backward: js.UndefOr[Boolean] = js.undefined
  /**
    * Flag to match with case-sensitivity.
    * @default false
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply(backward: js.UndefOr[Boolean] = js.undefined, matchCase: js.UndefOr[Boolean] = js.undefined): FindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backward)) __obj.updateDynamic("backward")(backward)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    __obj.asInstanceOf[FindOptions]
  }
}

