package typings.dav.davMod

import typings.dav.davMod.transportNs.Transport
import typings.dav.davStrings.basic
import typings.dav.davStrings.webdav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncCalendarOptions extends js.Object {
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * either 'basic' or 'webdav'. If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.undefined
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object SyncCalendarOptions {
  @scala.inline
  def apply(
    filters: js.Array[js.Object] = null,
    sandbox: Sandbox = null,
    syncMethod: basic | webdav = null,
    timezone: String = null,
    xhr: Transport = null
  ): SyncCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (syncMethod != null) __obj.updateDynamic("syncMethod")(syncMethod.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[SyncCalendarOptions]
  }
}

