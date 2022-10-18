package typings.azureMsalNode

import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AccessTokenCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AccountCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.AppMetadataCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.IdTokenCache
import typings.azureMsalCommon.distCacheUtilsCacheTypesMod.RefreshTokenCache
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.InMemoryCache
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.JsonCache
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAccessTokenEntity
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAccountEntity
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedAppMetadataEntity
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedIdTokenEntity
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.SerializedRefreshTokenEntity
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheSerializerSerializerMod {
  
  @JSImport("@azure/msal-node/dist/cache/serializer/Serializer", "Serializer")
  @js.native
  open class Serializer () extends StObject
  /* static members */
  object Serializer {
    
    @JSImport("@azure/msal-node/dist/cache/serializer/Serializer", "Serializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes AccessTokens
      * @param atCache
      */
    inline def serializeAccessTokens(atCache: AccessTokenCache): Record[String, SerializedAccessTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAccessTokens")(atCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAccessTokenEntity]]
    
    /**
      * Serialize Accounts
      * @param accCache
      */
    inline def serializeAccounts(accCache: AccountCache): Record[String, SerializedAccountEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAccounts")(accCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAccountEntity]]
    
    /**
      * Serialize the cache
      * @param jsonContent
      */
    inline def serializeAllCache(inMemCache: InMemoryCache): JsonCache = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAllCache")(inMemCache.asInstanceOf[js.Any]).asInstanceOf[JsonCache]
    
    /**
      * Serialize amdtCache
      * @param amdtCache
      */
    inline def serializeAppMetadata(amdtCache: AppMetadataCache): Record[String, SerializedAppMetadataEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAppMetadata")(amdtCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedAppMetadataEntity]]
    
    /**
      * Serialize IdTokens
      * @param idTCache
      */
    inline def serializeIdTokens(idTCache: IdTokenCache): Record[String, SerializedIdTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeIdTokens")(idTCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedIdTokenEntity]]
    
    /**
      * serialize the JSON blob
      * @param data
      */
    inline def serializeJSONBlob(data: JsonCache): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeJSONBlob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Serialize refreshTokens
      * @param rtCache
      */
    inline def serializeRefreshTokens(rtCache: RefreshTokenCache): Record[String, SerializedRefreshTokenEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRefreshTokens")(rtCache.asInstanceOf[js.Any]).asInstanceOf[Record[String, SerializedRefreshTokenEntity]]
  }
}
