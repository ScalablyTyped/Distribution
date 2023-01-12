package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableMenuCellValue extends StObject {
  
  /**
    * commands for the menu. Use an array for a group and menu separators will be added.
    */
  var commands: js.Array[String | js.Array[String]]
  
  /**
    * context that will be passed to the commands.
    */
  var context: js.UndefOr[(StringDictionary[String | Boolean | Double]) | String | Boolean | Double] = js.undefined
}
object DeclarativeTableMenuCellValue {
  
  inline def apply(commands: js.Array[String | js.Array[String]]): DeclarativeTableMenuCellValue = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableMenuCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclarativeTableMenuCellValue] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setContext(value: (StringDictionary[String | Boolean | Double]) | String | Boolean | Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
