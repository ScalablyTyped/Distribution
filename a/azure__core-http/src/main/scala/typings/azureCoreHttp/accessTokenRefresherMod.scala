package typings.azureCoreHttp

import typings.azureCoreAuth.mod.AccessToken
import typings.azureCoreAuth.mod.GetTokenOptions
import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessTokenRefresherMod {
  
  @JSImport("@azure/core-http/types/latest/src/credentials/accessTokenRefresher", "AccessTokenRefresher")
  @js.native
  open class AccessTokenRefresher protected () extends StObject {
    def this(credential: TokenCredential, scopes: String) = this()
    def this(credential: TokenCredential, scopes: js.Array[String]) = this()
    def this(credential: TokenCredential, scopes: String, requiredMillisecondsBeforeNewRefresh: Double) = this()
    def this(
      credential: TokenCredential,
      scopes: js.Array[String],
      requiredMillisecondsBeforeNewRefresh: Double
    ) = this()
    
    /* private */ var credential: Any = js.native
    
    /**
      * Stores the time in which it is called,
      * then requests a new token,
      * then sets this.promise to undefined,
      * then returns the token.
      */
    /* private */ var getToken: Any = js.native
    
    /**
      * Returns true if the required milliseconds(defaulted to 30000) have been passed signifying
      * that we are ready for a new refresh.
      */
    def isReady(): Boolean = js.native
    
    /* private */ var lastCalled: Any = js.native
    
    /* private */ var promise: Any = js.native
    
    /**
      * Requests a new token if we're not currently waiting for a new token.
      * Returns null if the required time between each call hasn't been reached.
      */
    def refresh(options: GetTokenOptions): js.Promise[js.UndefOr[AccessToken]] = js.native
    
    /* private */ var requiredMillisecondsBeforeNewRefresh: Any = js.native
    
    /* private */ var scopes: Any = js.native
  }
}
