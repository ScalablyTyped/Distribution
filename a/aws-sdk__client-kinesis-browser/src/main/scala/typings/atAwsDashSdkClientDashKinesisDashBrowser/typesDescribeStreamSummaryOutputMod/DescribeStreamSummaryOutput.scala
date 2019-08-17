package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamSummaryOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionSummaryMod._UnmarshalledStreamDescriptionSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var StreamDescriptionSummary: _UnmarshalledStreamDescriptionSummary
}

object DescribeStreamSummaryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, StreamDescriptionSummary: _UnmarshalledStreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, StreamDescriptionSummary = StreamDescriptionSummary)
  
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
}

