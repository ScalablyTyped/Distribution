package typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFunctionConcurrencyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var ReservedConcurrentExecutions: js.UndefOr[Double] = js.native
}

object PutFunctionConcurrencyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutFunctionConcurrencyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFunctionConcurrencyOutput]
  }
  @scala.inline
  implicit class PutFunctionConcurrencyOutputOps[Self <: PutFunctionConcurrencyOutput] (val x: Self) extends AnyVal {
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
    def setReservedConcurrentExecutions(value: Double): Self = this.set("ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedConcurrentExecutions: Self = this.set("ReservedConcurrentExecutions", js.undefined)
  }
  
}

