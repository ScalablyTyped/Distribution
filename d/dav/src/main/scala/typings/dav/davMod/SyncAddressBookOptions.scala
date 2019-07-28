package typings.dav.davMod

import typings.dav.davMod.transportNs.Transport
import typings.dav.davStrings.basic
import typings.dav.davStrings.webdav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncAddressBookOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  /**
    * either 'basic' or 'webdav'.If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object SyncAddressBookOptions {
  @scala.inline
  def apply(sandbox: Sandbox = null, syncMethod: basic | webdav = null, xhr: Transport = null): SyncAddressBookOptions = {
    val __obj = js.Dynamic.literal()
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (syncMethod != null) __obj.updateDynamic("syncMethod")(syncMethod.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[SyncAddressBookOptions]
  }
}

