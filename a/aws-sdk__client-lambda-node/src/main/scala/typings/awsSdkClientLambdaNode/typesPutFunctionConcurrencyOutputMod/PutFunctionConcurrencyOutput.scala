package typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFunctionConcurrencyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var ReservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
}

object PutFunctionConcurrencyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ReservedConcurrentExecutions: js.UndefOr[Double] = js.undefined): PutFunctionConcurrencyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(ReservedConcurrentExecutions)) __obj.updateDynamic("ReservedConcurrentExecutions")(ReservedConcurrentExecutions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFunctionConcurrencyOutput]
  }
}

