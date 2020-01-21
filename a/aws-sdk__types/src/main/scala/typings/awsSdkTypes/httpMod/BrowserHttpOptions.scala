package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserHttpOptions extends HttpOptions {
  var requestTimeout: js.UndefOr[Double] = js.undefined
}

object BrowserHttpOptions {
  @scala.inline
  def apply(requestTimeout: Int | Double = null): BrowserHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserHttpOptions]
  }
}

