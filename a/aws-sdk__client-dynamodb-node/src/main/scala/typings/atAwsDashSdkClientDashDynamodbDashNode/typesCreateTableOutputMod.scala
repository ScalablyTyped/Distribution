package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTableDescriptionMod._UnmarshalledTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/CreateTableOutput", JSImport.Namespace)
@js.native
object typesCreateTableOutputMod extends js.Object {
  @js.native
  trait CreateTableOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Represents the properties of the table.</p>
      */
    var TableDescription: js.UndefOr[_UnmarshalledTableDescription] = js.native
  }
  
}

