package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesOutput extends js.Object {
  
  /**
    * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
    */
  var LastEvaluatedTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
    */
  var TableNames: js.UndefOr[TableNameList] = js.native
}
object ListTablesOutput {
  
  @scala.inline
  def apply(): ListTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesOutput]
  }
  
  @scala.inline
  implicit class ListTablesOutputOps[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastEvaluatedTableName(value: TableName): Self = this.set("LastEvaluatedTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedTableName: Self = this.set("LastEvaluatedTableName", js.undefined)
    
    @scala.inline
    def setTableNamesVarargs(value: TableName*): Self = this.set("TableNames", js.Array(value :_*))
    
    @scala.inline
    def setTableNames(value: TableNameList): Self = this.set("TableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableNames: Self = this.set("TableNames", js.undefined)
  }
}
