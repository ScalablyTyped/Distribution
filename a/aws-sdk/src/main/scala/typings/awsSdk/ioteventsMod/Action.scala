package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
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
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearTimer(value: ClearTimerAction): Self = StObject.set(x, "clearTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTimerUndefined: Self = StObject.set(x, "clearTimer", js.undefined)
    
    @scala.inline
    def setDynamoDB(value: DynamoDBAction): Self = StObject.set(x, "dynamoDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBUndefined: Self = StObject.set(x, "dynamoDB", js.undefined)
    
    @scala.inline
    def setDynamoDBv2(value: DynamoDBv2Action): Self = StObject.set(x, "dynamoDBv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBv2Undefined: Self = StObject.set(x, "dynamoDBv2", js.undefined)
    
    @scala.inline
    def setFirehose(value: FirehoseAction): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setIotEvents(value: IotEventsAction): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    @scala.inline
    def setIotSiteWise(value: IotSiteWiseAction): Self = StObject.set(x, "iotSiteWise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotSiteWiseUndefined: Self = StObject.set(x, "iotSiteWise", js.undefined)
    
    @scala.inline
    def setIotTopicPublish(value: IotTopicPublishAction): Self = StObject.set(x, "iotTopicPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotTopicPublishUndefined: Self = StObject.set(x, "iotTopicPublish", js.undefined)
    
    @scala.inline
    def setLambda(value: LambdaAction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setResetTimer(value: ResetTimerAction): Self = StObject.set(x, "resetTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetTimerUndefined: Self = StObject.set(x, "resetTimer", js.undefined)
    
    @scala.inline
    def setSetTimer(value: SetTimerAction): Self = StObject.set(x, "setTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTimerUndefined: Self = StObject.set(x, "setTimer", js.undefined)
    
    @scala.inline
    def setSetVariable(value: SetVariableAction): Self = StObject.set(x, "setVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVariableUndefined: Self = StObject.set(x, "setVariable", js.undefined)
    
    @scala.inline
    def setSns(value: SNSTopicPublishAction): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: SqsAction): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
  }
}
