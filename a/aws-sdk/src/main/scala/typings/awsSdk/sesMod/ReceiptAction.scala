package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptAction extends js.Object {
  
  /**
    * Adds a header to the received email.
    */
  var AddHeaderAction: js.UndefOr[typings.awsSdk.sesMod.AddHeaderAction] = js.native
  
  /**
    * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    */
  var BounceAction: js.UndefOr[typings.awsSdk.sesMod.BounceAction] = js.native
  
  /**
    * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
    */
  var LambdaAction: js.UndefOr[typings.awsSdk.sesMod.LambdaAction] = js.native
  
  /**
    * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
    */
  var S3Action: js.UndefOr[typings.awsSdk.sesMod.S3Action] = js.native
  
  /**
    * Publishes the email content within a notification to Amazon SNS.
    */
  var SNSAction: js.UndefOr[typings.awsSdk.sesMod.SNSAction] = js.native
  
  /**
    * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
    */
  var StopAction: js.UndefOr[typings.awsSdk.sesMod.StopAction] = js.native
  
  /**
    * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
    */
  var WorkmailAction: js.UndefOr[typings.awsSdk.sesMod.WorkmailAction] = js.native
}
object ReceiptAction {
  
  @scala.inline
  def apply(): ReceiptAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptAction]
  }
  
  @scala.inline
  implicit class ReceiptActionOps[Self <: ReceiptAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddHeaderAction(value: AddHeaderAction): Self = this.set("AddHeaderAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddHeaderAction: Self = this.set("AddHeaderAction", js.undefined)
    
    @scala.inline
    def setBounceAction(value: BounceAction): Self = this.set("BounceAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceAction: Self = this.set("BounceAction", js.undefined)
    
    @scala.inline
    def setLambdaAction(value: LambdaAction): Self = this.set("LambdaAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaAction: Self = this.set("LambdaAction", js.undefined)
    
    @scala.inline
    def setS3Action(value: S3Action): Self = this.set("S3Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Action: Self = this.set("S3Action", js.undefined)
    
    @scala.inline
    def setSNSAction(value: SNSAction): Self = this.set("SNSAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNSAction: Self = this.set("SNSAction", js.undefined)
    
    @scala.inline
    def setStopAction(value: StopAction): Self = this.set("StopAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopAction: Self = this.set("StopAction", js.undefined)
    
    @scala.inline
    def setWorkmailAction(value: WorkmailAction): Self = this.set("WorkmailAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkmailAction: Self = this.set("WorkmailAction", js.undefined)
  }
}
