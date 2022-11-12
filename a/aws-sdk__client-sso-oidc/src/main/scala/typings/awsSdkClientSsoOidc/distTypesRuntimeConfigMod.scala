package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.Base64Decoder
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/runtimeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOOIDCClientConfig): Base64Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Decoder]
}
