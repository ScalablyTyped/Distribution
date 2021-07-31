package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.browser
/////////////
// Browser //
/////////////
/**
  * @since Chrome 42.
  * @requires Permissions: 'browser'
  * @description
  * Use the chrome.browser API to interact with the Chrome browser associated with
  * the current application and Chrome profile.
  */
object browser {
  
  trait Options extends StObject {
    
    /** The URL to navigate to when the new tab is initially opened. */
    var url: String
  }
  object Options {
    
    @scala.inline
    def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
