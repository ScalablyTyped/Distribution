package typings.azureMsalNode

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalNode.distCacheItokencacheMod.ITokenCache
import typings.azureMsalNode.distCacheNodeStorageMod.NodeStorage
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.CacheKVStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheTokenCacheMod {
  
  @JSImport("@azure/msal-node/dist/cache/TokenCache", "TokenCache")
  @js.native
  open class TokenCache protected ()
    extends StObject
       with ISerializableTokenCache
       with ITokenCache {
    def this(storage: NodeStorage, logger: Logger) = this()
    def this(storage: NodeStorage, logger: Logger, cachePlugin: ICachePlugin) = this()
    
    /* private */ var cacheHasChanged: Any = js.native
    
    /* private */ var cacheSnapshot: Any = js.native
    
    /* CompleteClass */
    override def deserialize(cache: String): Unit = js.native
    
    /** Returns the signed in account matching homeAccountId */
    /* CompleteClass */
    override def getAccountByHomeId(homeAccountId: String): js.Promise[AccountInfo | Null] = js.native
    
    /** Returns the signed in account matching localAccountId */
    /* CompleteClass */
    override def getAccountByLocalId(localAccountId: String): js.Promise[AccountInfo | Null] = js.native
    
    /** API that retrieves all accounts currently in cache to the user */
    /* CompleteClass */
    override def getAllAccounts(): js.Promise[js.Array[AccountInfo]] = js.native
    
    /**
      * Fetches the cache key-value map
      */
    def getKVStore(): CacheKVStore = js.native
    
    /**
      * Called when the cache has changed state.
      */
    /* private */ var handleChangeEvent: Any = js.native
    
    /**
      * Set to true if cache state has changed since last time serialize or writeToPersistence was called
      */
    def hasChanged(): Boolean = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Removes entities in oldState that the were removed from newState. If there are any unknown values in root of
      * oldState that are not recognized, they are left untouched.
      * @param oldState - cache before changes
      * @param newState - updated cache
      */
    /* private */ var mergeRemovals: Any = js.native
    
    /**
      * Helper to merge new cache with the old one
      * @param oldState - cache before changes
      * @param newState - updated cache
      */
    /* private */ var mergeRemovalsDict: Any = js.native
    
    /**
      * Merge in memory cache with the cache snapshot.
      * @param oldState - cache before changes
      * @param currentState - current cache state in the library
      */
    /* private */ var mergeState: Any = js.native
    
    /**
      * Deep update of oldState based on newState values
      * @param oldState - cache before changes
      * @param newState - updated cache
      */
    /* private */ var mergeUpdates: Any = js.native
    
    /**
      * Helper to overlay as a part of cache merge
      * @param passedInCache - cache read from the blob
      */
    /* private */ var overlayDefaults: Any = js.native
    
    /* private */ val persistence: Any = js.native
    
    /** API to remove a specific account and the relevant data from cache */
    /* CompleteClass */
    override def removeAccount(account: AccountInfo): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def serialize(): String = js.native
    
    /* private */ var storage: Any = js.native
  }
}
