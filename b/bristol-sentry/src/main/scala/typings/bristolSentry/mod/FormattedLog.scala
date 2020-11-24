package typings.bristolSentry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedLog extends js.Object {
  
  var error: js.UndefOr[Error] = js.native
  
  var extra: js.Array[js.Object] = js.native
  
  var message: String = js.native
}
object FormattedLog {
  
  @scala.inline
  def apply(extra: js.Array[js.Object], message: String): FormattedLog = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedLog]
  }
  
  @scala.inline
  implicit class FormattedLogOps[Self <: FormattedLog] (val x: Self) extends AnyVal {
    
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
    def setExtraVarargs(value: js.Object*): Self = this.set("extra", js.Array(value :_*))
    
    @scala.inline
    def setExtra(value: js.Array[js.Object]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
