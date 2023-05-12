package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.awsSdkCredentialProviderIniBooleans.`true`
import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveProfileDataMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveProfileData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveProfileData(profileName: String, profiles: ParsedIniData, options: FromIniInit): js.Promise[AwsCredentialIdentity] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProfileData")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AwsCredentialIdentity]]
  
  inline def resolveProfileData_true(
    profileName: String,
    profiles: ParsedIniData,
    options: FromIniInit,
    visitedProfiles: Record[String, `true`]
  ): js.Promise[AwsCredentialIdentity] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProfileData")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], visitedProfiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AwsCredentialIdentity]]
}
