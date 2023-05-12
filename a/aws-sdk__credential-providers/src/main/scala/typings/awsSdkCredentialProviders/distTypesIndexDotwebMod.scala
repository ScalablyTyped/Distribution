package typings.awsSdkCredentialProviders

import typings.awsSdkCredentialProviderCognitoIdentity.distTypesFromCognitoIdentityMod.CognitoIdentityCredentialProvider
import typings.awsSdkCredentialProviders.distTypesFromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.awsSdkCredentialProviders.distTypesFromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typings.awsSdkCredentialProviders.distTypesFromTemporaryCredentialsMod.FromTemporaryCredentialsOptions
import typings.awsSdkCredentialProviders.distTypesFromWebTokenMod.FromWebTokenInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIndexDotwebMod {
  
  @JSImport("@aws-sdk/credential-providers/dist-types/index.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCognitoIdentity(options: FromCognitoIdentityParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentity")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromCognitoIdentityPool(options: FromCognitoIdentityPoolParameters): CognitoIdentityCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCognitoIdentityPool")(options.asInstanceOf[js.Any]).asInstanceOf[CognitoIdentityCredentialProvider]
  
  inline def fromTemporaryCredentials(options: FromTemporaryCredentialsOptions): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTemporaryCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromWebToken(init: FromWebTokenInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
}
