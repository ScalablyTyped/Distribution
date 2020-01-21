package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageResponse extends js.Object {
  /**
    * Details of the image uploaded.
    */
  var image: js.UndefOr[Image] = js.native
}

object PutImageResponse {
  @scala.inline
  def apply(image: Image = null): PutImageResponse = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageResponse]
  }
}

