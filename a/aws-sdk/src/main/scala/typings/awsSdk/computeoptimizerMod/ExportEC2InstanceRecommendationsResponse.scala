package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportEC2InstanceRecommendationsResponse extends StObject {
  
  /**
    * The identification number of the export job. Use the DescribeRecommendationExportJobs action, and specify the job ID to view the status of an export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * An object that describes the destination Amazon S3 bucket of a recommendations export file.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}
object ExportEC2InstanceRecommendationsResponse {
  
  @scala.inline
  def apply(): ExportEC2InstanceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportEC2InstanceRecommendationsResponse]
  }
  
  @scala.inline
  implicit class ExportEC2InstanceRecommendationsResponseMutableBuilder[Self <: ExportEC2InstanceRecommendationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setS3Destination(value: S3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
