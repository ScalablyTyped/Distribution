package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCookie extends js.Object {
  var onChanged: chromeLib.chromeNs.cookiesNs.CookieChangedEvent = js.native
  def get(
    details: chromeLib.chromeNs.cookiesNs.Details,
    callback: js.Function1[/* cookie */ chromeLib.chromeNs.cookiesNs.Cookie | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def getAll(
    details: chromeLib.chromeNs.cookiesNs.GetAllDetails,
    callback: js.Function1[/* cookies */ js.Array[chromeLib.chromeNs.cookiesNs.Cookie], scala.Unit]
  ): scala.Unit = js.native
  def getAllCookieStores(
    callback: js.Function1[/* cookieStores */ js.Array[chromeLib.chromeNs.cookiesNs.CookieStore], scala.Unit]
  ): scala.Unit = js.native
  def remove(details: chromeLib.chromeNs.cookiesNs.Details): scala.Unit = js.native
  def remove(
    details: chromeLib.chromeNs.cookiesNs.Details,
    callback: js.Function1[/* details */ chromeLib.chromeNs.cookiesNs.Details, scala.Unit]
  ): scala.Unit = js.native
  def set(details: chromeLib.chromeNs.cookiesNs.SetDetails): scala.Unit = js.native
  def set(
    details: chromeLib.chromeNs.cookiesNs.SetDetails,
    callback: js.Function1[/* cookie */ chromeLib.chromeNs.cookiesNs.Cookie | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

