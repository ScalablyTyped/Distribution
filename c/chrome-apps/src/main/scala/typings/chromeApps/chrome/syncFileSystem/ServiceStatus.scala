package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * 'initializing'
  *  - The sync service is being initialized (e.g. restoring data from the database, checking connectivity and authenticating to the service etc).
  * 'running'
  *  - The sync service is up and running.
  * 'authentication_required'
  *  - The sync service is not synchronizing files because the remote service needs to be authenticated by the user to proceed.
  * 'temporary_unavailable'
  *  - The sync service is not synchronizing files because the remote service is (temporarily) unavailable due to some recoverable errors, e.g. network is offline, the remote service is down or not reachable etc. More details should be given by |description| parameter in OnServiceInfoUpdated (which could contain service-specific details).
  * 'disabled'
  *  - The sync service is disabled and the content will never sync. (E.g. this could happen when the user has no account on the remote service or the sync service has had an unrecoverable error.)
  */
@JSGlobal("chrome.syncFileSystem.ServiceStatus")
@js.native
object ServiceStatus extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required_ = js.native
  var DISABLED: disabled__ = js.native
  var INITIALIZING: initializing_ = js.native
  var RUNNING: running_ = js.native
  var TEMPORARY_UNAVAILABLE: temporary_unavailable_ = js.native
}

