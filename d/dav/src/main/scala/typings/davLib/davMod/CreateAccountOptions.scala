package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOptions extends js.Object {
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[davLib.davLibStrings.caldav | davLib.davLibStrings.carddav] = js.undefined
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.undefined
  /**
    *  some url for server (needn't be base url).
    */
  var server: java.lang.String
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * request sender.
    */
  var xhr: js.UndefOr[davLib.davMod.transportNs.Transport] = js.undefined
}

object CreateAccountOptions {
  @scala.inline
  def apply(
    server: java.lang.String,
    accountType: davLib.davLibStrings.caldav | davLib.davLibStrings.carddav = null,
    filters: js.Array[js.Object] = null,
    loadCollections: js.UndefOr[scala.Boolean] = js.undefined,
    loadObjects: js.UndefOr[scala.Boolean] = js.undefined,
    sandbox: Sandbox | js.Object = null,
    timezone: java.lang.String = null,
    xhr: davLib.davMod.transportNs.Transport = null
  ): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server)
    if (accountType != null) __obj.updateDynamic("accountType")(accountType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(loadCollections)) __obj.updateDynamic("loadCollections")(loadCollections)
    if (!js.isUndefined(loadObjects)) __obj.updateDynamic("loadObjects")(loadObjects)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CreateAccountOptions]
  }
}

