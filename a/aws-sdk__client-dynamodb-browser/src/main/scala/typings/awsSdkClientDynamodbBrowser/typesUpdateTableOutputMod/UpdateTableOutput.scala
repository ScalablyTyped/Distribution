package typings.awsSdkClientDynamodbBrowser.typesUpdateTableOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the properties of the table.</p>
    */
  var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.undefined
}

object UpdateTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TableDescription: UnmarshalledTableDescription = null): UpdateTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableOutput]
  }
}

