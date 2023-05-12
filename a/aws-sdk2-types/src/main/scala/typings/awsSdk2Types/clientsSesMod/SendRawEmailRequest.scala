package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendRawEmailRequest extends StObject {
  
  /**
    * The name of the configuration set to use when you send an email using SendRawEmail.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk2Types.clientsSesMod.ConfigurationSetName] = js.undefined
  
  /**
    * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
    */
  var Destinations: js.UndefOr[AddressList] = js.undefined
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to specify a particular "From" address in the header of the raw email. Instead of using this parameter, you can use the X-header X-SES-FROM-ARN in the raw message of the email. If you use both the FromArn parameter and the corresponding X-header, Amazon SES uses the value of the FromArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
    */
  var FromArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The raw email message itself. The message has to meet the following criteria:   The message has to contain a header and a body, separated by a blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see Unsupported Attachment Types in the Amazon SES Developer Guide.   The entire message must be base64-encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we highly recommend that you encode that content. For more information, see Sending Raw Email in the Amazon SES Developer Guide.   Per RFC 5321, the maximum length of each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.  
    */
  var RawMessage: typings.awsSdk2Types.clientsSesMod.RawMessage
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. Instead of using this parameter, you can use the X-header X-SES-RETURN-PATH-ARN in the raw message of the email. If you use both the ReturnPathArn parameter and the corresponding X-header, Amazon SES uses the value of the ReturnPathArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
    */
  var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address in the raw text of the message. (You can also specify both.)  Amazon SES does not support the SMTPUTF8 extension, as described inRFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=.  If you specify the Source parameter and have feedback forwarding enabled, then bounces and complaints will be sent to this email address. This takes precedence over any Return-Path header that you might include in the raw text of the message.
    */
  var Source: js.UndefOr[Address] = js.undefined
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. Instead of using this parameter, you can use the X-header X-SES-SOURCE-ARN in the raw message of the email. If you use both the SourceArn parameter and the corresponding X-header, Amazon SES uses the value of the SourceArn parameter.  For information about when to use this parameter, see the description of SendRawEmail in this guide, or see the Amazon SES Developer Guide. 
    */
  var SourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendRawEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var Tags: js.UndefOr[MessageTagList] = js.undefined
}
object SendRawEmailRequest {
  
  inline def apply(RawMessage: RawMessage): SendRawEmailRequest = {
    val __obj = js.Dynamic.literal(RawMessage = RawMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendRawEmailRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendRawEmailRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setDestinations(value: AddressList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Address*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setFromArn(value: AmazonResourceName): Self = StObject.set(x, "FromArn", value.asInstanceOf[js.Any])
    
    inline def setFromArnUndefined: Self = StObject.set(x, "FromArn", js.undefined)
    
    inline def setRawMessage(value: RawMessage): Self = StObject.set(x, "RawMessage", value.asInstanceOf[js.Any])
    
    inline def setReturnPathArn(value: AmazonResourceName): Self = StObject.set(x, "ReturnPathArn", value.asInstanceOf[js.Any])
    
    inline def setReturnPathArnUndefined: Self = StObject.set(x, "ReturnPathArn", js.undefined)
    
    inline def setSource(value: Address): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: AmazonResourceName): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTags(value: MessageTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: MessageTag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
