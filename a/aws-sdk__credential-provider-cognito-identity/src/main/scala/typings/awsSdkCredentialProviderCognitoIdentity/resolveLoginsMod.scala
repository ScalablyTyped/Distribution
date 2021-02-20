package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.Logins
import typings.awsSdkCredentialProviderCognitoIdentity.loginsMod.ResolvedLogins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveLoginsMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/resolveLogins", "resolveLogins")
  @js.native
  def resolveLogins(logins: Logins): js.Promise[ResolvedLogins] = js.native
}
