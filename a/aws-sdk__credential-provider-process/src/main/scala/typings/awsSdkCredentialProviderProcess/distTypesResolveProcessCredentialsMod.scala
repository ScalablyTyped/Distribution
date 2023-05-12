package typings.awsSdkCredentialProviderProcess

import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveProcessCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-process/dist-types/resolveProcessCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveProcessCredentials(profileName: String, profiles: ParsedIniData): js.Promise[AwsCredentialIdentity] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProcessCredentials")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AwsCredentialIdentity]]
}
