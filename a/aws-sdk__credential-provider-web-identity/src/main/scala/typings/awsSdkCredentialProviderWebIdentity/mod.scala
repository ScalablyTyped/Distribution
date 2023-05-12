package typings.awsSdkCredentialProviderWebIdentity

import typings.awsSdkCredentialProviderWebIdentity.distTypesFromTokenFileMod.FromTokenFileInit
import typings.awsSdkCredentialProviderWebIdentity.distTypesFromWebTokenMod.FromWebTokenInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-web-identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTokenFile(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromTokenFile(init: FromTokenFileInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def fromWebToken(init: FromWebTokenInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
}
