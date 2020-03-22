package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * Change the state of a CloudWatch alarm.
    */
  var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.native
  /**
    * Send data to CloudWatch logs.
    */
  var cloudwatchLogs: js.UndefOr[CloudwatchLogsAction] = js.native
  /**
    * Capture a CloudWatch metric.
    */
  var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.native
  /**
    * Write to a DynamoDB table.
    */
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.native
  /**
    * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT message payload into a separate DynamoDB column.
    */
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.native
  /**
    * Write data to an Amazon Elasticsearch Service domain.
    */
  var elasticsearch: js.UndefOr[ElasticsearchAction] = js.native
  /**
    * Write to an Amazon Kinesis Firehose stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.native
  /**
    * Send data to an HTTPS endpoint.
    */
  var http: js.UndefOr[HttpAction] = js.native
  /**
    * Sends message data to an AWS IoT Analytics channel.
    */
  var iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.native
  /**
    * Sends an input to an AWS IoT Events detector.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.native
  /**
    * Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise asset properties.
    */
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.native
  /**
    * Write data to an Amazon Kinesis stream.
    */
  var kinesis: js.UndefOr[KinesisAction] = js.native
  /**
    * Invoke a Lambda function.
    */
  var lambda: js.UndefOr[LambdaAction] = js.native
  /**
    * Publish to another MQTT topic.
    */
  var republish: js.UndefOr[RepublishAction] = js.native
  /**
    * Write to an Amazon S3 bucket.
    */
  var s3: js.UndefOr[S3Action] = js.native
  /**
    * Send a message to a Salesforce IoT Cloud Input Stream.
    */
  var salesforce: js.UndefOr[SalesforceAction] = js.native
  /**
    * Publish to an Amazon SNS topic.
    */
  var sns: js.UndefOr[SnsAction] = js.native
  /**
    * Publish to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.native
  /**
    * Starts execution of a Step Functions state machine.
    */
  var stepFunctions: js.UndefOr[StepFunctionsAction] = js.native
}

object Action {
  @scala.inline
  def apply(
    cloudwatchAlarm: CloudwatchAlarmAction = null,
    cloudwatchLogs: CloudwatchLogsAction = null,
    cloudwatchMetric: CloudwatchMetricAction = null,
    dynamoDB: DynamoDBAction = null,
    dynamoDBv2: DynamoDBv2Action = null,
    elasticsearch: ElasticsearchAction = null,
    firehose: FirehoseAction = null,
    http: HttpAction = null,
    iotAnalytics: IotAnalyticsAction = null,
    iotEvents: IotEventsAction = null,
    iotSiteWise: IotSiteWiseAction = null,
    kinesis: KinesisAction = null,
    lambda: LambdaAction = null,
    republish: RepublishAction = null,
    s3: S3Action = null,
    salesforce: SalesforceAction = null,
    sns: SnsAction = null,
    sqs: SqsAction = null,
    stepFunctions: StepFunctionsAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchAlarm != null) __obj.updateDynamic("cloudwatchAlarm")(cloudwatchAlarm.asInstanceOf[js.Any])
    if (cloudwatchLogs != null) __obj.updateDynamic("cloudwatchLogs")(cloudwatchLogs.asInstanceOf[js.Any])
    if (cloudwatchMetric != null) __obj.updateDynamic("cloudwatchMetric")(cloudwatchMetric.asInstanceOf[js.Any])
    if (dynamoDB != null) __obj.updateDynamic("dynamoDB")(dynamoDB.asInstanceOf[js.Any])
    if (dynamoDBv2 != null) __obj.updateDynamic("dynamoDBv2")(dynamoDBv2.asInstanceOf[js.Any])
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (iotAnalytics != null) __obj.updateDynamic("iotAnalytics")(iotAnalytics.asInstanceOf[js.Any])
    if (iotEvents != null) __obj.updateDynamic("iotEvents")(iotEvents.asInstanceOf[js.Any])
    if (iotSiteWise != null) __obj.updateDynamic("iotSiteWise")(iotSiteWise.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (republish != null) __obj.updateDynamic("republish")(republish.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (salesforce != null) __obj.updateDynamic("salesforce")(salesforce.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (stepFunctions != null) __obj.updateDynamic("stepFunctions")(stepFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

