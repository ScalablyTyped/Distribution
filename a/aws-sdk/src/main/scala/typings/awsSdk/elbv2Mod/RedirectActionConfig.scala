package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectActionConfig extends js.Object {
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
    */
  var Host: js.UndefOr[RedirectActionHost] = js.native
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
    */
  var Path: js.UndefOr[RedirectActionPath] = js.native
  /**
    * The port. You can specify a value from 1 to 65535 or #{port}.
    */
  var Port: js.UndefOr[RedirectActionPort] = js.native
  /**
    * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
    */
  var Protocol: js.UndefOr[RedirectActionProtocol] = js.native
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it is automatically added. You can specify any of the reserved keywords.
    */
  var Query: js.UndefOr[RedirectActionQuery] = js.native
  /**
    * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
    */
  var StatusCode: RedirectActionStatusCodeEnum = js.native
}

object RedirectActionConfig {
  @scala.inline
  def apply(StatusCode: RedirectActionStatusCodeEnum): RedirectActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectActionConfig]
  }
  @scala.inline
  implicit class RedirectActionConfigOps[Self <: RedirectActionConfig] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: RedirectActionStatusCodeEnum): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: RedirectActionHost): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    @scala.inline
    def setPath(value: RedirectActionPath): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    @scala.inline
    def setPort(value: RedirectActionPort): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setProtocol(value: RedirectActionProtocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setQuery(value: RedirectActionQuery): Self = this.set("Query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("Query", js.undefined)
  }
  
}

