package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Logs extends StObject {
  
  /**
    * The Amazon S3 bucket in which to store the logs.
    */
  var s3BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon S3 path in which to store the logs.
    */
  var s3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object S3Logs {
  
  @scala.inline
  def apply(): S3Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Logs]
  }
  
  @scala.inline
  implicit class S3LogsMutableBuilder[Self <: S3Logs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketName(value: NonEmptyString): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: NonEmptyString): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
  }
}
