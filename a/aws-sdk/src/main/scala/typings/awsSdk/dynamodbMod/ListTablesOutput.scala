package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesOutput extends StObject {
  
  /**
    * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
    */
  var LastEvaluatedTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
    */
  var TableNames: js.UndefOr[TableNameList] = js.undefined
}
object ListTablesOutput {
  
  inline def apply(): ListTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesOutput]
  }
  
  extension [Self <: ListTablesOutput](x: Self) {
    
    inline def setLastEvaluatedTableName(value: TableName): Self = StObject.set(x, "LastEvaluatedTableName", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedTableNameUndefined: Self = StObject.set(x, "LastEvaluatedTableName", js.undefined)
    
    inline def setTableNames(value: TableNameList): Self = StObject.set(x, "TableNames", value.asInstanceOf[js.Any])
    
    inline def setTableNamesUndefined: Self = StObject.set(x, "TableNames", js.undefined)
    
    inline def setTableNamesVarargs(value: TableName*): Self = StObject.set(x, "TableNames", js.Array(value :_*))
  }
}
