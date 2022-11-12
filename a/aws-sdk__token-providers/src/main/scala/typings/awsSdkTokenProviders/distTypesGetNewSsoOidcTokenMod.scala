package typings.awsSdkTokenProviders

import typings.awsSdkClientSsoOidc.distTypesCommandsCreateTokenCommandMod.CreateTokenCommandOutput
import typings.awsSdkSharedIniFileLoader.distTypesGetSSOTokenFromFileMod.SSOToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetNewSsoOidcTokenMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/getNewSsoOidcToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNewSsoOidcToken(ssoToken: SSOToken, ssoRegion: String): js.Promise[CreateTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNewSsoOidcToken")(ssoToken.asInstanceOf[js.Any], ssoRegion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateTokenCommandOutput]]
}
