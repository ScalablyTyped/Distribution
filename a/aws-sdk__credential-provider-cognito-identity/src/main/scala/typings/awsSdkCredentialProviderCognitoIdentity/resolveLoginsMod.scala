package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.ResolvedLogins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/resolveLogins", JSImport.Namespace)
@js.native
object resolveLoginsMod extends js.Object {
  
  def resolveLogins(logins: Logins): js.Promise[ResolvedLogins] = js.native
}
