package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  * @template T Filter type
  */
@js.native
trait RemoveCookieParams[T] extends js.Object {
  
  /**
    * Filter for cookies that will be removed.
    * All empty entries are ignored.
    */
  var filter: T = js.native
}
object RemoveCookieParams {
  
  @scala.inline
  def apply[T](filter: T): RemoveCookieParams[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCookieParams[T]]
  }
  
  @scala.inline
  implicit class RemoveCookieParamsOps[Self <: RemoveCookieParams[_], T] (val x: Self with RemoveCookieParams[T]) extends AnyVal {
    
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
  }
}
