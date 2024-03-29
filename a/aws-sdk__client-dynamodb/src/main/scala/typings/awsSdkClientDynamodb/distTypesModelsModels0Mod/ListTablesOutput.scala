package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesOutput extends StObject {
  
  /**
    * <p>The name of the last table in the current page of results. Use this value as the
    *                 <code>ExclusiveStartTableName</code> in a new request to obtain the next page of
    *             results, until all the table names are returned.</p>
    *          <p>If you do not receive a <code>LastEvaluatedTableName</code> value in the response,
    *             this means that there are no more table names to be retrieved.</p>
    */
  var LastEvaluatedTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The names of the tables associated with the current account at the current endpoint.
    *             The maximum size of this array is 100.</p>
    *          <p>If <code>LastEvaluatedTableName</code> also appears in the output, you can use this
    *             value as the <code>ExclusiveStartTableName</code> parameter in a subsequent
    *                 <code>ListTables</code> request and obtain the next page of results.</p>
    */
  var TableNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ListTablesOutput {
  
  inline def apply(): ListTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
    
    inline def setLastEvaluatedTableName(value: String): Self = StObject.set(x, "LastEvaluatedTableName", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedTableNameUndefined: Self = StObject.set(x, "LastEvaluatedTableName", js.undefined)
    
    inline def setTableNames(value: js.Array[String]): Self = StObject.set(x, "TableNames", value.asInstanceOf[js.Any])
    
    inline def setTableNamesUndefined: Self = StObject.set(x, "TableNames", js.undefined)
    
    inline def setTableNamesVarargs(value: String*): Self = StObject.set(x, "TableNames", js.Array(value*))
  }
}
