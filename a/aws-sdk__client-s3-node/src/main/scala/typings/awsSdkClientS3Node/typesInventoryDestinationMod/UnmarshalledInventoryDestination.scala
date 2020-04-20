package typings.awsSdkClientS3Node.typesInventoryDestinationMod

import typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod.UnmarshalledInventoryS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInventoryDestination extends InventoryDestination {
  /**
    * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination_UnmarshalledInventoryDestination: UnmarshalledInventoryS3BucketDestination
}

object UnmarshalledInventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: UnmarshalledInventoryS3BucketDestination): UnmarshalledInventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryDestination]
  }
}

