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

