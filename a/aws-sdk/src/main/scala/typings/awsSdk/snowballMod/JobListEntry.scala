package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobListEntry extends js.Object {
  
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates that this job is a main job. A main job represents a successful request to create an export job. Main jobs aren't associated with any Snowballs. Instead, each main job will have at least one job part, and each job part is associated with a Snowball. It might take some time before the job parts associated with a particular main job are listed, because they are created after the main job is created.
    */
  var IsMaster: js.UndefOr[Boolean] = js.native
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this job.
    */
  var JobState: js.UndefOr[typings.awsSdk.snowballMod.JobState] = js.native
  
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.native
  
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
}
object JobListEntry {
  
  @scala.inline
  def apply(): JobListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListEntry]
  }
  
  @scala.inline
  implicit class JobListEntryOps[Self <: JobListEntry] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsMaster(value: Boolean): Self = this.set("IsMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMaster: Self = this.set("IsMaster", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    
    @scala.inline
    def setJobState(value: JobState): Self = this.set("JobState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobState: Self = this.set("JobState", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
    
    @scala.inline
    def setSnowballType(value: SnowballType): Self = this.set("SnowballType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballType: Self = this.set("SnowballType", js.undefined)
  }
}
