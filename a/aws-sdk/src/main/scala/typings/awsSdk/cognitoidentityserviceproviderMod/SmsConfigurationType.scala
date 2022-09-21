package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsConfigurationType extends StObject {
  
  /**
    * The external ID provides additional security for your IAM role. You can use an ExternalId with the IAM role that you use with Amazon SNS to send SMS messages for your user pool. If you provide an ExternalId, your Amazon Cognito user pool includes it in the request to assume your IAM role. You can configure the role trust policy to require that Amazon Cognito, and any principal, provide the ExternalID. If you use the Amazon Cognito Management Console to create a role for SMS multi-factor authentication (MFA), Amazon Cognito creates a role with the required permissions and a trust policy that demonstrates use of the ExternalId. For more information about the ExternalId of a role, see How to use an external ID when granting access to your Amazon Web Services resources to a third party 
    */
  var ExternalId: js.UndefOr[StringType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS caller. This is the ARN of the IAM role in your Amazon Web Services account that Amazon Cognito will use to send SMS messages. SMS messages are subject to a spending limit. 
    */
  var SnsCallerArn: ArnType
  
  /**
    * The Amazon Web Services Region to use with Amazon SNS integration. You can choose the same Region as your user pool, or a supported Legacy Amazon SNS alternate Region.   Amazon Cognito resources in the Asia Pacific (Seoul) Amazon Web Services Region must use your Amazon SNS configuration in the Asia Pacific (Tokyo) Region. For more information, see SMS message settings for Amazon Cognito user pools.
    */
  var SnsRegion: js.UndefOr[RegionCodeType] = js.undefined
}
object SmsConfigurationType {
  
  inline def apply(SnsCallerArn: ArnType): SmsConfigurationType = {
    val __obj = js.Dynamic.literal(SnsCallerArn = SnsCallerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsConfigurationType]
  }
  
  extension [Self <: SmsConfigurationType](x: Self) {
    
    inline def setExternalId(value: StringType): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setSnsCallerArn(value: ArnType): Self = StObject.set(x, "SnsCallerArn", value.asInstanceOf[js.Any])
    
    inline def setSnsRegion(value: RegionCodeType): Self = StObject.set(x, "SnsRegion", value.asInstanceOf[js.Any])
    
    inline def setSnsRegionUndefined: Self = StObject.set(x, "SnsRegion", js.undefined)
  }
}
