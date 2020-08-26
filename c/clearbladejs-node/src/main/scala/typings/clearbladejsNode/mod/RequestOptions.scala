package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var URI: js.UndefOr[String] = js.native
  var authToken: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var qs: js.UndefOr[String] = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var useUser: js.UndefOr[Boolean] = js.native
  var user: js.UndefOr[APIUser] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(systemKey: String, systemSecret: String): RequestOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURI: Self = this.set("URI", js.undefined)
    @scala.inline
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setQs(value: String): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setUseUser(value: Boolean): Self = this.set("useUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUser: Self = this.set("useUser", js.undefined)
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

