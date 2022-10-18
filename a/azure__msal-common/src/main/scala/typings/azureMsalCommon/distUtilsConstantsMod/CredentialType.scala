package typings.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CredentialType extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "CredentialType")
@js.native
object CredentialType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CredentialType & String] = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN
    extends StObject
       with CredentialType
  /* "AccessToken" */ val ACCESS_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.CredentialType.ACCESS_TOKEN & String = js.native
  
  @js.native
  sealed trait ACCESS_TOKEN_WITH_AUTH_SCHEME
    extends StObject
       with CredentialType
  /* "AccessToken_With_AuthScheme" */ val ACCESS_TOKEN_WITH_AUTH_SCHEME: typings.azureMsalCommon.distUtilsConstantsMod.CredentialType.ACCESS_TOKEN_WITH_AUTH_SCHEME & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with CredentialType
  /* "IdToken" */ val ID_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.CredentialType.ID_TOKEN & String = js.native
  
  @js.native
  sealed trait REFRESH_TOKEN
    extends StObject
       with CredentialType
  /* "RefreshToken" */ val REFRESH_TOKEN: typings.azureMsalCommon.distUtilsConstantsMod.CredentialType.REFRESH_TOKEN & String = js.native
}
