package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataCellsFilterRequest extends StObject {
  
  /**
    * A DataCellsFilter structure containing information about the data cells filter.
    */
  var TableData: DataCellsFilter
}
object CreateDataCellsFilterRequest {
  
  inline def apply(TableData: DataCellsFilter): CreateDataCellsFilterRequest = {
    val __obj = js.Dynamic.literal(TableData = TableData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataCellsFilterRequest]
  }
  
  extension [Self <: CreateDataCellsFilterRequest](x: Self) {
    
    inline def setTableData(value: DataCellsFilter): Self = StObject.set(x, "TableData", value.asInstanceOf[js.Any])
  }
}
