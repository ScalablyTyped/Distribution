package typings.azureMsalCommon

import typings.azureMsalCommon.cacheTypesMod._ValidCacheType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMetadataEntityMod {
  
  @JSImport("@azure/msal-common/dist/cache/entities/AppMetadataEntity", "AppMetadataEntity")
  @js.native
  open class AppMetadataEntity ()
    extends StObject
       with _ValidCacheType {
    
    var clientId: String = js.native
    
    var environment: String = js.native
    
    var familyId: js.UndefOr[String] = js.native
    
    /**
      * Generate AppMetadata Cache Key as per the schema: appmetadata-<environment>-<client_id>
      */
    def generateAppMetadataKey(): String = js.native
  }
  /* static members */
  object AppMetadataEntity {
    
    @JSImport("@azure/msal-common/dist/cache/entities/AppMetadataEntity", "AppMetadataEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates AppMetadataEntity
      * @param clientId
      * @param environment
      * @param familyId
      */
    inline def createAppMetadataEntity(clientId: String, environment: String): AppMetadataEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppMetadataEntity")(clientId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[AppMetadataEntity]
    inline def createAppMetadataEntity(clientId: String, environment: String, familyId: String): AppMetadataEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppMetadataEntity")(clientId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[AppMetadataEntity]
    
    /**
      * Generate AppMetadata Cache Key
      */
    inline def generateAppMetadataCacheKey(environment: String, clientId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAppMetadataCacheKey")(environment.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Validates an entity: checks for all expected params
      * @param entity
      */
    inline def isAppMetadataEntity(key: String, entity: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAppMetadataEntity")(key.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
