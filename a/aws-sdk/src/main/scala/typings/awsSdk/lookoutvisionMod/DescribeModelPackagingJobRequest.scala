package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackagingJobRequest extends StObject {
  
  /**
    * The job name for the model packaging job. 
    */
  var JobName: ModelPackagingJobName
  
  /**
    * The name of the project that contains the model packaging job that you want to describe. 
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
}
object DescribeModelPackagingJobRequest {
  
  inline def apply(JobName: ModelPackagingJobName, ProjectName: ProjectName): DescribeModelPackagingJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackagingJobRequest]
  }
  
  extension [Self <: DescribeModelPackagingJobRequest](x: Self) {
    
    inline def setJobName(value: ModelPackagingJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
