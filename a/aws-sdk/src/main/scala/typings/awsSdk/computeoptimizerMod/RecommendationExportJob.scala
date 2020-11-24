package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationExportJob extends js.Object {
  
  /**
    * The timestamp of when the export job was created.
    */
  var creationTimestamp: js.UndefOr[CreationTimestamp] = js.native
  
  /**
    * An object that describes the destination of the export file.
    */
  var destination: js.UndefOr[ExportDestination] = js.native
  
  /**
    * The reason for an export job failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The identification number of the export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * The timestamp of when the export job was last updated.
    */
  var lastUpdatedTimestamp: js.UndefOr[LastUpdatedTimestamp] = js.native
  
  /**
    * The resource type of the exported recommendations.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The status of the export job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}
object RecommendationExportJob {
  
  @scala.inline
  def apply(): RecommendationExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationExportJob]
  }
  
  @scala.inline
  implicit class RecommendationExportJobOps[Self <: RecommendationExportJob] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: CreationTimestamp): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDestination(value: ExportDestination): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: LastUpdatedTimestamp): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
