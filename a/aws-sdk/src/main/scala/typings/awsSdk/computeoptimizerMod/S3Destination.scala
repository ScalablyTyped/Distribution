package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * The name of the Amazon S3 bucket used as the destination of an export file.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.native
  /**
    * The Amazon S3 bucket key of an export file. The key uniquely identifies the object, or export file, in the S3 bucket.
    */
  var key: js.UndefOr[DestinationKey] = js.native
  /**
    * The Amazon S3 bucket key of a metadata file. The key uniquely identifies the object, or metadata file, in the S3 bucket.
    */
  var metadataKey: js.UndefOr[MetadataKey] = js.native
}

object S3Destination {
  @scala.inline
  def apply(bucket: DestinationBucket = null, key: DestinationKey = null, metadataKey: MetadataKey = null): S3Destination = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
}

