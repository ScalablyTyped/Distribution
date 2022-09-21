package typings.awsSdkCredentialProviderSso

import typings.awsSdkTypes.profileMod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSsoProfileMod {
  
  @JSImport("@aws-sdk/credential-provider-sso/dist-types/isSsoProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSsoProfile(arg: Profile): /* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSsoProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Partial<@aws-sdk/credential-provider-sso.@aws-sdk/credential-provider-sso/dist-types/types.SsoProfile> */ Boolean]
}
