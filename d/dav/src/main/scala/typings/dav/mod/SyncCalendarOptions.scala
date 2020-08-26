package typings.dav.mod

import typings.dav.davStrings.basic
import typings.dav.davStrings.webdav
import typings.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncCalendarOptions extends js.Object {
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  /**
    * either 'basic' or 'webdav'. If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.native
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}

object SyncCalendarOptions {
  @scala.inline
  def apply(): SyncCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncCalendarOptions]
  }
  @scala.inline
  implicit class SyncCalendarOptionsOps[Self <: SyncCalendarOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: js.Object*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[js.Object]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setSandbox(value: Sandbox): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setSyncMethod(value: basic | webdav): Self = this.set("syncMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncMethod: Self = this.set("syncMethod", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setXhr(value: Transport): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

