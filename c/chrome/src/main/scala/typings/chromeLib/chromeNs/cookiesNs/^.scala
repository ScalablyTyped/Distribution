package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies")
@js.native
object ^ extends js.Object {
  var onChanged: CookieChangedEvent = js.native
  def get(details: Details, callback: js.Function1[/* cookie */ Cookie | scala.Null, scala.Unit]): scala.Unit = js.native
  def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], scala.Unit]): scala.Unit = js.native
  def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], scala.Unit]): scala.Unit = js.native
  def remove(details: Details): scala.Unit = js.native
  def remove(details: Details, callback: js.Function1[/* details */ Details, scala.Unit]): scala.Unit = js.native
  def set(details: SetDetails): scala.Unit = js.native
  def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | scala.Null, scala.Unit]): scala.Unit = js.native
}

