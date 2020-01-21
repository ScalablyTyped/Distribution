package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Source extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: BucketName = js.native
  /**
    * Key name of the bucket object that contains your unsigned code.
    */
  var key: Key_ = js.native
  /**
    * Version of your source image in your version enabled S3 bucket.
    */
  var version: Version = js.native
}

object S3Source {
  @scala.inline
  def apply(bucketName: BucketName, key: Key_, version: Version): S3Source = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Source]
  }
}

