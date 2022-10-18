package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.ApiVersion
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotbrowserMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/runtimeConfig.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOClientConfig): ApiVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ApiVersion]
}
