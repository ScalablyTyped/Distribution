package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.appview
import typings.chromeApps.chromeAppsStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  /**
    * ❗ document.close is not available in packaged apps. ❗
    */
  def close(): Unit = js.native
  
  /**
    * ❗ document.cookie is not available in packaged apps. ❗
    * Packaged app pages are not rendered on the server, so there is no need to use these.
    */
  var cookie: String = js.native
  
  @JSName("createElement")
  def createElement_appview(element: appview): HTMLAppViewElement = js.native
  @JSName("createElement")
  def createElement_webview(element: webview): HTMLWebViewElement = js.native
  
  /**
    * ❗ document.open is not available in packaged apps. ❗
    */
  def open(): Document = js.native
  def open(url: String): Document = js.native
  def open(url: String, name: String): Document = js.native
  def open(url: String, name: String, features: String): Document = js.native
  def open(url: String, name: String, features: String, replace: Boolean): Document = js.native
  def open(url: String, name: String, features: Unit, replace: Boolean): Document = js.native
  def open(url: String, name: Unit, features: String): Document = js.native
  def open(url: String, name: Unit, features: String, replace: Boolean): Document = js.native
  def open(url: String, name: Unit, features: Unit, replace: Boolean): Document = js.native
  def open(url: Unit, name: String): Document = js.native
  def open(url: Unit, name: String, features: String): Document = js.native
  def open(url: Unit, name: String, features: String, replace: Boolean): Document = js.native
  def open(url: Unit, name: String, features: Unit, replace: Boolean): Document = js.native
  def open(url: Unit, name: Unit, features: String): Document = js.native
  def open(url: Unit, name: Unit, features: String, replace: Boolean): Document = js.native
  def open(url: Unit, name: Unit, features: Unit, replace: Boolean): Document = js.native
  
  /**
    * ❗ document.write is not available in packaged apps. ❗
    */
  def write(content: String*): Unit = js.native
}
