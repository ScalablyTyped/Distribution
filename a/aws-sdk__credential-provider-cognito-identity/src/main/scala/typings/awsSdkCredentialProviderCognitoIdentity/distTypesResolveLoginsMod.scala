package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.distTypesLoginsMod.Logins
import typings.awsSdkCredentialProviderCognitoIdentity.distTypesLoginsMod.ResolvedLogins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveLoginsMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist-types/resolveLogins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveLogins(logins: Logins): js.Promise[ResolvedLogins] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLogins")(logins.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResolvedLogins]]
}
