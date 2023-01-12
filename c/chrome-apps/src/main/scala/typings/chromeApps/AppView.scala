package typings.chromeApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppView {
  
  /////////////////
  // AppView Tag //
  /////////////////
  /**
    * Use the appview tag to embed other Chrome Apps within your Chrome App.
    * The appview runs in a separate process from your app,
    * it doesn't inherit the same permissions and is only allowed
    * to interact with your app through asynchronous APIs.
    * Not all apps can be embedded; apps have to explicitly allow themselves to be embedded.
    * @since Chrome 43.
    * @requires Permissions: 'appview'
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  /* was `typeof HTMLAppViewElement` */
  type ^ = HTMLAppViewElement
  
  trait EmbedRequest extends StObject {
    
    /**
      * Allows the embedding request
      * @param url Specifies the content to be embedded.
      */
    def allow(url: String): Unit
    
    /** Optional developer specified data that the app to be embedded can use when making an embedding decision. */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Prevents the embedding request */
    def deny(): Unit
    
    /** The ID of the app that sent the embedding request. */
    var embedderId: String
  }
  object EmbedRequest {
    
    inline def apply(allow: String => Unit, deny: () => Unit, embedderId: String): EmbedRequest = {
      val __obj = js.Dynamic.literal(allow = js.Any.fromFunction1(allow), deny = js.Any.fromFunction0(deny), embedderId = embedderId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbedRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmbedRequest] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: String => Unit): Self = StObject.set(x, "allow", js.Any.fromFunction1(value))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeny(value: () => Unit): Self = StObject.set(x, "deny", js.Any.fromFunction0(value))
      
      inline def setEmbedderId(value: String): Self = StObject.set(x, "embedderId", value.asInstanceOf[js.Any])
    }
  }
}
