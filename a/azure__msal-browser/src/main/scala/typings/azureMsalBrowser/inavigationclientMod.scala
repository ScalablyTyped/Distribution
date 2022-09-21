package typings.azureMsalBrowser

import typings.azureMsalBrowser.navigationOptionsMod.NavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inavigationclientMod {
  
  trait INavigationClient extends StObject {
    
    /**
      * Navigates to other pages outside the web application i.e. the Identity Provider
      * @param url
      * @param options
      */
    def navigateExternal(url: String, options: NavigationOptions): js.Promise[Boolean]
    
    /**
      * Navigates to other pages within the same web application
      * Return false if this doesn't cause the page to reload i.e. Client-side navigation
      * @param url
      * @param options
      */
    def navigateInternal(url: String, options: NavigationOptions): js.Promise[Boolean]
  }
  object INavigationClient {
    
    inline def apply(
      navigateExternal: (String, NavigationOptions) => js.Promise[Boolean],
      navigateInternal: (String, NavigationOptions) => js.Promise[Boolean]
    ): INavigationClient = {
      val __obj = js.Dynamic.literal(navigateExternal = js.Any.fromFunction2(navigateExternal), navigateInternal = js.Any.fromFunction2(navigateInternal))
      __obj.asInstanceOf[INavigationClient]
    }
    
    extension [Self <: INavigationClient](x: Self) {
      
      inline def setNavigateExternal(value: (String, NavigationOptions) => js.Promise[Boolean]): Self = StObject.set(x, "navigateExternal", js.Any.fromFunction2(value))
      
      inline def setNavigateInternal(value: (String, NavigationOptions) => js.Promise[Boolean]): Self = StObject.set(x, "navigateInternal", js.Any.fromFunction2(value))
    }
  }
}
