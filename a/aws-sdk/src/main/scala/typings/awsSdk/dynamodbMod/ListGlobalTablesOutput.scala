package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlobalTablesOutput extends StObject {
  
  /**
    * List of global table names.
    */
  var GlobalTables: js.UndefOr[GlobalTableList] = js.undefined
  
  /**
    * Last evaluated global table name.
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.undefined
}
object ListGlobalTablesOutput {
  
  inline def apply(): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  
  extension [Self <: ListGlobalTablesOutput](x: Self) {
    
    inline def setGlobalTables(value: GlobalTableList): Self = StObject.set(x, "GlobalTables", value.asInstanceOf[js.Any])
    
    inline def setGlobalTablesUndefined: Self = StObject.set(x, "GlobalTables", js.undefined)
    
    inline def setGlobalTablesVarargs(value: GlobalTable*): Self = StObject.set(x, "GlobalTables", js.Array(value*))
    
    inline def setLastEvaluatedGlobalTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedGlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedGlobalTableNameUndefined: Self = StObject.set(x, "LastEvaluatedGlobalTableName", js.undefined)
  }
}
