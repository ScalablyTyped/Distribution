package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageLocationResultMessage extends StObject {
  
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Bucket] = js.undefined
}
object CreateStorageLocationResultMessage {
  
  @scala.inline
  def apply(): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
  
  @scala.inline
  implicit class CreateStorageLocationResultMessageMutableBuilder[Self <: CreateStorageLocationResultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
  }
}
