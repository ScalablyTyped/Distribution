package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStoreImageTaskRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket in which the AMI object will be stored. The bucket must be in the Region in which the request is being made. The AMI object appears in the bucket only after the upload task has completed. 
    */
  var Bucket: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId
  
  /**
    * The tags to apply to the AMI object that will be stored in the Amazon S3 bucket. 
    */
  var S3ObjectTags: js.UndefOr[S3ObjectTagList] = js.undefined
}
object CreateStoreImageTaskRequest {
  
  inline def apply(Bucket: String, ImageId: ImageId): CreateStoreImageTaskRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStoreImageTaskRequest]
  }
  
  extension [Self <: CreateStoreImageTaskRequest](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectTags(value: S3ObjectTagList): Self = StObject.set(x, "S3ObjectTags", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectTagsUndefined: Self = StObject.set(x, "S3ObjectTags", js.undefined)
    
    inline def setS3ObjectTagsVarargs(value: S3ObjectTag*): Self = StObject.set(x, "S3ObjectTags", js.Array(value*))
  }
}
