package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeRequest
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeSendHeaders
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonSendHeaders
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonHeadersReceived
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonAuthRequired
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonResponseStarted
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeRedirect
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonCompleted
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonErrorOccured
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonRequest
  - typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonMessage
*/
trait DeclarativeWebRequestEventList extends js.Object

object DeclarativeWebRequestEventList {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declarativeContentDotonAuthRequired: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonAuthRequired = this.cast("declarativeContent.onAuthRequired")
  @scala.inline
  def declarativeContentDotonBeforeRedirect: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeRedirect = this.cast("declarativeContent.onBeforeRedirect")
  @scala.inline
  def declarativeContentDotonBeforeRequest: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeRequest = this.cast("declarativeContent.onBeforeRequest")
  @scala.inline
  def declarativeContentDotonBeforeSendHeaders: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonBeforeSendHeaders = this.cast("declarativeContent.onBeforeSendHeaders")
  @scala.inline
  def declarativeContentDotonCompleted: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonCompleted = this.cast("declarativeContent.onCompleted")
  @scala.inline
  def declarativeContentDotonErrorOccured: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonErrorOccured = this.cast("declarativeContent.onErrorOccured")
  @scala.inline
  def declarativeContentDotonHeadersReceived: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonHeadersReceived = this.cast("declarativeContent.onHeadersReceived")
  @scala.inline
  def declarativeContentDotonMessage: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonMessage = this.cast("declarativeContent.onMessage")
  @scala.inline
  def declarativeContentDotonRequest: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonRequest = this.cast("declarativeContent.onRequest")
  @scala.inline
  def declarativeContentDotonResponseStarted: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonResponseStarted = this.cast("declarativeContent.onResponseStarted")
  @scala.inline
  def declarativeContentDotonSendHeaders: typings.chromeDashApps.chromeDashAppsStrings.declarativeContentDotonSendHeaders = this.cast("declarativeContent.onSendHeaders")
}

