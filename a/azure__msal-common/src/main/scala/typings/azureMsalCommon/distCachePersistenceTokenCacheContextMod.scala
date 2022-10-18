package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCachePersistenceTokenCacheContextMod {
  
  @JSImport("@azure/msal-common/dist/cache/persistence/TokenCacheContext", "TokenCacheContext")
  @js.native
  open class TokenCacheContext protected () extends StObject {
    def this(tokenCache: ISerializableTokenCache, hasChanged: Boolean) = this()
    
    /**
      * serializable token cache interface
      */
    var cache: ISerializableTokenCache = js.native
    
    /**
      * boolean which indicates the changes in cache
      */
    def cacheHasChanged: Boolean = js.native
    
    /**
      * boolean indicating cache change
      */
    var hasChanged: Boolean = js.native
    
    /**
      * function to retrieve the token cache
      */
    def tokenCache: ISerializableTokenCache = js.native
  }
}
