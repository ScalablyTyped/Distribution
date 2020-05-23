package typings.awsSdkCredentialProviderEnv

import typings.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ENV_EXPIRATION: /* "AWS_CREDENTIAL_EXPIRATION" */ String = js.native
  val ENV_KEY: /* "AWS_ACCESS_KEY_ID" */ String = js.native
  val ENV_SECRET: /* "AWS_SECRET_ACCESS_KEY" */ String = js.native
  val ENV_SESSION: /* "AWS_SESSION_TOKEN" */ String = js.native
  def fromEnv(): CredentialProvider = js.native
}

