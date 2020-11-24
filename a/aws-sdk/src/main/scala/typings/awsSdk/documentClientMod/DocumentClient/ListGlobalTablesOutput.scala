package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGlobalTablesOutput extends js.Object {
  
  /**
    * List of global table names.
    */
  var GlobalTables: js.UndefOr[GlobalTableList] = js.native
  
  /**
    * Last evaluated global table name.
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.native
}
object ListGlobalTablesOutput {
  
  @scala.inline
  def apply(): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  
  @scala.inline
  implicit class ListGlobalTablesOutputOps[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    
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
    def setGlobalTablesVarargs(value: GlobalTable*): Self = this.set("GlobalTables", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTables(value: GlobalTableList): Self = this.set("GlobalTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTables: Self = this.set("GlobalTables", js.undefined)
    
    @scala.inline
    def setLastEvaluatedGlobalTableName(value: TableName): Self = this.set("LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedGlobalTableName: Self = this.set("LastEvaluatedGlobalTableName", js.undefined)
  }
}
