package typings.awsSdkClientLambdaNode.typesGetEventSourceMappingOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventSourceMappingOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your function. Your function receives an event with all the retrieved records.</p>
    */
  var BatchSize: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the Amazon Kinesis or DynamoDB stream that is the source of events.</p>
    */
  var EventSourceArn: js.UndefOr[String] = js.native
  /**
    * <p>The Lambda function to invoke when AWS Lambda detects an event on the poll-based source.</p>
    */
  var FunctionArn: js.UndefOr[String] = js.native
  /**
    * <p>The UTC time string indicating the last time the event mapping was updated.</p>
    */
  var LastModified: js.UndefOr[Date] = js.native
  /**
    * <p>The result of the last AWS Lambda invocation of your Lambda function. This value will be null if an SQS queue is the event source.</p>
    */
  var LastProcessingResult: js.UndefOr[String] = js.native
  /**
    * <p>The state of the event source mapping. It can be <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>, <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>, or <code>Deleting</code>.</p>
    */
  var State: js.UndefOr[String] = js.native
  /**
    * <p>The reason the event source mapping is in its current state. It is either user-requested or an AWS Lambda-initiated state transition.</p>
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
  /**
    * <p>The AWS Lambda assigned opaque identifier for the mapping.</p>
    */
  var UUID: js.UndefOr[String] = js.native
}

object GetEventSourceMappingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetEventSourceMappingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventSourceMappingOutput]
  }
  @scala.inline
  implicit class GetEventSourceMappingOutputOps[Self <: GetEventSourceMappingOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("BatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("BatchSize", js.undefined)
    @scala.inline
    def setEventSourceArn(value: String): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    @scala.inline
    def setFunctionArn(value: String): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionArn: Self = this.set("FunctionArn", js.undefined)
    @scala.inline
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setLastProcessingResult(value: String): Self = this.set("LastProcessingResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastProcessingResult: Self = this.set("LastProcessingResult", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateTransitionReason(value: String): Self = this.set("StateTransitionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateTransitionReason: Self = this.set("StateTransitionReason", js.undefined)
    @scala.inline
    def setUUID(value: String): Self = this.set("UUID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUUID: Self = this.set("UUID", js.undefined)
  }
  
}

