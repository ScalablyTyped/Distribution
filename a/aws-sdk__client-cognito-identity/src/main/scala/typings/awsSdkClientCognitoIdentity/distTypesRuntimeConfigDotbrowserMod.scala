package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.ApiVersion
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotbrowserMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/runtimeConfig.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: CognitoIdentityClientConfig): ApiVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ApiVersion]
}
