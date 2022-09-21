package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.DisableHostPrefix
import typings.awsSdkClientCognitoIdentity.cognitoIdentityClientMod.CognitoIdentityClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigSharedMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/runtimeConfig.shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: CognitoIdentityClientConfig): DisableHostPrefix = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[DisableHostPrefix]
}
