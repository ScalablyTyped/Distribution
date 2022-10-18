package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.Base64Decoder
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/runtimeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: CognitoIdentityClientConfig): Base64Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Decoder]
}
