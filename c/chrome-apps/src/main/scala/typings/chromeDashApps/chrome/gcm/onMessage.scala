package typings.chromeDashApps.chrome.gcm

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a message is received through GCM. */
@JSGlobal("chrome.gcm.onMessage")
@js.native
object onMessage
  extends TopLevel[Event[js.Function1[/* message */ IncomingMessage, Unit]]]

