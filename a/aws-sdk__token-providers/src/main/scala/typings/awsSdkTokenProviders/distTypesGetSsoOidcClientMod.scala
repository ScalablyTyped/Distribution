package typings.awsSdkTokenProviders

import typings.awsSdkClientSsoOidc.mod.SSOOIDCClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetSsoOidcClientMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/getSsoOidcClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSsoOidcClient(ssoRegion: String): SSOOIDCClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getSsoOidcClient")(ssoRegion.asInstanceOf[js.Any]).asInstanceOf[SSOOIDCClient]
}
