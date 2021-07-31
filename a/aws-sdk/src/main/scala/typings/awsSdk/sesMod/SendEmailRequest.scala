package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEmailRequest extends StObject {
  
  /**
    * The name of the configuration set to use when you send an email using SendEmail.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSetName] = js.undefined
  
  /**
    * The destination for this email, composed of To:, CC:, and BCC: fields.
    */
  var Destination: typings.awsSdk.sesMod.Destination
  
  /**
    * The message to be sent.
    */
  var Message: typings.awsSdk.sesMod.Message
  
  /**
    * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[AddressList] = js.undefined
  
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
    */
  var ReturnPath: js.UndefOr[Address] = js.undefined
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
    */
  var Source: Address
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var Tags: js.UndefOr[MessageTagList] = js.undefined
}
object SendEmailRequest {
  
  @scala.inline
  def apply(Destination: Destination, Message: Message, Source: Address): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailRequest]
  }
  
  @scala.inline
  implicit class SendEmailRequestMutableBuilder[Self <: SendEmailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddresses(value: AddressList): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: Address*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setReturnPath(value: Address): Self = StObject.set(x, "ReturnPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathArn(value: AmazonResourceName): Self = StObject.set(x, "ReturnPathArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathArnUndefined: Self = StObject.set(x, "ReturnPathArn", js.undefined)
    
    @scala.inline
    def setReturnPathUndefined: Self = StObject.set(x, "ReturnPath", js.undefined)
    
    @scala.inline
    def setSource(value: Address): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArn(value: AmazonResourceName): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: MessageTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: MessageTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
