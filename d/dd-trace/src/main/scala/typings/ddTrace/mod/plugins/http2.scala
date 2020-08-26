package typings.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [http2](https://nodejs.org/api/http2.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ddTrace.mod.Analyzable because Already inherited
- typings.ddTrace.mod.plugins.Integration because Already inherited
- typings.ddTrace.mod.plugins.Http_ because Already inherited
- typings.ddTrace.mod.plugins.Http2Server because var conflicts: analytics, blacklist, enabled, headers, service, validateStatus, whitelist. Inlined  */ @js.native
trait http2 extends Http2Client {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[Http2Client] = js.native
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[Http2Server] = js.native
}

object http2 {
  @scala.inline
  def apply(): http2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http2]
  }
  @scala.inline
  implicit class http2Ops[Self <: http2] (val x: Self) extends AnyVal {
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
    def setClient(value: Http2Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setServer(value: Http2Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

