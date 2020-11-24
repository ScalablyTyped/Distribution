package typings.awsSdkClientDynamodbBrowser.typesListGlobalTablesOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableMod.UnmarshalledGlobalTable
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var GlobalTables: js.UndefOr[js.Array[UnmarshalledGlobalTable]] = js.native
  
  /**
    * <p>Last evaluated global table name.</p>
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[String] = js.native
}
object ListGlobalTablesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  
  @scala.inline
  implicit class ListGlobalTablesOutputOps[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    
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
    def setGlobalTablesVarargs(value: UnmarshalledGlobalTable*): Self = this.set("GlobalTables", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTables(value: js.Array[UnmarshalledGlobalTable]): Self = this.set("GlobalTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTables: Self = this.set("GlobalTables", js.undefined)
    
    @scala.inline
    def setLastEvaluatedGlobalTableName(value: String): Self = this.set("LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedGlobalTableName: Self = this.set("LastEvaluatedGlobalTableName", js.undefined)
  }
}
