package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * The taget processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * A hash of the object specified by s3Bucket and s3Key.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The s3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    @scala.inline
    def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
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
