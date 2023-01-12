package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetSummary extends StObject {
  
  var batchId: Double
  
  var columnInfo: js.Array[IDbColumn]
  
  var complete: Boolean
  
  var id: Double
  
  var rowCount: Double
  
  /**
    * The visualization options for the result set.
    */
  var visualization: js.UndefOr[VisualizationOptions] = js.undefined
}
object ResultSetSummary {
  
  inline def apply(batchId: Double, columnInfo: js.Array[IDbColumn], complete: Boolean, id: Double, rowCount: Double): ResultSetSummary = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], columnInfo = columnInfo.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultSetSummary] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setColumnInfo(value: js.Array[IDbColumn]): Self = StObject.set(x, "columnInfo", value.asInstanceOf[js.Any])
    
    inline def setColumnInfoVarargs(value: IDbColumn*): Self = StObject.set(x, "columnInfo", js.Array(value*))
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setVisualization(value: VisualizationOptions): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
    
    inline def setVisualizationUndefined: Self = StObject.set(x, "visualization", js.undefined)
  }
}
