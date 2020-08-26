package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpContext extends js.Object {
  /**
    * The header keys and values in an HTTP authorization request.
    */
  var headers: js.UndefOr[HttpHeaders] = js.native
  /**
    * The query string keys and values in an HTTP authorization request.
    */
  var queryString: js.UndefOr[HttpQueryString] = js.native
}

object HttpContext {
  @scala.inline
  def apply(): HttpContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpContext]
  }
  @scala.inline
  implicit class HttpContextOps[Self <: HttpContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setQueryString(value: HttpQueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
  }
  
}

