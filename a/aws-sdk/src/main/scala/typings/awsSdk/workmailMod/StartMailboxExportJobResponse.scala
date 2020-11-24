package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMailboxExportJobResponse extends js.Object {
  
  /**
    * The job ID.
    */
  var JobId: js.UndefOr[MailboxExportJobId] = js.native
}
object StartMailboxExportJobResponse {
  
  @scala.inline
  def apply(): StartMailboxExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMailboxExportJobResponse]
  }
  
  @scala.inline
  implicit class StartMailboxExportJobResponseOps[Self <: StartMailboxExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobId(value: MailboxExportJobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
}
