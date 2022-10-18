package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "NavigationClient")
@js.native
open class NavigationClient ()
  extends typings.azureMsalBrowser.distNavigationNavigationClientMod.NavigationClient
/* static members */
object NavigationClient {
  
  @JSImport("@azure/msal-browser", "NavigationClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default navigation implementation invoked by the internal and external functions
    * @param url
    * @param options
    */
  @JSImport("@azure/msal-browser", "NavigationClient.defaultNavigateWindow")
  @js.native
  def defaultNavigateWindow: Any = js.native
  inline def defaultNavigateWindow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigateWindow")(x.asInstanceOf[js.Any])
}
