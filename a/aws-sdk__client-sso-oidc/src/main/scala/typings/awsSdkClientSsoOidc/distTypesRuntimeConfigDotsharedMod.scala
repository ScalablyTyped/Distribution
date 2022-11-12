package typings.awsSdkClientSsoOidc

import typings.awsSdkClientSsoOidc.anon.DisableHostPrefix
import typings.awsSdkClientSsoOidc.distTypesSsooidcclientMod.SSOOIDCClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotsharedMod {
  
  @JSImport("@aws-sdk/client-sso-oidc/dist-types/runtimeConfig.shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOOIDCClientConfig): DisableHostPrefix = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[DisableHostPrefix]
}
