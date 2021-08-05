package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProfilerMoreRowsNotificationParams extends StObject {
  
  var data: IProfilerTableRow
  
  var rowCount: Double
  
  var uri: String
}
object IProfilerMoreRowsNotificationParams {
  
  inline def apply(data: IProfilerTableRow, rowCount: Double, uri: String): IProfilerMoreRowsNotificationParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerMoreRowsNotificationParams]
  }
  
  extension [Self <: IProfilerMoreRowsNotificationParams](x: Self) {
    
    inline def setData(value: IProfilerTableRow): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
