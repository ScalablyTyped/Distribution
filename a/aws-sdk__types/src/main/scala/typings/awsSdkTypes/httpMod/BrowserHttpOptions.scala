package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserHttpOptions extends HttpOptions {
  var requestTimeout: js.UndefOr[Double] = js.undefined
}

object BrowserHttpOptions {
  @scala.inline
  def apply(requestTimeout: js.UndefOr[Double] = js.undefined): BrowserHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserHttpOptions]
  }
}

