package typings.chromeDashApps.chrome.gcm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when it was not possible to send a message to the GCM server. */
@JSGlobal("chrome.gcm.onSendError")
@js.native
object onSendError
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* error */ GcmError, Unit]]
    ]

