package typings.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesContinuousBackupsDescriptionMod.UnmarshalledContinuousBackupsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContinuousBackupsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the continuous backups and point in time recovery settings on the table.</p>
    */
  var ContinuousBackupsDescription: js.UndefOr[UnmarshalledContinuousBackupsDescription] = js.undefined
}

object UpdateContinuousBackupsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ContinuousBackupsDescription: UnmarshalledContinuousBackupsDescription = null
  ): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ContinuousBackupsDescription != null) __obj.updateDynamic("ContinuousBackupsDescription")(ContinuousBackupsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
}

