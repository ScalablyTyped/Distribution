package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGlobalTablesInput extends StObject {
  
  /**
    * <p>The first global table name that this operation will evaluate.</p>
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The maximum number of table names to return, if the parameter is not specified
    *             DynamoDB defaults to 100.</p>
    *          <p>If the number of global tables DynamoDB finds reaches this limit, it stops the
    *             operation and returns the table names collected up to that point, with a table name in
    *             the <code>LastEvaluatedGlobalTableName</code> to apply in a subsequent operation to the
    *                 <code>ExclusiveStartGlobalTableName</code> parameter.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Lists the global tables in a specific Region.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object ListGlobalTablesInput {
  
  inline def apply(): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGlobalTablesInput] (val x: Self) extends AnyVal {
    
    inline def setExclusiveStartGlobalTableName(value: String): Self = StObject.set(x, "ExclusiveStartGlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartGlobalTableNameUndefined: Self = StObject.set(x, "ExclusiveStartGlobalTableName", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
