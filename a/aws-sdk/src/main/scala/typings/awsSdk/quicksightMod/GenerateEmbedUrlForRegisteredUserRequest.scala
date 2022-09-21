package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEmbedUrlForRegisteredUserRequest extends StObject {
  
  /**
    * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to three domains or subdomains in each API call. To include all subdomains under a specific domain to the allow list, use *. For example, https:// *.sapp.amazon.com includes all subdomains under https://sapp.amazon.com.
    */
  var AllowedDomains: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, Amazon QuickSight visuals, the Amazon QuickSight Q search bar, or the entire Amazon QuickSight console.
    */
  var ExperienceConfiguration: RegisteredUserEmbeddingExperienceConfiguration
  
  /**
    * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsSdk.quicksightMod.SessionLifetimeInMinutes] = js.undefined
  
  /**
    * The Amazon Resource Name for the registered user.
    */
  var UserArn: Arn
}
object GenerateEmbedUrlForRegisteredUserRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    ExperienceConfiguration: RegisteredUserEmbeddingExperienceConfiguration,
    UserArn: Arn
  ): GenerateEmbedUrlForRegisteredUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ExperienceConfiguration = ExperienceConfiguration.asInstanceOf[js.Any], UserArn = UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEmbedUrlForRegisteredUserRequest]
  }
  
  extension [Self <: GenerateEmbedUrlForRegisteredUserRequest](x: Self) {
    
    inline def setAllowedDomains(value: StringList): Self = StObject.set(x, "AllowedDomains", value.asInstanceOf[js.Any])
    
    inline def setAllowedDomainsUndefined: Self = StObject.set(x, "AllowedDomains", js.undefined)
    
    inline def setAllowedDomainsVarargs(value: String*): Self = StObject.set(x, "AllowedDomains", js.Array(value*))
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setExperienceConfiguration(value: RegisteredUserEmbeddingExperienceConfiguration): Self = StObject.set(x, "ExperienceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = StObject.set(x, "SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutesUndefined: Self = StObject.set(x, "SessionLifetimeInMinutes", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
  }
}
