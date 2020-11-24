package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.native
  
  /**
    * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the payload. One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more information, see Actions in AWS IoT Events Developer Guide.
    */
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.native
  
  /**
    * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the payload. A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify. For more information, see Actions in AWS IoT Events Developer Guide.
    */
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.native
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.native
  
  /**
    * Sends AWS IoT Events input, which passes information about the detector model instance and the event that triggered the action.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.native
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an asset property in AWS IoT SiteWise .
    */
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.native
  
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT message broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.native
  
  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
    */
  var lambda: js.UndefOr[LambdaAction] = js.native
  
  /**
    * Information needed to reset the timer.
    */
  var resetTimer: js.UndefOr[ResetTimerAction] = js.native
  
  /**
    * Information needed to set the timer.
    */
  var setTimer: js.UndefOr[SetTimerAction] = js.native
  
  /**
    * Sets a variable to a specified value.
    */
  var setVariable: js.UndefOr[SetVariableAction] = js.native
  
  /**
    * Sends an Amazon SNS message.
    */
  var sns: js.UndefOr[SNSTopicPublishAction] = js.native
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.native
}
object Action {
  
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setClearTimer(value: ClearTimerAction): Self = this.set("clearTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTimer: Self = this.set("clearTimer", js.undefined)
    
    @scala.inline
    def setDynamoDB(value: DynamoDBAction): Self = this.set("dynamoDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamoDB: Self = this.set("dynamoDB", js.undefined)
    
    @scala.inline
    def setDynamoDBv2(value: DynamoDBv2Action): Self = this.set("dynamoDBv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamoDBv2: Self = this.set("dynamoDBv2", js.undefined)
    
    @scala.inline
    def setFirehose(value: FirehoseAction): Self = this.set("firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    
    @scala.inline
    def setIotEvents(value: IotEventsAction): Self = this.set("iotEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotEvents: Self = this.set("iotEvents", js.undefined)
    
    @scala.inline
    def setIotSiteWise(value: IotSiteWiseAction): Self = this.set("iotSiteWise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotSiteWise: Self = this.set("iotSiteWise", js.undefined)
    
    @scala.inline
    def setIotTopicPublish(value: IotTopicPublishAction): Self = this.set("iotTopicPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIotTopicPublish: Self = this.set("iotTopicPublish", js.undefined)
    
    @scala.inline
    def setLambda(value: LambdaAction): Self = this.set("lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    
    @scala.inline
    def setResetTimer(value: ResetTimerAction): Self = this.set("resetTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetTimer: Self = this.set("resetTimer", js.undefined)
    
    @scala.inline
    def setSetTimer(value: SetTimerAction): Self = this.set("setTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetTimer: Self = this.set("setTimer", js.undefined)
    
    @scala.inline
    def setSetVariable(value: SetVariableAction): Self = this.set("setVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetVariable: Self = this.set("setVariable", js.undefined)
    
    @scala.inline
    def setSns(value: SNSTopicPublishAction): Self = this.set("sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    
    @scala.inline
    def setSqs(value: SqsAction): Self = this.set("sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
  }
}
