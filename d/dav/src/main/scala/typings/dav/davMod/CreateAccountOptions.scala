package typings.dav.davMod

import typings.dav.davMod.transport.Transport
import typings.dav.davStrings.caldav
import typings.dav.davStrings.carddav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOptions extends js.Object {
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[caldav | carddav] = js.undefined
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[Boolean] = js.undefined
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[Boolean] = js.undefined
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.undefined
  /**
    *  some url for server (needn't be base url).
    */
  var server: String
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}

object CreateAccountOptions {
  @scala.inline
  def apply(
    server: String,
    accountType: caldav | carddav = null,
    filters: js.Array[js.Object] = null,
    loadCollections: js.UndefOr[Boolean] = js.undefined,
    loadObjects: js.UndefOr[Boolean] = js.undefined,
    sandbox: Sandbox | js.Object = null,
    timezone: String = null,
    xhr: Transport = null
  ): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    if (accountType != null) __obj.updateDynamic("accountType")(accountType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(loadCollections)) __obj.updateDynamic("loadCollections")(loadCollections.asInstanceOf[js.Any])
    if (!js.isUndefined(loadObjects)) __obj.updateDynamic("loadObjects")(loadObjects.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOptions]
  }
}

