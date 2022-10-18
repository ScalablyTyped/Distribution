package typings.awsSdkClientSso

import typings.awsSdkClientSso.anon.DisableHostPrefix
import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotsharedMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/runtimeConfig.shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: SSOClientConfig): DisableHostPrefix = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[DisableHostPrefix]
}
