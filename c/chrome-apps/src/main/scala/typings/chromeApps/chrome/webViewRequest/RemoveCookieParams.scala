package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T Filter type
  */
trait RemoveCookieParams[T] extends js.Object {
  /**
    * Filter for cookies that will be removed.
    * All empty entries are ignored.
    */
  var filter: T
}

object RemoveCookieParams {
  @scala.inline
  def apply[T](filter: T): RemoveCookieParams[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCookieParams[T]]
  }
}

