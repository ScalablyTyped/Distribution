package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastRunErrorStatus extends js.Object {
  
  /**
    * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this value indicates the error status of the job's most recent run. Possible values are: ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job. NONE - No errors occurred. Macie processed all the data specified for the job.
    */
  var code: js.UndefOr[LastRunErrorStatusCode] = js.native
}
object LastRunErrorStatus {
  
  @scala.inline
  def apply(): LastRunErrorStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastRunErrorStatus]
  }
  
  @scala.inline
  implicit class LastRunErrorStatusOps[Self <: LastRunErrorStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: LastRunErrorStatusCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
}
