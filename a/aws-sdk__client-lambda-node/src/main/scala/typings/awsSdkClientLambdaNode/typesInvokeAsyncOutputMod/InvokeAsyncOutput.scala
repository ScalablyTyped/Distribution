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
  def apply($metadata: ResponseMetadata, Status: Int | Double = null): InvokeAsyncOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeAsyncOutput]
  }
}

