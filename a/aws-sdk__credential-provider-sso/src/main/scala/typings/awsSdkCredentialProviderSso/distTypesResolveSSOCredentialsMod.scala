package typings.awsSdkCredentialProviderSso

import typings.awsSdkCredentialProviderSso.distTypesFromSSOMod.FromSSOInit
import typings.awsSdkCredentialProviderSso.distTypesFromSSOMod.SsoCredentialsParameters
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveSSOCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-sso/dist-types/resolveSSOCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveSSOCredentials(hasSsoStartUrlSsoAccountIdSsoRegionSsoRoleNameSsoClient: FromSSOInit & SsoCredentialsParameters): js.Promise[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSSOCredentials")(hasSsoStartUrlSsoAccountIdSsoRegionSsoRoleNameSsoClient.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Credentials]]
}
