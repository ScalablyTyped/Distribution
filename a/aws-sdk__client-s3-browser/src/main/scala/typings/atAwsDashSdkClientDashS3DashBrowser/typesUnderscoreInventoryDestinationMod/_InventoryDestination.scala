package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryDestinationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryS3BucketDestinationMod._InventoryS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryDestination extends js.Object {
  /**
    * <p>Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.</p>
    */
  var S3BucketDestination: _InventoryS3BucketDestination
}

object _InventoryDestination {
  @scala.inline
  def apply(S3BucketDestination: _InventoryS3BucketDestination): _InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_InventoryDestination]
  }
}

