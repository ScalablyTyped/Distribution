package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngressAccessLogs extends js.Object {
  
  /**
    * Customize the log group name.
    */
  var LogGroupName: js.UndefOr[string] = js.native
}
object IngressAccessLogs {
  
  @scala.inline
  def apply(): IngressAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressAccessLogs]
  }
  
  @scala.inline
  implicit class IngressAccessLogsOps[Self <: IngressAccessLogs] (val x: Self) extends AnyVal {
    
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
    def setLogGroupName(value: string): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
  }
}
