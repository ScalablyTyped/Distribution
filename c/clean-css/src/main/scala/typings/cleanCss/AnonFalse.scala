package typings.cleanCss

import typings.cleanCss.cleanCssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  /**
    * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
    */
  var returnPromise: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(returnPromise: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (returnPromise != null) __obj.updateDynamic("returnPromise")(returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

