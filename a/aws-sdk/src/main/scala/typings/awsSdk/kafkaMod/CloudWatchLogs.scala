package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogs extends js.Object {
  
  var Enabled: boolean = js.native
  
  var LogGroup: js.UndefOr[string] = js.native
}
object CloudWatchLogs {
  
  @scala.inline
  def apply(Enabled: boolean): CloudWatchLogs = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogs]
  }
  
  @scala.inline
  implicit class CloudWatchLogsOps[Self <: CloudWatchLogs] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroup(value: string): Self = this.set("LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroup: Self = this.set("LogGroup", js.undefined)
  }
}
