package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiptAction extends StObject {
  
  /**
    * Adds a header to the received email.
    */
  var AddHeaderAction: js.UndefOr[typings.awsSdk.sesMod.AddHeaderAction] = js.undefined
  
  /**
    * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    */
  var BounceAction: js.UndefOr[typings.awsSdk.sesMod.BounceAction] = js.undefined
  
  /**
    * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
    */
  var LambdaAction: js.UndefOr[typings.awsSdk.sesMod.LambdaAction] = js.undefined
  
  /**
    * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
    */
  var S3Action: js.UndefOr[typings.awsSdk.sesMod.S3Action] = js.undefined
  
  /**
    * Publishes the email content within a notification to Amazon SNS.
    */
  var SNSAction: js.UndefOr[typings.awsSdk.sesMod.SNSAction] = js.undefined
  
  /**
    * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
    */
  var StopAction: js.UndefOr[typings.awsSdk.sesMod.StopAction] = js.undefined
  
  /**
    * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
    */
  var WorkmailAction: js.UndefOr[typings.awsSdk.sesMod.WorkmailAction] = js.undefined
}
object ReceiptAction {
  
  @scala.inline
  def apply(): ReceiptAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptAction]
  }
  
  @scala.inline
  implicit class ReceiptActionMutableBuilder[Self <: ReceiptAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddHeaderAction(value: AddHeaderAction): Self = StObject.set(x, "AddHeaderAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddHeaderActionUndefined: Self = StObject.set(x, "AddHeaderAction", js.undefined)
    
    @scala.inline
    def setBounceAction(value: BounceAction): Self = StObject.set(x, "BounceAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceActionUndefined: Self = StObject.set(x, "BounceAction", js.undefined)
    
    @scala.inline
    def setLambdaAction(value: LambdaAction): Self = StObject.set(x, "LambdaAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaActionUndefined: Self = StObject.set(x, "LambdaAction", js.undefined)
    
    @scala.inline
    def setS3Action(value: S3Action): Self = StObject.set(x, "S3Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ActionUndefined: Self = StObject.set(x, "S3Action", js.undefined)
    
    @scala.inline
    def setSNSAction(value: SNSAction): Self = StObject.set(x, "SNSAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNSActionUndefined: Self = StObject.set(x, "SNSAction", js.undefined)
    
    @scala.inline
    def setStopAction(value: StopAction): Self = StObject.set(x, "StopAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopActionUndefined: Self = StObject.set(x, "StopAction", js.undefined)
    
    @scala.inline
    def setWorkmailAction(value: WorkmailAction): Self = StObject.set(x, "WorkmailAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkmailActionUndefined: Self = StObject.set(x, "WorkmailAction", js.undefined)
  }
}
