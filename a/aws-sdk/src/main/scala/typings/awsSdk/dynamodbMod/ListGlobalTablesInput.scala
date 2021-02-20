package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGlobalTablesInput extends StObject {
  
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.native
}
object ListGlobalTablesInput {
  
  @scala.inline
  def apply(): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
  
  @scala.inline
  implicit class ListGlobalTablesInputMutableBuilder[Self <: ListGlobalTablesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusiveStartGlobalTableName(value: TableName): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntegerObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
