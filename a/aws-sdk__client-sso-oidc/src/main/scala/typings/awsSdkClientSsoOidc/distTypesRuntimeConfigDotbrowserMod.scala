package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.ApiVersion
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotbrowserMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/runtimeConfig.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOOIDCClientConfig): ApiVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ApiVersion]
}
