package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxDataRequestOrder extends StObject {
  
  var column: Double
  
  var dir: String
}
object AjaxDataRequestOrder {
  
  inline def apply(column: Double, dir: String): AjaxDataRequestOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
  
  extension [Self <: AjaxDataRequestOrder](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
  }
}
