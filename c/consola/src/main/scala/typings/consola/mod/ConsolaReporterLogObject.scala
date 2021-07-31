package typings.consola.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporterLogObject extends StObject {
  
  var args: js.Array[js.Any]
  
  var date: Date
  
  var level: LogLevel
  
  var tag: String
  
  var `type`: logType
}
object ConsolaReporterLogObject {
  
  @scala.inline
  def apply(args: js.Array[js.Any], date: Date, level: LogLevel, tag: String, `type`: logType): ConsolaReporterLogObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterLogObject]
  }
  
  @scala.inline
  implicit class ConsolaReporterLogObjectMutableBuilder[Self <: ConsolaReporterLogObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: logType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
