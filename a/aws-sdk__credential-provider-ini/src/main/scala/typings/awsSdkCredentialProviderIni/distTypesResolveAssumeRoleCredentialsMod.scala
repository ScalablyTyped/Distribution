package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.awsSdkCredentialProviderIniBooleans.`true`
import typings.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveAssumeRoleCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveAssumeRoleCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAssumeRoleProfile(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssumeRoleProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveAssumeRoleCredentials(profileName: String, profiles: ParsedIniData, options: FromIniInit): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAssumeRoleCredentials")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
  
  inline def resolveAssumeRoleCredentials_true(
    profileName: String,
    profiles: ParsedIniData,
    options: FromIniInit,
    visitedProfiles: Record[String, `true`]
  ): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAssumeRoleCredentials")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], visitedProfiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
  
  trait AssumeRoleParams extends StObject {
    
    /**
      * A unique identifier that is used by third parties when assuming roles in
      * their customers' accounts.
      */
    var ExternalId: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier of the role to be assumed.
      */
    var RoleArn: String
    
    /**
      * A name for the assumed role session.
      */
    var RoleSessionName: String
    
    /**
      * The identification number of the MFA device that is associated with the
      * user who is making the `AssumeRole` call.
      */
    var SerialNumber: js.UndefOr[String] = js.undefined
    
    /**
      * The value provided by the MFA device.
      */
    var TokenCode: js.UndefOr[String] = js.undefined
  }
  object AssumeRoleParams {
    
    inline def apply(RoleArn: String, RoleSessionName: String): AssumeRoleParams = {
      val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleParams]
    }
    
    extension [Self <: AssumeRoleParams](x: Self) {
      
      inline def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
      
      inline def setTokenCode(value: String): Self = StObject.set(x, "TokenCode", value.asInstanceOf[js.Any])
      
      inline def setTokenCodeUndefined: Self = StObject.set(x, "TokenCode", js.undefined)
    }
  }
}
