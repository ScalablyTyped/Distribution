package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAutoScalingGroupRecommendationsResponse extends StObject {
  
  /**
    * The identification number of the export job. Use the DescribeRecommendationExportJobs action, and specify the job ID to view the status of an export job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * An object that describes the destination Amazon S3 bucket of a recommendations export file.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.undefined
}
object ExportAutoScalingGroupRecommendationsResponse {
  
  @scala.inline
  def apply(): ExportAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAutoScalingGroupRecommendationsResponse]
  }
  
  @scala.inline
  implicit class ExportAutoScalingGroupRecommendationsResponseMutableBuilder[Self <: ExportAutoScalingGroupRecommendationsResponse] (val x: Self) extends AnyVal {
    
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
