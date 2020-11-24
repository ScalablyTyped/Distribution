package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportJobSummary extends js.Object {
  
  /**
    * The date and time when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  var ImportDestination: js.UndefOr[typings.awsSdk.sesv2Mod.ImportDestination] = js.native
  
  var JobId: js.UndefOr[typings.awsSdk.sesv2Mod.JobId] = js.native
  
  var JobStatus: js.UndefOr[typings.awsSdk.sesv2Mod.JobStatus] = js.native
}
object ImportJobSummary {
  
  @scala.inline
  def apply(): ImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobSummary]
  }
  
  @scala.inline
  implicit class ImportJobSummaryOps[Self <: ImportJobSummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = this.set("ImportDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDestination: Self = this.set("ImportDestination", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
  }
}
