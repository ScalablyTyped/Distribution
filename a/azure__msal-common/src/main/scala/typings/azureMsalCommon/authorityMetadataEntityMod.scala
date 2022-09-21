package typings.azureMsalCommon

import typings.azureMsalCommon.cacheTypesMod._ValidCacheType
import typings.azureMsalCommon.cloudDiscoveryMetadataMod.CloudDiscoveryMetadata
import typings.azureMsalCommon.openIdConfigResponseMod.OpenIdConfigResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorityMetadataEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/AuthorityMetadataEntity", "AuthorityMetadataEntity")
  @js.native
  open class AuthorityMetadataEntity ()
    extends StObject
       with _ValidCacheType {
    
    var aliases: js.Array[String] = js.native
    
    var aliasesFromNetwork: Boolean = js.native
    
    var authorization_endpoint: String = js.native
    
    var canonical_authority: String = js.native
    
    var end_session_endpoint: js.UndefOr[String] = js.native
    
    var endpointsFromNetwork: Boolean = js.native
    
    var expiresAt: Double = js.native
    
    /**
      * Returns whether or not the data needs to be refreshed
      */
    def isExpired(): Boolean = js.native
    
    var issuer: String = js.native
    
    var jwks_uri: String = js.native
    
    var preferred_cache: String = js.native
    
    var preferred_network: String = js.native
    
    /**
      * Reset the exiresAt value
      */
    def resetExpiresAt(): Unit = js.native
    
    var token_endpoint: String = js.native
    
    /**
      * Save the authority that was used to create this cache entry
      * @param authority
      */
    def updateCanonicalAuthority(authority: String): Unit = js.native
    
    /**
      * Update the entity with new aliases, preferred_cache and preferred_network values
      * @param metadata
      * @param fromNetwork
      */
    def updateCloudDiscoveryMetadata(metadata: CloudDiscoveryMetadata, fromNetwork: Boolean): Unit = js.native
    
    /**
      * Update the entity with new endpoints
      * @param metadata
      * @param fromNetwork
      */
    def updateEndpointMetadata(metadata: OpenIdConfigResponse, fromNetwork: Boolean): Unit = js.native
  }
  /* static members */
  object AuthorityMetadataEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/AuthorityMetadataEntity", "AuthorityMetadataEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isAuthorityMetadataEntity(key: String, entity: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAuthorityMetadataEntity")(key.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
