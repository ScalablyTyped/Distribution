package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    clearTimer: ClearTimerAction = null,
    dynamoDB: DynamoDBAction = null,
    dynamoDBv2: DynamoDBv2Action = null,
    firehose: FirehoseAction = null,
    iotEvents: IotEventsAction = null,
    iotSiteWise: IotSiteWiseAction = null,
    iotTopicPublish: IotTopicPublishAction = null,
    lambda: LambdaAction = null,
    resetTimer: ResetTimerAction = null,
    setTimer: SetTimerAction = null,
    setVariable: SetVariableAction = null,
    sns: SNSTopicPublishAction = null,
    sqs: SqsAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (clearTimer != null) __obj.updateDynamic("clearTimer")(clearTimer.asInstanceOf[js.Any])
    if (dynamoDB != null) __obj.updateDynamic("dynamoDB")(dynamoDB.asInstanceOf[js.Any])
    if (dynamoDBv2 != null) __obj.updateDynamic("dynamoDBv2")(dynamoDBv2.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (iotEvents != null) __obj.updateDynamic("iotEvents")(iotEvents.asInstanceOf[js.Any])
    if (iotSiteWise != null) __obj.updateDynamic("iotSiteWise")(iotSiteWise.asInstanceOf[js.Any])
    if (iotTopicPublish != null) __obj.updateDynamic("iotTopicPublish")(iotTopicPublish.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (resetTimer != null) __obj.updateDynamic("resetTimer")(resetTimer.asInstanceOf[js.Any])
    if (setTimer != null) __obj.updateDynamic("setTimer")(setTimer.asInstanceOf[js.Any])
    if (setVariable != null) __obj.updateDynamic("setVariable")(setVariable.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

