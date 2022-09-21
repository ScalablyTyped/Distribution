package typings.azureMsalBrowser

import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.navigationOptionsMod.NavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationClientMod {
  
  @JSImport("@azure/msal-browser/dist/navigation/NavigationClient", "NavigationClient")
  @js.native
  open class NavigationClient ()
    extends StObject
       with INavigationClient {
    
    /**
      * Navigates to other pages outside the web application i.e. the Identity Provider
      * @param url
      * @param options
      */
    /* CompleteClass */
    override def navigateExternal(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
    
    /**
      * Navigates to other pages within the same web application
      * Return false if this doesn't cause the page to reload i.e. Client-side navigation
      * @param url
      * @param options
      */
    /* CompleteClass */
    override def navigateInternal(url: String, options: NavigationOptions): js.Promise[Boolean] = js.native
  }
  /* static members */
  object NavigationClient {
    
    @JSImport("@azure/msal-browser/dist/navigation/NavigationClient", "NavigationClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default navigation implementation invoked by the internal and external functions
      * @param url
      * @param options
      */
    @JSImport("@azure/msal-browser/dist/navigation/NavigationClient", "NavigationClient.defaultNavigateWindow")
    @js.native
    def defaultNavigateWindow: Any = js.native
    inline def defaultNavigateWindow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigateWindow")(x.asInstanceOf[js.Any])
  }
}
