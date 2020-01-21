package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeRequest
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeSendHeaders
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonSendHeaders
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonHeadersReceived
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonAuthRequired
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonResponseStarted
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeRedirect
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonCompleted
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonErrorOccured
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonRequest
  - typings.chromeApps.chromeAppsStrings.declarativeContentDotonMessage
*/
trait DeclarativeWebRequestEventList extends js.Object

object DeclarativeWebRequestEventList {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declarativeContentDotonAuthRequired: typings.chromeApps.chromeAppsStrings.declarativeContentDotonAuthRequired = this.cast("declarativeContent.onAuthRequired")
  @scala.inline
  def declarativeContentDotonBeforeRedirect: typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeRedirect = this.cast("declarativeContent.onBeforeRedirect")
  @scala.inline
  def declarativeContentDotonBeforeRequest: typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeRequest = this.cast("declarativeContent.onBeforeRequest")
  @scala.inline
  def declarativeContentDotonBeforeSendHeaders: typings.chromeApps.chromeAppsStrings.declarativeContentDotonBeforeSendHeaders = this.cast("declarativeContent.onBeforeSendHeaders")
  @scala.inline
  def declarativeContentDotonCompleted: typings.chromeApps.chromeAppsStrings.declarativeContentDotonCompleted = this.cast("declarativeContent.onCompleted")
  @scala.inline
  def declarativeContentDotonErrorOccured: typings.chromeApps.chromeAppsStrings.declarativeContentDotonErrorOccured = this.cast("declarativeContent.onErrorOccured")
  @scala.inline
  def declarativeContentDotonHeadersReceived: typings.chromeApps.chromeAppsStrings.declarativeContentDotonHeadersReceived = this.cast("declarativeContent.onHeadersReceived")
  @scala.inline
  def declarativeContentDotonMessage: typings.chromeApps.chromeAppsStrings.declarativeContentDotonMessage = this.cast("declarativeContent.onMessage")
  @scala.inline
  def declarativeContentDotonRequest: typings.chromeApps.chromeAppsStrings.declarativeContentDotonRequest = this.cast("declarativeContent.onRequest")
  @scala.inline
  def declarativeContentDotonResponseStarted: typings.chromeApps.chromeAppsStrings.declarativeContentDotonResponseStarted = this.cast("declarativeContent.onResponseStarted")
  @scala.inline
  def declarativeContentDotonSendHeaders: typings.chromeApps.chromeAppsStrings.declarativeContentDotonSendHeaders = this.cast("declarativeContent.onSendHeaders")
}

