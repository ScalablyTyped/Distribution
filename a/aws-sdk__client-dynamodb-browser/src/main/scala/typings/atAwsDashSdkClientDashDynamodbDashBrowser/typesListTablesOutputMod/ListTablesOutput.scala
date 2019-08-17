package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTablesOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTablesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The name of the last table in the current page of results. Use this value as the <code>ExclusiveStartTableName</code> in a new request to obtain the next page of results, until all the table names are returned.</p> <p>If you do not receive a <code>LastEvaluatedTableName</code> value in the response, this means that there are no more table names to be retrieved.</p>
    */
  var LastEvaluatedTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100.</p> <p>If <code>LastEvaluatedTableName</code> also appears in the output, you can use this value as the <code>ExclusiveStartTableName</code> parameter in a subsequent <code>ListTables</code> request and obtain the next page of results.</p>
    */
  var TableNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ListTablesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LastEvaluatedTableName: String = null,
    TableNames: js.Array[String] = null
  ): ListTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (LastEvaluatedTableName != null) __obj.updateDynamic("LastEvaluatedTableName")(LastEvaluatedTableName)
    if (TableNames != null) __obj.updateDynamic("TableNames")(TableNames)
    __obj.asInstanceOf[ListTablesOutput]
  }
}

