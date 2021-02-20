package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
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
  
  /**
    * The Timestream rule action writes attributes (measures) from an MQTT message into an Amazon Timestream table. For more information, see the Timestream topic rule action documentation.
    */
  var timestream: js.UndefOr[TimestreamAction] = js.native
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
    def setCloudwatchAlarm(value: CloudwatchAlarmAction): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    @scala.inline
    def setCloudwatchLogs(value: CloudwatchLogsAction): Self = StObject.set(x, "cloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogsUndefined: Self = StObject.set(x, "cloudwatchLogs", js.undefined)
    
    @scala.inline
    def setCloudwatchMetric(value: CloudwatchMetricAction): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    @scala.inline
    def setDynamoDB(value: DynamoDBAction): Self = StObject.set(x, "dynamoDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBUndefined: Self = StObject.set(x, "dynamoDB", js.undefined)
    
    @scala.inline
    def setDynamoDBv2(value: DynamoDBv2Action): Self = StObject.set(x, "dynamoDBv2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBv2Undefined: Self = StObject.set(x, "dynamoDBv2", js.undefined)
    
    @scala.inline
    def setElasticsearch(value: ElasticsearchAction): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    @scala.inline
    def setFirehose(value: FirehoseAction): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setHttp(value: HttpAction): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setIotAnalytics(value: IotAnalyticsAction): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    @scala.inline
    def setIotEvents(value: IotEventsAction): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    @scala.inline
    def setIotSiteWise(value: IotSiteWiseAction): Self = StObject.set(x, "iotSiteWise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotSiteWiseUndefined: Self = StObject.set(x, "iotSiteWise", js.undefined)
    
    @scala.inline
    def setKinesis(value: KinesisAction): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setLambda(value: LambdaAction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    @scala.inline
    def setRepublish(value: RepublishAction): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    @scala.inline
    def setS3(value: S3Action): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setSalesforce(value: SalesforceAction): Self = StObject.set(x, "salesforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceUndefined: Self = StObject.set(x, "salesforce", js.undefined)
    
    @scala.inline
    def setSns(value: SnsAction): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    @scala.inline
    def setSqs(value: SqsAction): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    @scala.inline
    def setStepFunctions(value: StepFunctionsAction): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
    
    @scala.inline
    def setTimestream(value: TimestreamAction): Self = StObject.set(x, "timestream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestreamUndefined: Self = StObject.set(x, "timestream", js.undefined)
  }
}
