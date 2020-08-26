package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait HttpClient extends Http_ {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`0`] = js.native
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.native
}

object HttpClient {
  @scala.inline
  def apply(): HttpClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClient]
  }
  @scala.inline
  implicit class HttpClientOps[Self <: HttpClient] (val x: Self) extends AnyVal {
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
    def setHooks(value: `0`): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setSplitByDomain(value: Boolean): Self = this.set("splitByDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitByDomain: Self = this.set("splitByDomain", js.undefined)
  }
  
}

