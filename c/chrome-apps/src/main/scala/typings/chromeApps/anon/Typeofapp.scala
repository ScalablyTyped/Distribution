package typings.chromeApps.anon

import typings.chromeApps.chrome.app.ChromeAppWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofapp extends js.Object {
  
  /**
    * @enum
    * @internal
    * @private
    */
  val _State: FULLSCREEN = js.native
  
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
  val runtime: Typeofruntime = js.native
  
  val window: ChromeAppWindow = js.native
}
object Typeofapp {
  
  @scala.inline
  def apply(_State: FULLSCREEN, runtime: Typeofruntime, window: ChromeAppWindow): Typeofapp = {
    val __obj = js.Dynamic.literal(_State = _State.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofapp]
  }
  
  @scala.inline
  implicit class TypeofappOps[Self <: Typeofapp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_State(value: FULLSCREEN): Self = this.set("_State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: Typeofruntime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: ChromeAppWindow): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
