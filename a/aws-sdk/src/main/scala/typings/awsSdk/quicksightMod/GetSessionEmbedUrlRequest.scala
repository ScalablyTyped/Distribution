package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionEmbedUrlRequest extends StObject {
  
  /**
    * The ID for the AWS account associated with your QuickSight subscription.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The URL you use to access the embedded session. The entry point URL is constrained to the following paths:    /start     /start/analyses     /start/dashboards     /start/favorites     /dashboards/DashboardId  - where DashboardId is the actual ID key from the QuickSight console URL of the dashboard    /analyses/AnalysisId  - where AnalysisId is the actual ID key from the QuickSight console URL of the analysis  
    */
  var EntryPoint: js.UndefOr[typings.awsSdk.quicksightMod.EntryPoint] = js.undefined
  
  /**
    * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsSdk.quicksightMod.SessionLifetimeInMinutes] = js.undefined
  
  /**
    * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with QUICKSIGHT identity type. You can use this for any type of Amazon QuickSight users in your account (readers, authors, or admins). They need to be authenticated as one of the following:   Active Directory (AD) users or group members   Invited nonfederated users   IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect, or IAM federation   Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object GetSessionEmbedUrlRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): GetSessionEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionEmbedUrlRequest]
  }
  
  extension [Self <: GetSessionEmbedUrlRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "EntryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "EntryPoint", js.undefined)
    
    inline def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = StObject.set(x, "SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutesUndefined: Self = StObject.set(x, "SessionLifetimeInMinutes", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
