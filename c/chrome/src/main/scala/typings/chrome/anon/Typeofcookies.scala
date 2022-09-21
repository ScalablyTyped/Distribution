package typings.chrome.anon

import typings.chrome.chrome.cookies.Cookie
import typings.chrome.chrome.cookies.CookieChangedEvent
import typings.chrome.chrome.cookies.CookieStore
import typings.chrome.chrome.cookies.Details
import typings.chrome.chrome.cookies.GetAllDetails
import typings.chrome.chrome.cookies.SetDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcookies extends StObject {
  
  def get(details: Details): js.Promise[Cookie | Null] = js.native
  def get(details: Details, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
  
  def getAll(details: GetAllDetails): js.Promise[js.Array[Cookie]] = js.native
  def getAll(details: GetAllDetails, callback: js.Function1[/* cookies */ js.Array[Cookie], Unit]): Unit = js.native
  
  def getAllCookieStores(): js.Promise[js.Array[CookieStore]] = js.native
  def getAllCookieStores(callback: js.Function1[/* cookieStores */ js.Array[CookieStore], Unit]): Unit = js.native
  
  var onChanged: CookieChangedEvent = js.native
  
  def remove(details: Details): Unit = js.native
  def remove(details: Details, callback: js.Function1[/* details */ Details, Unit]): Unit = js.native
  @JSName("remove")
  def remove_Promise(details: Details): js.Promise[Details] = js.native
  
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
  @JSName("set")
  def set_Promise(details: SetDetails): js.Promise[Cookie | Null] = js.native
}
