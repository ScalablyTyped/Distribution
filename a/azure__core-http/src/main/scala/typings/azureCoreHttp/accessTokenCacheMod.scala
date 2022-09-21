package typings.azureCoreHttp

import typings.azureCoreAuth.mod.AccessToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessTokenCacheMod {
  
  @JSImport("@azure/core-http/types/latest/src/credentials/accessTokenCache", "ExpiringAccessTokenCache")
  @js.native
  /**
    * Constructs an instance of {@link ExpiringAccessTokenCache} with
    * an optional expiration buffer time.
    */
  open class ExpiringAccessTokenCache ()
    extends StObject
       with AccessTokenCache {
    def this(tokenRefreshBufferMs: Double) = this()
    
    /* private */ var cachedToken: Any = js.native
    
    /* private */ var tokenRefreshBufferMs: Any = js.native
  }
  
  @JSImport("@azure/core-http/types/latest/src/credentials/accessTokenCache", "TokenRefreshBufferMs")
  @js.native
  val TokenRefreshBufferMs: Double = js.native
  
  @js.native
  trait AccessTokenCache extends StObject {
    
    /**
      * Returns the cached {@link AccessToken} or undefined if nothing is cached.
      */
    def getCachedToken(): js.UndefOr[AccessToken] = js.native
    
    /**
      * Sets the cached token.
      *
      * @param accessToken - The {@link AccessToken} to be cached or null to
      *        clear the cached token.
      */
    def setCachedToken(): Unit = js.native
    def setCachedToken(accessToken: AccessToken): Unit = js.native
  }
}
