package typings.ckeditorCkeditor5RemoveFormat

import typings.ckeditorCkeditor5RemoveFormat.mod.RemoveFormatCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait CommandsMap extends StObject {
    
    var removeFormat: RemoveFormatCommand
  }
  object CommandsMap {
    
    inline def apply(removeFormat: RemoveFormatCommand): CommandsMap = {
      val __obj = js.Dynamic.literal(removeFormat = removeFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandsMap] (val x: Self) extends AnyVal {
      
      inline def setRemoveFormat(value: RemoveFormatCommand): Self = StObject.set(x, "removeFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
