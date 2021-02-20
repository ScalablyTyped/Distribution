package typings.awsSdkCredentialProviderEnv

import typings.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-env", "ENV_EXPIRATION")
  @js.native
  val ENV_EXPIRATION: /* "AWS_CREDENTIAL_EXPIRATION" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env", "ENV_KEY")
  @js.native
  val ENV_KEY: /* "AWS_ACCESS_KEY_ID" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env", "ENV_SECRET")
  @js.native
  val ENV_SECRET: /* "AWS_SECRET_ACCESS_KEY" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env", "ENV_SESSION")
  @js.native
  val ENV_SESSION: /* "AWS_SESSION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-env", "fromEnv")
  @js.native
  def fromEnv(): CredentialProvider = js.native
}
