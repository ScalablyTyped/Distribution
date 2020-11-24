package typings.consola.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaReporterLogObject extends js.Object {
  
  var args: js.Array[_] = js.native
  
  var date: Date = js.native
  
  var level: LogLevel = js.native
  
  var tag: String = js.native
  
  var `type`: logType = js.native
}
object ConsolaReporterLogObject {
  
  @scala.inline
  def apply(args: js.Array[_], date: Date, level: LogLevel, tag: String, `type`: logType): ConsolaReporterLogObject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterLogObject]
  }
  
  @scala.inline
  implicit class ConsolaReporterLogObjectOps[Self <: ConsolaReporterLogObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: logType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
