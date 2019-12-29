package typings.chromeDashApps.chrome.app.runtime

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired at Chrome startup to apps that were running when Chrome last shut down,
  * or when apps have been requested to restart from their previous state for other reasons
  * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
  * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
  */
@JSGlobal("chrome.app.runtime.onRestarted")
@js.native
object onRestarted
  extends TopLevel[Event[js.Function0[Unit]]]

