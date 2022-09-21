package typings.awsSdkCredentialProviderSso

import typings.awsSdkCredentialProviderSso.anon.FromSSOInitPartialSsoCred
import typings.awsSdkCredentialProviderSso.typesMod.SsoProfile
import typings.awsSdkTypes.credentialsMod.CredentialProvider
import typings.awsSdkTypes.profileMod.Profile
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-sso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSSO(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")().asInstanceOf[CredentialProvider]
  inline def fromSSO(init: FromSSOInitPartialSsoCred): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSSO")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def isSsoProfile(arg: Profile): /* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSsoProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean]
  
  inline def validateSsoProfile(profile: Partial[SsoProfile]): SsoProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSsoProfile")(profile.asInstanceOf[js.Any]).asInstanceOf[SsoProfile]
}
