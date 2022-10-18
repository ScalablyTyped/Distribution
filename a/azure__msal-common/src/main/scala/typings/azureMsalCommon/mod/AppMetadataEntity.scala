package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AppMetadataEntity")
@js.native
open class AppMetadataEntity ()
  extends typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity
/* static members */
object AppMetadataEntity {
  
  @JSImport("@azure/msal-common", "AppMetadataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates AppMetadataEntity
    * @param clientId
    * @param environment
    * @param familyId
    */
  inline def createAppMetadataEntity(clientId: String, environment: String): typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppMetadataEntity")(clientId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity]
  inline def createAppMetadataEntity(clientId: String, environment: String, familyId: String): typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppMetadataEntity")(clientId.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], familyId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distCacheEntitiesAppMetadataEntityMod.AppMetadataEntity]
  
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
