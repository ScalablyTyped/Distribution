package typings.awsSdkClientDynamodbBrowser.typesDescribeTableOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The properties of the table.</p>
    */
  var Table: js.UndefOr[UnmarshalledTableDescription] = js.undefined
}

object DescribeTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Table: UnmarshalledTableDescription = null): DescribeTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableOutput]
  }
}

