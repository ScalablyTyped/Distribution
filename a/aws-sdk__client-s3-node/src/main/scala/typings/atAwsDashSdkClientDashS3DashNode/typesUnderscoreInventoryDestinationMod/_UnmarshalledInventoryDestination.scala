package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryDestinationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryS3BucketDestinationMod._UnmarshalledInventoryS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInventoryDestination extends _InventoryDestination {
  /**
    * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination__UnmarshalledInventoryDestination: _UnmarshalledInventoryS3BucketDestination
}

object _UnmarshalledInventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: _UnmarshalledInventoryS3BucketDestination): _UnmarshalledInventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination)
  
    __obj.asInstanceOf[_UnmarshalledInventoryDestination]
  }
}

