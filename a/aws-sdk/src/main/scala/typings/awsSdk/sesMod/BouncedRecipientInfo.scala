package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BouncedRecipientInfo extends StObject {
  
  /**
    * The reason for the bounce. You must provide either this parameter or RecipientDsnFields.
    */
  var BounceType: js.UndefOr[typings.awsSdk.sesMod.BounceType] = js.native
  
  /**
    * The email address of the recipient of the bounced email.
    */
  var Recipient: Address = js.native
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to receive email for the recipient of the bounced email. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var RecipientArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a BounceType. You must provide either this parameter or BounceType.
    */
  var RecipientDsnFields: js.UndefOr[typings.awsSdk.sesMod.RecipientDsnFields] = js.native
}
object BouncedRecipientInfo {
  
  @scala.inline
  def apply(Recipient: Address): BouncedRecipientInfo = {
    val __obj = js.Dynamic.literal(Recipient = Recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BouncedRecipientInfo]
  }
  
  @scala.inline
  implicit class BouncedRecipientInfoMutableBuilder[Self <: BouncedRecipientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounceType(value: BounceType): Self = StObject.set(x, "BounceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceTypeUndefined: Self = StObject.set(x, "BounceType", js.undefined)
    
    @scala.inline
    def setRecipient(value: Address): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientArn(value: AmazonResourceName): Self = StObject.set(x, "RecipientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientArnUndefined: Self = StObject.set(x, "RecipientArn", js.undefined)
    
    @scala.inline
    def setRecipientDsnFields(value: RecipientDsnFields): Self = StObject.set(x, "RecipientDsnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientDsnFieldsUndefined: Self = StObject.set(x, "RecipientDsnFields", js.undefined)
  }
}
