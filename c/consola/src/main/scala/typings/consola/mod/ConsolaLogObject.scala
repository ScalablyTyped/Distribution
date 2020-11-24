package typings.consola.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaLogObject extends js.Object {
  
  var additional: js.UndefOr[String | js.Array[String]] = js.native
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var level: js.UndefOr[LogLevel] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[logType] = js.native
}
object ConsolaLogObject {
  
  @scala.inline
  def apply(): ConsolaLogObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaLogObject]
  }
  
  @scala.inline
  implicit class ConsolaLogObjectOps[Self <: ConsolaLogObject] (val x: Self) extends AnyVal {
    
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
    def setAdditionalVarargs(value: String*): Self = this.set("additional", js.Array(value :_*))
    
    @scala.inline
    def setAdditional(value: String | js.Array[String]): Self = this.set("additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional: Self = this.set("additional", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setType(value: logType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
