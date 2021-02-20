package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMetaSettings extends StObject {
  
  var col: Double = js.native
  
  var row: Double = js.native
  
  var settings: Settings = js.native
}
object CellMetaSettings {
  
  @scala.inline
  def apply(col: Double, row: Double, settings: Settings): CellMetaSettings = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMetaSettings]
  }
  
  @scala.inline
  implicit class CellMetaSettingsMutableBuilder[Self <: CellMetaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
