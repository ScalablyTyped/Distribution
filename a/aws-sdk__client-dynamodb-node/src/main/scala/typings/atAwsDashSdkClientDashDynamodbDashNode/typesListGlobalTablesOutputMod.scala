package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableMod._UnmarshalledGlobalTable
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/ListGlobalTablesOutput", JSImport.Namespace)
@js.native
object typesListGlobalTablesOutputMod extends js.Object {
  @js.native
  trait ListGlobalTablesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>List of global table names.</p>
      */
    var GlobalTables: js.UndefOr[js.Array[_UnmarshalledGlobalTable]] = js.native
    /**
      * <p>Last evaluated global table name.</p>
      */
    var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.native
  }
  
}

