package typings.awsSdkCredentialProviderCognitoIdentity

import typings.awsSdkCredentialProviderCognitoIdentity.storageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist/cjs/localStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def localStorage(): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("localStorage")().asInstanceOf[Storage]
}
