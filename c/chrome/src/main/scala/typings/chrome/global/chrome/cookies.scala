package typings.chrome.global.chrome

import typings.chrome.chrome.cookies.Cookie
import typings.chrome.chrome.cookies.CookieChangedEvent
import typings.chrome.chrome.cookies.CookieStore
import typings.chrome.chrome.cookies.Details
import typings.chrome.chrome.cookies.GetAllDetails
import typings.chrome.chrome.cookies.SetDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Cookies
////////////////////
/**
  * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
  * Availability: Since Chrome 6.
  * Permissions:  "cookies", host permissions
  */
@JSGlobal("chrome.cookies")
@js.native
object cookies extends js.Object {
  var onChanged: CookieChangedEvent = js.native
  def get(details: Details, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
  def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], Unit]): Unit = js.native
  def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], Unit]): Unit = js.native
  def remove(details: Details): Unit = js.native
  def remove(details: Details, callback: js.Function1[/* details */ Details, Unit]): Unit = js.native
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
}

