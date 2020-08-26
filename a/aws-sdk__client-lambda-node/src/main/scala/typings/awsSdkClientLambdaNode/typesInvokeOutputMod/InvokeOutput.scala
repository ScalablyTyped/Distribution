package typings.awsSdkClientLambdaNode.typesInvokeOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The function version that has been executed. This value is returned only if the invocation type is <code>RequestResponse</code>. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">Traffic Shifting Using Aliases</a>.</p>
    */
  var ExecutedVersion: js.UndefOr[String] = js.native
  /**
    * <p>Indicates whether an error occurred while executing the Lambda function. If an error occurred this field will have one of two values; <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code> errors are errors that are reported by the function while the <code>Unhandled</code> errors are those detected and reported by AWS Lambda. Unhandled errors include out of memory errors and function timeouts. For information about how to report an <code>Handled</code> error, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html">Programming Model</a>. </p>
    */
  var FunctionError: js.UndefOr[String] = js.native
  /**
    * <p> It is the base64-encoded logs for the Lambda function invocation. This is present only if the invocation type is <code>RequestResponse</code> and the logs were requested. </p>
    */
  var LogResult: js.UndefOr[String] = js.native
  /**
    * <p> It is the JSON representation of the object returned by the Lambda function. This is present only if the invocation type is <code>RequestResponse</code>. </p> <p>In the event of a function error this field contains a message describing the error. For the <code>Handled</code> errors the Lambda function will report this message. For <code>Unhandled</code> errors AWS Lambda reports the message. </p>
    */
  var Payload: js.UndefOr[Uint8Array] = js.native
  /**
    * <p>The HTTP status code will be in the 200 range for successful request. For the <code>RequestResponse</code> invocation type this status code will be 200. For the <code>Event</code> invocation type this status code will be 202. For the <code>DryRun</code> invocation type the status code will be 204. </p>
    */
  var StatusCode: js.UndefOr[Double] = js.native
}

object InvokeOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): InvokeOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeOutput]
  }
  @scala.inline
  implicit class InvokeOutputOps[Self <: InvokeOutput] (val x: Self) extends AnyVal {
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
    def setExecutedVersion(value: String): Self = this.set("ExecutedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutedVersion: Self = this.set("ExecutedVersion", js.undefined)
    @scala.inline
    def setFunctionError(value: String): Self = this.set("FunctionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionError: Self = this.set("FunctionError", js.undefined)
    @scala.inline
    def setLogResult(value: String): Self = this.set("LogResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogResult: Self = this.set("LogResult", js.undefined)
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("Payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("Payload", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
  }
  
}

