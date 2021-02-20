package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Top Sites
////////////////////
/**
  * Use the chrome.topSites API to access the top sites that are displayed on the new tab page.
  * Permissions:  "topSites"
  * @since Chrome 19.
  */
object topSites {
  
  @js.native
  trait MostVisitedURL extends StObject {
    
    /** The title of the page */
    var title: String = js.native
    
    /** The most visited URL. */
    var url: String = js.native
  }
  object MostVisitedURL {
    
    @scala.inline
    def apply(title: String, url: String): MostVisitedURL = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MostVisitedURL]
    }
    
    @scala.inline
    implicit class MostVisitedURLMutableBuilder[Self <: MostVisitedURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
