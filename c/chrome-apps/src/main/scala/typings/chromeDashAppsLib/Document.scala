package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
       * ❗ document.cookie is not available in packaged apps. ❗
       * Packaged app pages are not rendered on the server, so there is no need to use these.
       */
  var cookie: java.lang.String = js.native
  /**
       * ❗ document.close is not available in packaged apps. ❗
       */
  def close(): scala.Unit = js.native
  @JSName("createElement")
  def createElement_appview(element: chromeDashAppsLib.chromeDashAppsLibStrings.appview): HTMLAppViewElement = js.native
  @JSName("createElement")
  def createElement_webview(element: chromeDashAppsLib.chromeDashAppsLibStrings.webview): HTMLWebViewElement = js.native
  /**
       * ❗ document.open is not available in packaged apps. ❗
       */
  def open(): Document = js.native
  /**
       * ❗ document.open is not available in packaged apps. ❗
       */
  def open(url: java.lang.String): Document = js.native
  /**
       * ❗ document.open is not available in packaged apps. ❗
       */
  def open(url: java.lang.String, name: java.lang.String): Document = js.native
  /**
       * ❗ document.open is not available in packaged apps. ❗
       */
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): Document = js.native
  /**
       * ❗ document.open is not available in packaged apps. ❗
       */
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String, replace: scala.Boolean): Document = js.native
  /**
       * ❗ document.write is not available in packaged apps. ❗
       */
  def write(content: java.lang.String*): scala.Unit = js.native
}

