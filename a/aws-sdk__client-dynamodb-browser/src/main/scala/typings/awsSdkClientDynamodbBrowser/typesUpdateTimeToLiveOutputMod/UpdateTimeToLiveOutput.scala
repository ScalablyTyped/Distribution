package typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTimeToLiveOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
    */
  var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.undefined
}

object UpdateTimeToLiveOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TimeToLiveSpecification: UnmarshalledTimeToLiveSpecification = null): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TimeToLiveSpecification != null) __obj.updateDynamic("TimeToLiveSpecification")(TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
}

