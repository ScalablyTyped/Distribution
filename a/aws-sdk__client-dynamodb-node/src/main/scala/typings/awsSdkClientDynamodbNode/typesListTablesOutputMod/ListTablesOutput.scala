package typings.awsSdkClientDynamodbNode.typesListTablesOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The name of the last table in the current page of results. Use this value as the <code>ExclusiveStartTableName</code> in a new request to obtain the next page of results, until all the table names are returned.</p> <p>If you do not receive a <code>LastEvaluatedTableName</code> value in the response, this means that there are no more table names to be retrieved.</p>
    */
  var LastEvaluatedTableName: js.UndefOr[String] = js.native
  
  /**
    * <p>The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100.</p> <p>If <code>LastEvaluatedTableName</code> also appears in the output, you can use this value as the <code>ExclusiveStartTableName</code> parameter in a subsequent <code>ListTables</code> request and obtain the next page of results.</p>
    */
  var TableNames: js.UndefOr[js.Array[String]] = js.native
}
object ListTablesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTablesOutput]
  }
  
  @scala.inline
  implicit class ListTablesOutputOps[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedTableName(value: String): Self = this.set("LastEvaluatedTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedTableName: Self = this.set("LastEvaluatedTableName", js.undefined)
    
    @scala.inline
    def setTableNamesVarargs(value: String*): Self = this.set("TableNames", js.Array(value :_*))
    
    @scala.inline
    def setTableNames(value: js.Array[String]): Self = this.set("TableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableNames: Self = this.set("TableNames", js.undefined)
  }
}
