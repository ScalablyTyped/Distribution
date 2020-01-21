package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketEncryptionRequest extends js.Object {
  /**
    * The name of the bucket containing the server-side encryption configuration to delete.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketEncryptionRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketEncryptionRequest]
  }
}

