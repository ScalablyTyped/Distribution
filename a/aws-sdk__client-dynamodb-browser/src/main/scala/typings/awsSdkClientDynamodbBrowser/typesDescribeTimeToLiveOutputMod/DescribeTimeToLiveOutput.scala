package typings.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeToLiveOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p/>
    */
  var TimeToLiveDescription: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.undefined
}

object DescribeTimeToLiveOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TimeToLiveDescription: UnmarshalledTimeToLiveDescription = null): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
}

