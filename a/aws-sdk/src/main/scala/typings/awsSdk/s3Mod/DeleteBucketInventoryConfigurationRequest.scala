package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketInventoryConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the inventory configuration to delete.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId = js.native
}

object DeleteBucketInventoryConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId): DeleteBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationRequest]
  }
}

