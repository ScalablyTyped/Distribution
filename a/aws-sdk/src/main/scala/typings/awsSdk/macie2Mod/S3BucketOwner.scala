package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketOwner extends js.Object {
  /**
    * The display name of the user who owns the bucket.
    */
  var displayName: js.UndefOr[string] = js.native
  /**
    * The AWS account ID for the user who owns the bucket.
    */
  var id: js.UndefOr[string] = js.native
}

object S3BucketOwner {
  @scala.inline
  def apply(displayName: string = null, id: string = null): S3BucketOwner = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketOwner]
  }
}

