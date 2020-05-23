package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The date the image was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  /**
    * A URL at which the image is available. The URL is valid for 15 minutes for you to view and download the image.
    */
  var locationUrl: js.UndefOr[Url] = js.native
}

object Image {
  @scala.inline
  def apply(lastUpdateDate: Timestamp = null, locationUrl: Url = null): Image = {
    val __obj = js.Dynamic.literal()
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    if (locationUrl != null) __obj.updateDynamic("locationUrl")(locationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

