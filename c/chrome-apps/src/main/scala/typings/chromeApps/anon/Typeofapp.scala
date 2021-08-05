package typings.chromeApps.anon

import typings.chromeApps.chrome.app.ChromeAppWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofapp extends StObject {
  
  /**
    * @enum
    * @internal
    * @private
    */
  val _State: FULLSCREEN
  
  // #endregion
  // #region chrome.app.*
  /////////////////
  // App Runtime //
  /////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.runtime API to manage the app lifecycle.
    * The app runtime manages app installation, controls the event page,
    * and can shut down the app at anytime.
    */
  val runtime: Typeofruntime
  
  val window: ChromeAppWindow
}
object Typeofapp {
  
  inline def apply(_State: FULLSCREEN, runtime: Typeofruntime, window: ChromeAppWindow): Typeofapp = {
    val __obj = js.Dynamic.literal(_State = _State.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofapp]
  }
  
  extension [Self <: Typeofapp](x: Self) {
    
    inline def setRuntime(value: Typeofruntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: ChromeAppWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def set_State(value: FULLSCREEN): Self = StObject.set(x, "_State", value.asInstanceOf[js.Any])
  }
}
