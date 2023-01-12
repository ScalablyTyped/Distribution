package typings.backlogJs

import typings.backlogJs.anon.Code
import typings.backlogJs.anon.Host
import typings.backlogJs.anon.RefreshToken
import typings.backlogJs.distTypesEntityMod.OAuth2.AccessToken
import typings.backlogJs.distTypesOptionMod.OAuth2.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOauth2Mod {
  
  @JSImport("backlog-js/dist/types/oauth2", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OAuth2 {
    def this(credentials: Credentials) = this()
    def this(credentials: Credentials, timeout: Double) = this()
    
    /* private */ /* CompleteClass */
    var credentials: Any = js.native
    
    /* CompleteClass */
    override def getAccessToken(options: Code): js.Promise[AccessToken] = js.native
    
    /* CompleteClass */
    override def getAuthorizationURL(options: Host): String = js.native
    
    /* CompleteClass */
    override def refreshAccessToken(options: RefreshToken): js.Promise[AccessToken] = js.native
    
    /* private */ /* CompleteClass */
    var timeout: Any = js.native
  }
  
  trait OAuth2 extends StObject {
    
    /* private */ var credentials: Any
    
    def getAccessToken(options: Code): js.Promise[AccessToken]
    
    def getAuthorizationURL(options: Host): String
    
    def refreshAccessToken(options: RefreshToken): js.Promise[AccessToken]
    
    /* private */ var timeout: Any
  }
  object OAuth2 {
    
    inline def apply(
      credentials: Any,
      getAccessToken: Code => js.Promise[AccessToken],
      getAuthorizationURL: Host => String,
      refreshAccessToken: RefreshToken => js.Promise[AccessToken],
      timeout: Any
    ): OAuth2 = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], getAccessToken = js.Any.fromFunction1(getAccessToken), getAuthorizationURL = js.Any.fromFunction1(getAuthorizationURL), refreshAccessToken = js.Any.fromFunction1(refreshAccessToken), timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setGetAccessToken(value: Code => js.Promise[AccessToken]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction1(value))
      
      inline def setGetAuthorizationURL(value: Host => String): Self = StObject.set(x, "getAuthorizationURL", js.Any.fromFunction1(value))
      
      inline def setRefreshAccessToken(value: RefreshToken => js.Promise[AccessToken]): Self = StObject.set(x, "refreshAccessToken", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
