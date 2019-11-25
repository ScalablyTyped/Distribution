package typings.atAwsDashSdkClientDashLambdaDashNode.typesGetEventSourceMappingOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventSourceMappingOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your function. Your function receives an event with all the retrieved records.</p>
    */
  var BatchSize: js.UndefOr[Double] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the Amazon Kinesis or DynamoDB stream that is the source of events.</p>
    */
  var EventSourceArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The Lambda function to invoke when AWS Lambda detects an event on the poll-based source.</p>
    */
  var FunctionArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  var LastModified: js.UndefOr[Date] = js.undefined
  /**
    * <p>The result of the last AWS Lambda invocation of your Lambda function. This value will be null if an SQS queue is the event source.</p>
    */
  var LastProcessingResult: js.UndefOr[String] = js.undefined
  /**
    * <p>The state of the event source mapping. It can be <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>, <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>, or <code>Deleting</code>.</p>
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * <p>The reason the event source mapping is in its current state. It is either user-requested or an AWS Lambda-initiated state transition.</p>
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  /**
    * <p>The AWS Lambda assigned opaque identifier for the mapping.</p>
    */
  var UUID: js.UndefOr[String] = js.undefined
}

object GetEventSourceMappingOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    BatchSize: Int | Double = null,
    EventSourceArn: String = null,
    FunctionArn: String = null,
    LastModified: Date = null,
    LastProcessingResult: String = null,
    State: String = null,
    StateTransitionReason: String = null,
    UUID: String = null
  ): GetEventSourceMappingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (BatchSize != null) __obj.updateDynamic("BatchSize")(BatchSize.asInstanceOf[js.Any])
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastProcessingResult != null) __obj.updateDynamic("LastProcessingResult")(LastProcessingResult.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason.asInstanceOf[js.Any])
    if (UUID != null) __obj.updateDynamic("UUID")(UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventSourceMappingOutput]
  }
}

