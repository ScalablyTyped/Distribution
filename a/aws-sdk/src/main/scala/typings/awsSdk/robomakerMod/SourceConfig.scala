package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceConfig extends StObject {
  
  /**
    * The target processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}
object SourceConfig {
  
  @scala.inline
  def apply(): SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfig]
  }
  
  @scala.inline
  implicit class SourceConfigMutableBuilder[Self <: SourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
  }
}
