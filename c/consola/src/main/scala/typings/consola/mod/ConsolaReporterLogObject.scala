package typings.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporterLogObject extends StObject {
  
  var args: js.Array[Any]
  
  var date: js.Date
  
  var level: LogLevel
  
  var tag: String
  
  var `type`: logType
}
object ConsolaReporterLogObject {
  
  inline def apply(args: js.Array[Any], date: js.Date, level: LogLevel, tag: String, `type`: logType): ConsolaReporterLogObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterLogObject]
  }
  
  extension [Self <: ConsolaReporterLogObject](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: logType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
