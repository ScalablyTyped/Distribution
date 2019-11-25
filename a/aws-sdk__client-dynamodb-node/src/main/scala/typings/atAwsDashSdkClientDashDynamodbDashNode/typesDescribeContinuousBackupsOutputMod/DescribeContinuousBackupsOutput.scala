package typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeContinuousBackupsOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreContinuousBackupsDescriptionMod._UnmarshalledContinuousBackupsDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContinuousBackupsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
    */
  var ContinuousBackupsDescription: js.UndefOr[_UnmarshalledContinuousBackupsDescription] = js.undefined
}

object DescribeContinuousBackupsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ContinuousBackupsDescription: _UnmarshalledContinuousBackupsDescription = null
  ): DescribeContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ContinuousBackupsDescription != null) __obj.updateDynamic("ContinuousBackupsDescription")(ContinuousBackupsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContinuousBackupsOutput]
  }
}

