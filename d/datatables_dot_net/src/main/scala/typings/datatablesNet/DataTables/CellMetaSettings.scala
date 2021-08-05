package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellMetaSettings extends StObject {
  
  var col: Double
  
  var row: Double
  
  var settings: Settings
}
object CellMetaSettings {
  
  inline def apply(col: Double, row: Double, settings: Settings): CellMetaSettings = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMetaSettings]
  }
  
  extension [Self <: CellMetaSettings](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
