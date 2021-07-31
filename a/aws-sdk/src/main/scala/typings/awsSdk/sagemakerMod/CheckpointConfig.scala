package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckpointConfig extends StObject {
  
  /**
    * (Optional) The local directory where checkpoints are written. The default directory is /opt/ml/checkpoints/. 
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.undefined
  
  /**
    * Identifies the S3 path where you want Amazon SageMaker to store checkpoints. For example, s3://bucket-name/key-name-prefix.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri
}
object CheckpointConfig {
  
  @scala.inline
  def apply(S3Uri: S3Uri): CheckpointConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfig]
  }
  
  @scala.inline
  implicit class CheckpointConfigMutableBuilder[Self <: CheckpointConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
