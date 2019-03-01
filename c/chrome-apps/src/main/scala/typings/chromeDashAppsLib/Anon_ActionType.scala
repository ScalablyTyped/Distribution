package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionType extends js.Object {
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
  val onEmbedRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* request */ chromeDashAppsLib.AppViewNs.EmbedRequest, scala.Unit]]
  /**
    * Fired when an app is launched from the launcher.
    */
  val onLaunched: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* launchData */ chromeDashAppsLib.chromeNs.appNs.runtimeNs.LaunchData, scala.Unit]
  ]
  /**
    * Fired at Chrome startup to apps that were running when Chrome last shut down,
    * or when apps have been requested to restart from their previous state for other reasons
    * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
    * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
    */
  val onRestarted: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}

object Anon_ActionType {
  @scala.inline
  def apply(
    ActionType: Anon_NEWNOTE,
    LaunchSource: Anon_ABOUTPAGE,
    PlayStoreStatus: Anon_AVAILABLE,
    onEmbedRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* request */ chromeDashAppsLib.AppViewNs.EmbedRequest, scala.Unit]],
    onLaunched: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function1[/* launchData */ chromeDashAppsLib.chromeNs.appNs.runtimeNs.LaunchData, scala.Unit]
    ],
    onRestarted: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  ): Anon_ActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActionType")(ActionType)
    __obj.updateDynamic("LaunchSource")(LaunchSource)
    __obj.updateDynamic("PlayStoreStatus")(PlayStoreStatus)
    __obj.updateDynamic("onEmbedRequested")(onEmbedRequested)
    __obj.updateDynamic("onLaunched")(onLaunched)
    __obj.updateDynamic("onRestarted")(onRestarted)
    __obj.asInstanceOf[Anon_ActionType]
  }
}

