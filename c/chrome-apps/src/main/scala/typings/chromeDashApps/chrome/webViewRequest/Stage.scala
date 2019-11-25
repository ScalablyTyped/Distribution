package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.onBeforeRequest
  - typings.chromeDashApps.chromeDashAppsStrings.onBeforeSendHeaders
  - typings.chromeDashApps.chromeDashAppsStrings.onHeadersReceived
  - typings.chromeDashApps.chromeDashAppsStrings.onAuthRequired
*/
trait Stage extends js.Object

object Stage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAuthRequired: typings.chromeDashApps.chromeDashAppsStrings.onAuthRequired = this.cast("onAuthRequired")
  @scala.inline
  def onBeforeRequest: typings.chromeDashApps.chromeDashAppsStrings.onBeforeRequest = this.cast("onBeforeRequest")
  @scala.inline
  def onBeforeSendHeaders: typings.chromeDashApps.chromeDashAppsStrings.onBeforeSendHeaders = this.cast("onBeforeSendHeaders")
  @scala.inline
  def onHeadersReceived: typings.chromeDashApps.chromeDashAppsStrings.onHeadersReceived = this.cast("onHeadersReceived")
}

