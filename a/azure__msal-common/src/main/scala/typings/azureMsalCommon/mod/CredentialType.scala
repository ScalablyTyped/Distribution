package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "CredentialType")
@js.native
object CredentialType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.azureMsalCommon.constantsMod.CredentialType & String] = js.native
  
  /* "AccessToken" */ val ACCESS_TOKEN: typings.azureMsalCommon.constantsMod.CredentialType.ACCESS_TOKEN & String = js.native
  
  /* "AccessToken_With_AuthScheme" */ val ACCESS_TOKEN_WITH_AUTH_SCHEME: typings.azureMsalCommon.constantsMod.CredentialType.ACCESS_TOKEN_WITH_AUTH_SCHEME & String = js.native
  
  /* "IdToken" */ val ID_TOKEN: typings.azureMsalCommon.constantsMod.CredentialType.ID_TOKEN & String = js.native
  
  /* "RefreshToken" */ val REFRESH_TOKEN: typings.azureMsalCommon.constantsMod.CredentialType.REFRESH_TOKEN & String = js.native
}
