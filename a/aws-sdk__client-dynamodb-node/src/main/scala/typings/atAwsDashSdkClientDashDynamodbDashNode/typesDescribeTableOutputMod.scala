package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTableDescriptionMod._UnmarshalledTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeTableOutput", JSImport.Namespace)
@js.native
object typesDescribeTableOutputMod extends js.Object {
  @js.native
  trait DescribeTableOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The properties of the table.</p>
      */
    var Table: js.UndefOr[_UnmarshalledTableDescription] = js.native
  }
  
}

