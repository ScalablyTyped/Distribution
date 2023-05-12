package typings.ckeditorCkeditor5SelectAll

import typings.ckeditorCkeditor5SelectAll.mod.SelectAllCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait CommandsMap extends StObject {
    
    var selectAll: SelectAllCommand
  }
  object CommandsMap {
    
    inline def apply(selectAll: SelectAllCommand): CommandsMap = {
      val __obj = js.Dynamic.literal(selectAll = selectAll.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandsMap] (val x: Self) extends AnyVal {
      
      inline def setSelectAll(value: SelectAllCommand): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
