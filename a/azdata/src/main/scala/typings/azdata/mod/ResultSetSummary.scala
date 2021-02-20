package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetSummary extends StObject {
  
  var batchId: Double = js.native
  
  var columnInfo: js.Array[IDbColumn] = js.native
  
  var complete: Boolean = js.native
  
  var id: Double = js.native
  
  var rowCount: Double = js.native
}
object ResultSetSummary {
  
  @scala.inline
  def apply(batchId: Double, columnInfo: js.Array[IDbColumn], complete: Boolean, id: Double, rowCount: Double): ResultSetSummary = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], columnInfo = columnInfo.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSummary]
  }
  
  @scala.inline
  implicit class ResultSetSummaryMutableBuilder[Self <: ResultSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnInfo(value: js.Array[IDbColumn]): Self = StObject.set(x, "columnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnInfoVarargs(value: IDbColumn*): Self = StObject.set(x, "columnInfo", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
  }
}
