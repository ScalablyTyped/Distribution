package typings.awsSdkCredentialProviderSso

import typings.awsSdkCredentialProviderSso.anon.FromSSOInitPartialSsoCred
import typings.awsSdkCredentialProviderSso.distTypesTypesMod.SsoProfile
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import typings.awsSdkTypes.distTypesProfileMod.Profile
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-sso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSSO(): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[AwsCredentialIdentityProvider]
  inline def fromSSO(init: FromSSOInitPartialSsoCred): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  inline def isSsoProfile(arg: Profile): /* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSsoProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean]
  
  inline def validateSsoProfile(profile: Partial[SsoProfile]): SsoProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSsoProfile")(profile.asInstanceOf[js.Any]).asInstanceOf[SsoProfile]
}
