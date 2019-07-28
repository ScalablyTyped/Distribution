package typings.cleanDashCss

import typings.cleanDashCss.cleanDashCssNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  /**
    * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
    */
  var returnPromise: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(returnPromise: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (returnPromise != null) __obj.updateDynamic("returnPromise")(returnPromise)
    __obj.asInstanceOf[Anon_False]
  }
}

