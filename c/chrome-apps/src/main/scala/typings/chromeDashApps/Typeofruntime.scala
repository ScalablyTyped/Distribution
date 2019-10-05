package typings.chromeDashApps

import typings.chromeDashApps.AppView.EmbedRequest
import typings.chromeDashApps.chrome.app.runtime.LaunchData
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofruntime extends js.Object {
  /** @enum */
  val ActionType: Anon_NEWNOTE
  /** @enum */
  val LaunchSource: Anon_ABOUTPAGE
  /** @enum */
  val PlayStoreStatus: Anon_AVAILABLE
  /**
    * Fired when an embedding app requests to embed this app.
    * @since Chrome 43.
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  val onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]]
  /**
    * Fired when an app is launched from the launcher.
    */
  val onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]]
  /**
    * Fired at Chrome startup to apps that were running when Chrome last shut down,
    * or when apps have been requested to restart from their previous state for other reasons
    * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
    * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
    */
  val onRestarted: Event[js.Function0[Unit]]
}

object Typeofruntime {
  @scala.inline
  def apply(
    ActionType: Anon_NEWNOTE,
    LaunchSource: Anon_ABOUTPAGE,
    PlayStoreStatus: Anon_AVAILABLE,
    onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]],
    onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]],
    onRestarted: Event[js.Function0[Unit]]
  ): Typeofruntime = {
    val __obj = js.Dynamic.literal(ActionType = ActionType, LaunchSource = LaunchSource, PlayStoreStatus = PlayStoreStatus, onEmbedRequested = onEmbedRequested, onLaunched = onLaunched, onRestarted = onRestarted)
  
    __obj.asInstanceOf[Typeofruntime]
  }
}

