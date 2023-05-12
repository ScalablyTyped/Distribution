package typings.awsSdkCredentialProviderIni

import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveStaticCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveStaticCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStaticCredsProfile(arg: Any): /* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveStaticCredentials.StaticCredsProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticCredsProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-ini.@aws-sdk/credential-provider-ini/dist-types/resolveStaticCredentials.StaticCredsProfile */ Boolean]
  
  inline def resolveStaticCredentials(profile: StaticCredsProfile): js.Promise[AwsCredentialIdentity] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveStaticCredentials")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AwsCredentialIdentity]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: string | undefined} */ trait StaticCredsProfile extends StObject {
    
    var aws_access_key_id: String
    
    var aws_secret_access_key: String
    
    var aws_session_token: js.UndefOr[String] = js.undefined
  }
  object StaticCredsProfile {
    
    inline def apply(aws_access_key_id: String, aws_secret_access_key: String): StaticCredsProfile = {
      val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id.asInstanceOf[js.Any], aws_secret_access_key = aws_secret_access_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticCredsProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticCredsProfile] (val x: Self) extends AnyVal {
      
      inline def setAws_access_key_id(value: String): Self = StObject.set(x, "aws_access_key_id", value.asInstanceOf[js.Any])
      
      inline def setAws_secret_access_key(value: String): Self = StObject.set(x, "aws_secret_access_key", value.asInstanceOf[js.Any])
      
      inline def setAws_session_token(value: String): Self = StObject.set(x, "aws_session_token", value.asInstanceOf[js.Any])
      
      inline def setAws_session_tokenUndefined: Self = StObject.set(x, "aws_session_token", js.undefined)
    }
  }
}
