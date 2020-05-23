package typings.awsSdkClientLambdaNode.typesInvokeAsyncOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeAsyncOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>It will be 202 upon success.</p>
    */
  var Status: js.UndefOr[Double] = js.undefined
}

object InvokeAsyncOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Status: js.UndefOr[Double] = js.undefined): InvokeAsyncOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeAsyncOutput]
  }
}

