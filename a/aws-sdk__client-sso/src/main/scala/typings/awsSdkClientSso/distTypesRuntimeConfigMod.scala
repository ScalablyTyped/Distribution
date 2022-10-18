package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.Base64Decoder
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/runtimeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOClientConfig): Base64Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Decoder]
}
