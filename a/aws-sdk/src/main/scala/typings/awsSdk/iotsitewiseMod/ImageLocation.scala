package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageLocation extends js.Object {
  /**
    * The ID of the image.
    */
  var id: ID = js.native
  /**
    * The URL where the image is available. The URL is valid for 15 minutes so that you can view and download the image
    */
  var url: Url = js.native
}

object ImageLocation {
  @scala.inline
  def apply(id: ID, url: Url): ImageLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLocation]
  }
}

