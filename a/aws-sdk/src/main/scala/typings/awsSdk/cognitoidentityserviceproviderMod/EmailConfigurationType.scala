package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailConfigurationType extends StObject {
  
  /**
    * The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A configuration set is applied to an email by including a reference to the configuration set in the headers of the email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can be used to apply the following types of rules to emails:   Event publishing  Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint events for each email sent. Use event publishing to send information about these events to other Amazon Web Services services such as and Amazon CloudWatch  IP pool management  When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP addresses, called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.  
    */
  var ConfigurationSet: js.UndefOr[SESConfigurationSet] = js.undefined
  
  /**
    * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your Amazon Simple Email Service email configuration. Specify one of the following values:  COGNITO_DEFAULT  When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production environments, the default email limit is less than the required delivery volume. To achieve a higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration. To look up the email delivery limit for the default option, see Limits in  in the  Developer Guide. The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the SourceArn parameter.  DEVELOPER  When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on your behalf to send email from your verified email address. When you use this option, the email delivery limits are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account. If you use this option, provide the ARN of an Amazon SES verified email address for the SourceArn parameter. Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf. When you update your user pool with this option, Amazon Cognito creates a service-linked role, which is a type of role, in your Amazon Web Services account. This role contains the permissions that allow to access Amazon SES and send email messages with your address. For more information about the service-linked role that Amazon Cognito creates, see Using Service-Linked Roles for Amazon Cognito in the Amazon Cognito Developer Guide.  
    */
  var EmailSendingAccount: js.UndefOr[EmailSendingAccountType] = js.undefined
  
  /**
    * Either the sender’s email address or the sender’s name with their email address. For example, testuser@example.com or Test User &lt;testuser@example.com&gt;. This address appears before the body of the email.
    */
  var From: js.UndefOr[StringType] = js.undefined
  
  /**
    * The destination to which the receiver of the email should reply.
    */
  var ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  
  /**
    * The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the following ways, depending on the value that you specify for the EmailSendingAccount parameter:   If you specify COGNITO_DEFAULT, Amazon Cognito uses this address as the custom FROM address when it emails your users using its built-in email account.   If you specify DEVELOPER, Amazon Cognito emails your users with this address by calling Amazon SES on your behalf.   The Region value of the SourceArn parameter must indicate a supported Amazon Web Services Region of your user pool. Typically, the Region in the SourceArn and the user pool Region are the same. For more information, see Amazon SES email configuration regions in the Amazon Cognito Developer Guide.
    */
  var SourceArn: js.UndefOr[ArnType] = js.undefined
}
object EmailConfigurationType {
  
  inline def apply(): EmailConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailConfigurationType]
  }
  
  extension [Self <: EmailConfigurationType](x: Self) {
    
    inline def setConfigurationSet(value: SESConfigurationSet): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
    
    inline def setEmailSendingAccount(value: EmailSendingAccountType): Self = StObject.set(x, "EmailSendingAccount", value.asInstanceOf[js.Any])
    
    inline def setEmailSendingAccountUndefined: Self = StObject.set(x, "EmailSendingAccount", js.undefined)
    
    inline def setFrom(value: StringType): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setReplyToEmailAddress(value: EmailAddressType): Self = StObject.set(x, "ReplyToEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setReplyToEmailAddressUndefined: Self = StObject.set(x, "ReplyToEmailAddress", js.undefined)
    
    inline def setSourceArn(value: ArnType): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
  }
}
