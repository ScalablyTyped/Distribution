package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserBucket extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the disk image is located.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}
object UserBucket {
  
  @scala.inline
  def apply(): UserBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserBucket]
  }
  
  @scala.inline
  implicit class UserBucketMutableBuilder[Self <: UserBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
