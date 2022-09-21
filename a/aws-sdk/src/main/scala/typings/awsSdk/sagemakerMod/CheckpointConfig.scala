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
    * Identifies the S3 path where you want SageMaker to store checkpoints. For example, s3://bucket-name/key-name-prefix.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri
}
object CheckpointConfig {
  
  inline def apply(S3Uri: S3Uri): CheckpointConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfig]
  }
  
  extension [Self <: CheckpointConfig](x: Self) {
    
    inline def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
