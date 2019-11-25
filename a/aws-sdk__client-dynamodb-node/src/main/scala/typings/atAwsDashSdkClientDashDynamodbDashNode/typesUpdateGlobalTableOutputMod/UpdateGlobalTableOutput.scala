package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableDescriptionMod._UnmarshalledGlobalTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[_UnmarshalledGlobalTableDescription] = js.undefined
}

object UpdateGlobalTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GlobalTableDescription: _UnmarshalledGlobalTableDescription = null): UpdateGlobalTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableOutput]
  }
}

