package typings
package chromeDashAppsLib.chromeNs.appNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.app.runtime")
@js.native
object runtimeNsMembers extends js.Object {
  /** @enum */
  val ActionType: chromeDashAppsLib.Anon_NEWNOTE = js.native
  /** @enum */
  val LaunchSource: chromeDashAppsLib.Anon_ABOUTPAGE = js.native
  /** @enum */
  val PlayStoreStatus: chromeDashAppsLib.Anon_AVAILABLE = js.native
  /**
    * Fired when an embedding app requests to embed this app.
    * @since Chrome 43.
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  val onEmbedRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* request */ chromeDashAppsLib.AppViewNs.EmbedRequest, scala.Unit]] = js.native
  /**
    * Fired when an app is launched from the launcher.
    */
  val onLaunched: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* launchData */ LaunchData, scala.Unit]] = js.native
  /**
    * Fired at Chrome startup to apps that were running when Chrome last shut down,
    * or when apps have been requested to restart from their previous state for other reasons
    * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
    * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
    */
  val onRestarted: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
}

