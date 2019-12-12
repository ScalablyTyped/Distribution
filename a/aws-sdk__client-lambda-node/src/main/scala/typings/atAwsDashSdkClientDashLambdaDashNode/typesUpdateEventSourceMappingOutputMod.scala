package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/UpdateEventSourceMappingOutput", JSImport.Namespace)
@js.native
object typesUpdateEventSourceMappingOutputMod extends js.Object {
  @js.native
  trait UpdateEventSourceMappingOutput extends OutputTypesUnion {
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
  
}

