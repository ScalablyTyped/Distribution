package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectTaggingOperation extends js.Object {
  /**
    * 
    */
  var TagSet: js.UndefOr[S3TagSet] = js.native
}

object S3SetObjectTaggingOperation {
  @scala.inline
  def apply(TagSet: S3TagSet = null): S3SetObjectTaggingOperation = {
    val __obj = js.Dynamic.literal()
    if (TagSet != null) __obj.updateDynamic("TagSet")(TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectTaggingOperation]
  }
}

