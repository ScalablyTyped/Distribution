package typings.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamSummaryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A <a>StreamDescriptionSummary</a> containing information about the stream.</p>
    */
  var StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary
}

object DescribeStreamSummaryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
}

