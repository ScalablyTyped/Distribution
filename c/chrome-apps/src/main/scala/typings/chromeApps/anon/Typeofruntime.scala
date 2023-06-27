package typings.chromeApps.anon

import typings.chromeApps.AppView.EmbedRequest
import typings.chromeApps.chrome.app.runtime.LaunchData
import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofruntime extends StObject {
  
  val ActionType: NEWNOTE
  
  val LaunchSource: ABOUTPAGE
  
  val PlayStoreStatus: AVAILABLE
  
  /**
    * Fired when an embedding app requests to embed this app.
    * @since Chrome 43.
    * @see https://developer.chrome.com/apps/tags/appview
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
  
  inline def apply(
    ActionType: NEWNOTE,
    LaunchSource: ABOUTPAGE,
    PlayStoreStatus: AVAILABLE,
    onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]],
    onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]],
    onRestarted: Event[js.Function0[Unit]]
  ): Typeofruntime = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], LaunchSource = LaunchSource.asInstanceOf[js.Any], PlayStoreStatus = PlayStoreStatus.asInstanceOf[js.Any], onEmbedRequested = onEmbedRequested.asInstanceOf[js.Any], onLaunched = onLaunched.asInstanceOf[js.Any], onRestarted = onRestarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofruntime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofruntime] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: NEWNOTE): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setLaunchSource(value: ABOUTPAGE): Self = StObject.set(x, "LaunchSource", value.asInstanceOf[js.Any])
    
    inline def setOnEmbedRequested(value: Event[js.Function1[/* request */ EmbedRequest, Unit]]): Self = StObject.set(x, "onEmbedRequested", value.asInstanceOf[js.Any])
    
    inline def setOnLaunched(value: Event[js.Function1[/* launchData */ LaunchData, Unit]]): Self = StObject.set(x, "onLaunched", value.asInstanceOf[js.Any])
    
    inline def setOnRestarted(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onRestarted", value.asInstanceOf[js.Any])
    
    inline def setPlayStoreStatus(value: AVAILABLE): Self = StObject.set(x, "PlayStoreStatus", value.asInstanceOf[js.Any])
  }
}
