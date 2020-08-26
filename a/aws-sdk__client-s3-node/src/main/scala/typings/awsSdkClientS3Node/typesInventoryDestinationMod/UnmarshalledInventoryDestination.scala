package typings.awsSdkClientS3Node.typesInventoryDestinationMod

import typings.awsSdkClientS3Node.typesInventoryS3BucketDestinationMod.UnmarshalledInventoryS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInventoryDestination extends InventoryDestination {
  /**
    * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination_UnmarshalledInventoryDestination: UnmarshalledInventoryS3BucketDestination = js.native
}

object UnmarshalledInventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: UnmarshalledInventoryS3BucketDestination): UnmarshalledInventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryDestination]
  }
  @scala.inline
  implicit class UnmarshalledInventoryDestinationOps[Self <: UnmarshalledInventoryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setS3BucketDestination(value: UnmarshalledInventoryS3BucketDestination): Self = this.set("S3BucketDestination", value.asInstanceOf[js.Any])
  }
  
}

