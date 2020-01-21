package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.native
  /**
    * A list of image objects corresponding to the image references in the request.
    */
  var images: js.UndefOr[ImageList] = js.native
}

object BatchGetImageResponse {
  @scala.inline
  def apply(failures: ImageFailureList = null, images: ImageList = null): BatchGetImageResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetImageResponse]
  }
}

