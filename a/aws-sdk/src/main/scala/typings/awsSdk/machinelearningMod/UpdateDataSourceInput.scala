package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceInput extends StObject {
  
  /**
    * The ID assigned to the DataSource during creation.
    */
  var DataSourceId: EntityId
  
  /**
    * A new user-supplied name or description of the DataSource that will replace the current description. 
    */
  var DataSourceName: EntityName
}
object UpdateDataSourceInput {
  
  inline def apply(DataSourceId: EntityId, DataSourceName: EntityName): UpdateDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceInput]
  }
  
  extension [Self <: UpdateDataSourceInput](x: Self) {
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: EntityName): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
  }
}
