package typings.awsSdkCredentialProviderSso

import typings.awsSdkCredentialProviderSso.typesMod.SsoProfile
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateSsoProfileMod {
  
  @JSImport("@aws-sdk/credential-provider-sso/dist-types/validateSsoProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSsoProfile(profile: Partial[SsoProfile]): SsoProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSsoProfile")(profile.asInstanceOf[js.Any]).asInstanceOf[SsoProfile]
}
