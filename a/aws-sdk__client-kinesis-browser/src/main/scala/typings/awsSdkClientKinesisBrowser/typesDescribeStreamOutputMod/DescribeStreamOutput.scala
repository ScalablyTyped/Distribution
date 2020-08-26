package typings.awsSdkClientKinesisBrowser.typesDescribeStreamOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStreamDescriptionMod.UnmarshalledStreamDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.</p>
    */
  var StreamDescription: UnmarshalledStreamDescription = js.native
}

object DescribeStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, StreamDescription: UnmarshalledStreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescription = StreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  @scala.inline
  implicit class DescribeStreamOutputOps[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
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
    def setStreamDescription(value: UnmarshalledStreamDescription): Self = this.set("StreamDescription", value.asInstanceOf[js.Any])
  }
  
}

