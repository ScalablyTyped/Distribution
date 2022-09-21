package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Information needed to clear the timer.
    */
  var clearTimer: js.UndefOr[ClearTimerAction] = js.undefined
  
  /**
    * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can customize the payload. One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more information, see Actions in AWS IoT Events Developer Guide.
    */
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined
  
  /**
    * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can customize the payload. A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify. For more information, see Actions in AWS IoT Events Developer Guide.
    */
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.undefined
  
  /**
    * Sends AWS IoT Events input, which passes information about the detector model instance and the event that triggered the action.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an asset property in AWS IoT SiteWise .
    */
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined
  
  /**
    * Publishes an MQTT message with the given topic to the AWS IoT message broker.
    */
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined
  
  /**
    * Calls a Lambda function, passing in information about the detector model instance and the event that triggered the action.
    */
  var lambda: js.UndefOr[LambdaAction] = js.undefined
  
  /**
    * Information needed to reset the timer.
    */
  var resetTimer: js.UndefOr[ResetTimerAction] = js.undefined
  
  /**
    * Information needed to set the timer.
    */
  var setTimer: js.UndefOr[SetTimerAction] = js.undefined
  
  /**
    * Sets a variable to a specified value.
    */
  var setVariable: js.UndefOr[SetVariableAction] = js.undefined
  
  /**
    * Sends an Amazon SNS message.
    */
  var sns: js.UndefOr[SNSTopicPublishAction] = js.undefined
  
  /**
    * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setClearTimer(value: ClearTimerAction): Self = StObject.set(x, "clearTimer", value.asInstanceOf[js.Any])
    
    inline def setClearTimerUndefined: Self = StObject.set(x, "clearTimer", js.undefined)
    
    inline def setDynamoDB(value: DynamoDBAction): Self = StObject.set(x, "dynamoDB", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBUndefined: Self = StObject.set(x, "dynamoDB", js.undefined)
    
    inline def setDynamoDBv2(value: DynamoDBv2Action): Self = StObject.set(x, "dynamoDBv2", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBv2Undefined: Self = StObject.set(x, "dynamoDBv2", js.undefined)
    
    inline def setFirehose(value: FirehoseAction): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setIotEvents(value: IotEventsAction): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    inline def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    inline def setIotSiteWise(value: IotSiteWiseAction): Self = StObject.set(x, "iotSiteWise", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseUndefined: Self = StObject.set(x, "iotSiteWise", js.undefined)
    
    inline def setIotTopicPublish(value: IotTopicPublishAction): Self = StObject.set(x, "iotTopicPublish", value.asInstanceOf[js.Any])
    
    inline def setIotTopicPublishUndefined: Self = StObject.set(x, "iotTopicPublish", js.undefined)
    
    inline def setLambda(value: LambdaAction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setResetTimer(value: ResetTimerAction): Self = StObject.set(x, "resetTimer", value.asInstanceOf[js.Any])
    
    inline def setResetTimerUndefined: Self = StObject.set(x, "resetTimer", js.undefined)
    
    inline def setSetTimer(value: SetTimerAction): Self = StObject.set(x, "setTimer", value.asInstanceOf[js.Any])
    
    inline def setSetTimerUndefined: Self = StObject.set(x, "setTimer", js.undefined)
    
    inline def setSetVariable(value: SetVariableAction): Self = StObject.set(x, "setVariable", value.asInstanceOf[js.Any])
    
    inline def setSetVariableUndefined: Self = StObject.set(x, "setVariable", js.undefined)
    
    inline def setSns(value: SNSTopicPublishAction): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: SqsAction): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
  }
}
