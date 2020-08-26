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
    * Send data to CloudWatch Logs.
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudwatchAlarm(value: CloudwatchAlarmAction): Self = this.set("cloudwatchAlarm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchAlarm: Self = this.set("cloudwatchAlarm", js.undefined)
    @scala.inline
    def setCloudwatchLogs(value: CloudwatchLogsAction): Self = this.set("cloudwatchLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLogs: Self = this.set("cloudwatchLogs", js.undefined)
    @scala.inline
    def setCloudwatchMetric(value: CloudwatchMetricAction): Self = this.set("cloudwatchMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchMetric: Self = this.set("cloudwatchMetric", js.undefined)
    @scala.inline
    def setDynamoDB(value: DynamoDBAction): Self = this.set("dynamoDB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDB: Self = this.set("dynamoDB", js.undefined)
    @scala.inline
    def setDynamoDBv2(value: DynamoDBv2Action): Self = this.set("dynamoDBv2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDBv2: Self = this.set("dynamoDBv2", js.undefined)
    @scala.inline
    def setElasticsearch(value: ElasticsearchAction): Self = this.set("elasticsearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearch: Self = this.set("elasticsearch", js.undefined)
    @scala.inline
    def setFirehose(value: FirehoseAction): Self = this.set("firehose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    @scala.inline
    def setHttp(value: HttpAction): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setIotAnalytics(value: IotAnalyticsAction): Self = this.set("iotAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotAnalytics: Self = this.set("iotAnalytics", js.undefined)
    @scala.inline
    def setIotEvents(value: IotEventsAction): Self = this.set("iotEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotEvents: Self = this.set("iotEvents", js.undefined)
    @scala.inline
    def setIotSiteWise(value: IotSiteWiseAction): Self = this.set("iotSiteWise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIotSiteWise: Self = this.set("iotSiteWise", js.undefined)
    @scala.inline
    def setKinesis(value: KinesisAction): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    @scala.inline
    def setLambda(value: LambdaAction): Self = this.set("lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
    @scala.inline
    def setRepublish(value: RepublishAction): Self = this.set("republish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepublish: Self = this.set("republish", js.undefined)
    @scala.inline
    def setS3(value: S3Action): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    @scala.inline
    def setSalesforce(value: SalesforceAction): Self = this.set("salesforce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalesforce: Self = this.set("salesforce", js.undefined)
    @scala.inline
    def setSns(value: SnsAction): Self = this.set("sns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
    @scala.inline
    def setSqs(value: SqsAction): Self = this.set("sqs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    @scala.inline
    def setStepFunctions(value: StepFunctionsAction): Self = this.set("stepFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepFunctions: Self = this.set("stepFunctions", js.undefined)
  }
  
}

