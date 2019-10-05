package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user changes the permission level.
  * @since Chrome 32.
  */
@JSGlobal("chrome.notifications.onPermissionLevelChanged")
@js.native
object onPermissionLevelChanged
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* level */ String, Unit]]
    ]

