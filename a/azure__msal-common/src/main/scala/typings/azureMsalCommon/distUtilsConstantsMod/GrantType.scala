package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GrantType extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "GrantType")
@js.native
object GrantType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GrantType & String] = js.native
  
  @js.native
  sealed trait AUTHORIZATION_CODE_GRANT
    extends StObject
       with GrantType
  /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.AUTHORIZATION_CODE_GRANT & String = js.native
  
  @js.native
  sealed trait CLIENT_CREDENTIALS_GRANT
    extends StObject
       with GrantType
  /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.CLIENT_CREDENTIALS_GRANT & String = js.native
  
  @js.native
  sealed trait DEVICE_CODE_GRANT
    extends StObject
       with GrantType
  /* "device_code" */ val DEVICE_CODE_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.DEVICE_CODE_GRANT & String = js.native
  
  @js.native
  sealed trait IMPLICIT_GRANT
    extends StObject
       with GrantType
  /* "implicit" */ val IMPLICIT_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.IMPLICIT_GRANT & String = js.native
  
  @js.native
  sealed trait JWT_BEARER
    extends StObject
       with GrantType
  /* "urn:ietf:params:oauth:grant-type:jwt-bearer" */ val JWT_BEARER: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.JWT_BEARER & String = js.native
  
  @js.native
  sealed trait REFRESH_TOKEN_GRANT
    extends StObject
       with GrantType
  /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.REFRESH_TOKEN_GRANT & String = js.native
  
  @js.native
  sealed trait RESOURCE_OWNER_PASSWORD_GRANT
    extends StObject
       with GrantType
  /* "password" */ val RESOURCE_OWNER_PASSWORD_GRANT: typings.azureMsalCommon.distUtilsConstantsMod.GrantType.RESOURCE_OWNER_PASSWORD_GRANT & String = js.native
}
