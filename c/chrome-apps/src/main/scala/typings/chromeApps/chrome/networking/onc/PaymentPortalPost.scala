package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chromeAppsStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentPortalPost extends StObject {
  
  /** The HTTP method to use for the payment portal. */
  var Method: POST
  
  /** The post data to send to the payment portal. */
  var PostData: js.UndefOr[String] = js.undefined
  
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.undefined
}
object PaymentPortalPost {
  
  inline def apply(): PaymentPortalPost = {
    val __obj = js.Dynamic.literal(Method = "POST")
    __obj.asInstanceOf[PaymentPortalPost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentPortalPost] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: POST): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setPostData(value: String): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "PostData", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
