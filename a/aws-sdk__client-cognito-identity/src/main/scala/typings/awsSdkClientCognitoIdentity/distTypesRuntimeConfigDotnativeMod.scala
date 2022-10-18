package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.Base64Encoder
import typings.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotnativeMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/runtimeConfig.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: CognitoIdentityClientConfig): Base64Encoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Encoder]
}
