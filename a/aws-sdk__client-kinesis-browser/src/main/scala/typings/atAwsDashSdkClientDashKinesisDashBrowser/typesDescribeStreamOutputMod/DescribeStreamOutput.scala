package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionMod._UnmarshalledStreamDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.</p>
    */
  var StreamDescription: _UnmarshalledStreamDescription
}

object DescribeStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, StreamDescription: _UnmarshalledStreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescription = StreamDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamOutput]
  }
}

