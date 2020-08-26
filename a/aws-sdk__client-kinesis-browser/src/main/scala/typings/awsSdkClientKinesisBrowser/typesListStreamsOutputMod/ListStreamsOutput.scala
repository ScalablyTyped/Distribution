package typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>If set to <code>true</code>, there are more streams available to list.</p>
    */
  var HasMoreStreams: Boolean = js.native
  /**
    * <p>The names of the streams that are associated with the AWS account making the <code>ListStreams</code> request.</p>
    */
  var StreamNames: js.Array[String] = js.native
}

object ListStreamsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, HasMoreStreams: Boolean, StreamNames: js.Array[String]): ListStreamsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsOutput]
  }
  @scala.inline
  implicit class ListStreamsOutputOps[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
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
    def setHasMoreStreams(value: Boolean): Self = this.set("HasMoreStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamNamesVarargs(value: String*): Self = this.set("StreamNames", js.Array(value :_*))
    @scala.inline
    def setStreamNames(value: js.Array[String]): Self = this.set("StreamNames", value.asInstanceOf[js.Any])
  }
  
}

