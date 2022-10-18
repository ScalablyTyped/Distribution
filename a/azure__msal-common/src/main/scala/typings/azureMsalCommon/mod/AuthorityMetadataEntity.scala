package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthorityMetadataEntity")
@js.native
open class AuthorityMetadataEntity ()
  extends typings.azureMsalCommon.distCacheEntitiesAuthorityMetadataEntityMod.AuthorityMetadataEntity
/* static members */
object AuthorityMetadataEntity {
  
  @JSImport("@azure/msal-common", "AuthorityMetadataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Validates an entity: checks for all expected params
    * @param entity
    */
  inline def isAuthorityMetadataEntity(key: String, entity: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAuthorityMetadataEntity")(key.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
