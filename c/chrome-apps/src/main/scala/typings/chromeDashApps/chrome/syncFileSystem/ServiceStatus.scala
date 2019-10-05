package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.chromeDashAppsStrings.authentication_required
import typings.chromeDashApps.chromeDashAppsStrings.disabled
import typings.chromeDashApps.chromeDashAppsStrings.initializing
import typings.chromeDashApps.chromeDashAppsStrings.running
import typings.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
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
  var AUTHENTICATION_REQUIRED: authentication_required = js.native
  var DISABLED: disabled = js.native
  var INITIALIZING: initializing = js.native
  var RUNNING: running = js.native
  var TEMPORARY_UNAVAILABLE: temporary_unavailable = js.native
}

