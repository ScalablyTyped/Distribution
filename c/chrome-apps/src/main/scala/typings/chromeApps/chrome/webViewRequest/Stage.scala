package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.onBeforeRequest
  - typings.chromeApps.chromeAppsStrings.onBeforeSendHeaders
  - typings.chromeApps.chromeAppsStrings.onHeadersReceived
  - typings.chromeApps.chromeAppsStrings.onAuthRequired
*/
trait Stage extends js.Object

object Stage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAuthRequired: typings.chromeApps.chromeAppsStrings.onAuthRequired = this.cast("onAuthRequired")
  @scala.inline
  def onBeforeRequest: typings.chromeApps.chromeAppsStrings.onBeforeRequest = this.cast("onBeforeRequest")
  @scala.inline
  def onBeforeSendHeaders: typings.chromeApps.chromeAppsStrings.onBeforeSendHeaders = this.cast("onBeforeSendHeaders")
  @scala.inline
  def onHeadersReceived: typings.chromeApps.chromeAppsStrings.onHeadersReceived = this.cast("onHeadersReceived")
}

