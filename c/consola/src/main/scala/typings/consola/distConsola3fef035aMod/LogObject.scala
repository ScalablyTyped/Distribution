package typings.consola.distConsola3fef035aMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogObject
  extends StObject
     with InputLogObject {
  
  @JSName("args")
  var args_LogObject: js.Array[Any]
  
  @JSName("date")
  var date_LogObject: js.Date
  
  @JSName("level")
  var level_LogObject: LogLevel
  
  @JSName("tag")
  var tag_LogObject: String
  
  @JSName("type")
  var type_LogObject: LogType
}
object LogObject {
  
  inline def apply(args: js.Array[Any], date: js.Date, level: LogLevel, tag: String, `type`: LogType): LogObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogObject] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: LogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
