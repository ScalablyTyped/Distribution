package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMessages extends js.Object {
  
  /**
    * List of messages that are informational only and don't indicate a problem with your job.
    */
  var Info: js.UndefOr[listOfString] = js.native
  
  /**
    * List of messages that warn about conditions that might cause your job not to run or to fail.
    */
  var Warning: js.UndefOr[listOfString] = js.native
}
object JobMessages {
  
  @scala.inline
  def apply(): JobMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessages]
  }
  
  @scala.inline
  implicit class JobMessagesOps[Self <: JobMessages] (val x: Self) extends AnyVal {
    
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
    def setInfoVarargs(value: string*): Self = this.set("Info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: listOfString): Self = this.set("Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("Info", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: string*): Self = this.set("Warning", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: listOfString): Self = this.set("Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
}
