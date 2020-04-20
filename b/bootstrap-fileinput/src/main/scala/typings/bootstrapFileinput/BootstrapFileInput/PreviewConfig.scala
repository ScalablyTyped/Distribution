package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewConfig extends js.Object {
  /**
    * the caption or filename to display for each initial preview item content.
    */
  var caption: String
  /**
    * the extra data that will be passed as data to the initial preview delete url / AJAX server call via POST.
    * This will default to deleteExtraData if not set.
    */
  var extra: js.Object | js.Function0[js.Object]
  /**
    * the additional frame css class to set for the file's thumbnail frame.
    */
  var frameClass: String
  /**
    * the key that will be passed as data to the url via AJAX POST.
    */
  var key: String | js.Object
  /**
    * the URL for deleting the image/ content in the initial preview via AJAX post response.This will default to deleteUrl if not set.
    */
  var url: String
  /**
    * the CSS width of the image/ content displayed.
    */
  var width: String
}

object PreviewConfig {
  @scala.inline
  def apply(
    caption: String,
    extra: js.Object | js.Function0[js.Object],
    frameClass: String,
    key: String | js.Object,
    url: String,
    width: String
  ): PreviewConfig = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], frameClass = frameClass.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewConfig]
  }
}

