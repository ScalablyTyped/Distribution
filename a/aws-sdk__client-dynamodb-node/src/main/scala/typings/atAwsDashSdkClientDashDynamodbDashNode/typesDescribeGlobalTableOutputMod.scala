package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableDescriptionMod._UnmarshalledGlobalTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeGlobalTableOutput", JSImport.Namespace)
@js.native
object typesDescribeGlobalTableOutputMod extends js.Object {
  @js.native
  trait DescribeGlobalTableOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Contains the details of the global table.</p>
      */
    var GlobalTableDescription: js.UndefOr[_UnmarshalledGlobalTableDescription] = js.native
  }
  
}

