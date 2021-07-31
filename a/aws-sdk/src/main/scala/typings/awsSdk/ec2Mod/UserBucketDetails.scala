package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserBucketDetails extends StObject {
  
  /**
    * The Amazon S3 bucket from which the disk image was created.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}
object UserBucketDetails {
  
  @scala.inline
  def apply(): UserBucketDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserBucketDetails]
  }
  
  @scala.inline
  implicit class UserBucketDetailsMutableBuilder[Self <: UserBucketDetails] (val x: Self) extends AnyVal {
    
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
