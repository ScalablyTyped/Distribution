package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamsOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>If set to <code>true</code>, there are more streams available to list.</p>
    */
  var HasMoreStreams: Boolean
  /**
    * <p>The names of the streams that are associated with the AWS account making the <code>ListStreams</code> request.</p>
    */
  var StreamNames: js.Array[String]
}

object ListStreamsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, HasMoreStreams: Boolean, StreamNames: js.Array[String]): ListStreamsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreStreams = HasMoreStreams.asInstanceOf[js.Any], StreamNames = StreamNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

