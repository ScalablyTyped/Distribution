package typings.awsSdkClientDynamodbBrowser.typesCreateGlobalTableOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.undefined
}

object CreateGlobalTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GlobalTableDescription: UnmarshalledGlobalTableDescription = null): CreateGlobalTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalTableOutput]
  }
}

