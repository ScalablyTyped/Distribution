package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindMatchesTaskRunProperties extends js.Object {
  
  /**
    * The job ID for the Find Matches task run.
    */
  var JobId: js.UndefOr[HashString] = js.native
  
  /**
    * The name assigned to the job for the Find Matches task run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The job run ID for the Find Matches task run.
    */
  var JobRunId: js.UndefOr[HashString] = js.native
}
object FindMatchesTaskRunProperties {
  
  @scala.inline
  def apply(): FindMatchesTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMatchesTaskRunProperties]
  }
  
  @scala.inline
  implicit class FindMatchesTaskRunPropertiesOps[Self <: FindMatchesTaskRunProperties] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: HashString): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setJobRunId(value: HashString): Self = this.set("JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRunId: Self = this.set("JobRunId", js.undefined)
  }
}
