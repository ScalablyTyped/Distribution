package typings.awsSdkClientS3Node.typesInventoryDestinationMod

import typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod.InventoryS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestination extends js.Object {
  /**
    * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
    */
  var S3BucketDestination: InventoryS3BucketDestination
}

object InventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
}

