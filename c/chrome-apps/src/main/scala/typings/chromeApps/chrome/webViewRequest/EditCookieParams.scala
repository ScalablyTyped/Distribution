package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T First parameter type
  * @template K Second parameter type
  */
@js.native
trait EditCookieParams[T, K] extends js.Object {
  /**
    * Filter for cookies that will be modified.
    * All empty entries are ignored.
    */
  var filter: T = js.native
  /**
    * Attributes that shall be overridden in cookies that machted the filter
    * Attributes that are set to an empty string are removed.
    */
  var modification: K = js.native
}

object EditCookieParams {
  @scala.inline
  def apply[T, K](filter: T, modification: K): EditCookieParams[T, K] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCookieParams[T, K]]
  }
  @scala.inline
  implicit class EditCookieParamsOps[Self <: EditCookieParams[_, _], T, K] (val x: Self with (EditCookieParams[T, K])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: T): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setModification(value: K): Self = this.set("modification", value.asInstanceOf[js.Any])
  }
  
}

