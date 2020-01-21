package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.ResolvedLogins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity/build/resolveLogins", JSImport.Namespace)
@js.native
object resolveLoginsMod extends js.Object {
  def resolveLogins(logins: Logins): js.Promise[ResolvedLogins] = js.native
}

