package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGlobalTablesOutput extends StObject {
  
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
  implicit class ListGlobalTablesOutputMutableBuilder[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTables(value: GlobalTableList): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
    
    @scala.inline
    def setGlobalTablesVarargs(value: GlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value :_*))
    
    @scala.inline
    def setLastEvaluatedGlobalTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
  }
}
