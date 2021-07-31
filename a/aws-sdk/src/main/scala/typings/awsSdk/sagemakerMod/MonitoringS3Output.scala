package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringS3Output extends StObject {
  
  /**
    * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
    */
  var LocalPath: ProcessingLocalPath
  
  /**
    * Whether to upload the results of the monitoring job continuously or after the job completes.
    */
  var S3UploadMode: js.UndefOr[ProcessingS3UploadMode] = js.undefined
  
  /**
    * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
    */
  var S3Uri: MonitoringS3Uri
}
object MonitoringS3Output {
  
  @scala.inline
  def apply(LocalPath: ProcessingLocalPath, S3Uri: MonitoringS3Uri): MonitoringS3Output = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringS3Output]
  }
  
  @scala.inline
  implicit class MonitoringS3OutputMutableBuilder[Self <: MonitoringS3Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPath(value: ProcessingLocalPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UploadMode(value: ProcessingS3UploadMode): Self = StObject.set(x, "S3UploadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UploadModeUndefined: Self = StObject.set(x, "S3UploadMode", js.undefined)
    
    @scala.inline
    def setS3Uri(value: MonitoringS3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
