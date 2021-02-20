package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyConfigurationType extends StObject {
  
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.native
  
  /**
    * The MFA email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType = js.native
}
object NotifyConfigurationType {
  
  @scala.inline
  def apply(SourceArn: ArnType): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyConfigurationType]
  }
  
  @scala.inline
  implicit class NotifyConfigurationTypeMutableBuilder[Self <: NotifyConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockEmail(value: NotifyEmailType): Self = StObject.set(x, "BlockEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockEmailUndefined: Self = StObject.set(x, "BlockEmail", js.undefined)
    
    @scala.inline
    def setFrom(value: StringType): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    @scala.inline
    def setMfaEmail(value: NotifyEmailType): Self = StObject.set(x, "MfaEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaEmailUndefined: Self = StObject.set(x, "MfaEmail", js.undefined)
    
    @scala.inline
    def setNoActionEmail(value: NotifyEmailType): Self = StObject.set(x, "NoActionEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoActionEmailUndefined: Self = StObject.set(x, "NoActionEmail", js.undefined)
    
    @scala.inline
    def setReplyTo(value: StringType): Self = StObject.set(x, "ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToUndefined: Self = StObject.set(x, "ReplyTo", js.undefined)
    
    @scala.inline
    def setSourceArn(value: ArnType): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
  }
}
