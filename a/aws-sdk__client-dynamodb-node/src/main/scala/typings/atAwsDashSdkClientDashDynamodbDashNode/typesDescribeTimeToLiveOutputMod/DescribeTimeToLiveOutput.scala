package typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTimeToLiveOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTimeToLiveDescriptionMod._UnmarshalledTimeToLiveDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var TimeToLiveDescription: js.UndefOr[_UnmarshalledTimeToLiveDescription] = js.undefined
}

object DescribeTimeToLiveOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TimeToLiveDescription: _UnmarshalledTimeToLiveDescription = null): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
}

