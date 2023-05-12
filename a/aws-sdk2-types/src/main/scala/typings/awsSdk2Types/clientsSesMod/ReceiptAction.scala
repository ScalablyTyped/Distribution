package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiptAction extends StObject {
  
  /**
    * Adds a header to the received email.
    */
  var AddHeaderAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.AddHeaderAction] = js.undefined
  
  /**
    * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    */
  var BounceAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.BounceAction] = js.undefined
  
  /**
    * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
    */
  var LambdaAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.LambdaAction] = js.undefined
  
  /**
    * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
    */
  var S3Action: js.UndefOr[typings.awsSdk2Types.clientsSesMod.S3Action] = js.undefined
  
  /**
    * Publishes the email content within a notification to Amazon SNS.
    */
  var SNSAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.SNSAction] = js.undefined
  
  /**
    * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
    */
  var StopAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.StopAction] = js.undefined
  
  /**
    * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
    */
  var WorkmailAction: js.UndefOr[typings.awsSdk2Types.clientsSesMod.WorkmailAction] = js.undefined
}
object ReceiptAction {
  
  inline def apply(): ReceiptAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiptAction] (val x: Self) extends AnyVal {
    
    inline def setAddHeaderAction(value: AddHeaderAction): Self = StObject.set(x, "AddHeaderAction", value.asInstanceOf[js.Any])
    
    inline def setAddHeaderActionUndefined: Self = StObject.set(x, "AddHeaderAction", js.undefined)
    
    inline def setBounceAction(value: BounceAction): Self = StObject.set(x, "BounceAction", value.asInstanceOf[js.Any])
    
    inline def setBounceActionUndefined: Self = StObject.set(x, "BounceAction", js.undefined)
    
    inline def setLambdaAction(value: LambdaAction): Self = StObject.set(x, "LambdaAction", value.asInstanceOf[js.Any])
    
    inline def setLambdaActionUndefined: Self = StObject.set(x, "LambdaAction", js.undefined)
    
    inline def setS3Action(value: S3Action): Self = StObject.set(x, "S3Action", value.asInstanceOf[js.Any])
    
    inline def setS3ActionUndefined: Self = StObject.set(x, "S3Action", js.undefined)
    
    inline def setSNSAction(value: SNSAction): Self = StObject.set(x, "SNSAction", value.asInstanceOf[js.Any])
    
    inline def setSNSActionUndefined: Self = StObject.set(x, "SNSAction", js.undefined)
    
    inline def setStopAction(value: StopAction): Self = StObject.set(x, "StopAction", value.asInstanceOf[js.Any])
    
    inline def setStopActionUndefined: Self = StObject.set(x, "StopAction", js.undefined)
    
    inline def setWorkmailAction(value: WorkmailAction): Self = StObject.set(x, "WorkmailAction", value.asInstanceOf[js.Any])
    
    inline def setWorkmailActionUndefined: Self = StObject.set(x, "WorkmailAction", js.undefined)
  }
}
