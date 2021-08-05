package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlobalTablesInput extends StObject {
  
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.undefined
}
object ListGlobalTablesInput {
  
  inline def apply(): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
  
  extension [Self <: ListGlobalTablesInput](x: Self) {
    
    inline def setExclusiveStartGlobalTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
    
    inline def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
