package typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalTableOutput extends OutputTypesUnion {
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

object DescribeGlobalTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GlobalTableDescription: UnmarshalledGlobalTableDescription = null): DescribeGlobalTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalTableOutput]
  }
}

