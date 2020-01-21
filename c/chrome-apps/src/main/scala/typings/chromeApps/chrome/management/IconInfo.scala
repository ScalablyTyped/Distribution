package typings.chromeApps.chrome.management

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an icon belonging to an extension, app, or theme. */
trait IconInfo extends js.Object {
  /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
  var size: integer
  /**
    * The URL for this icon image.
    * To display a grayscale version of the icon (to indicate that an extension is disabled, for example),
    * append ?grayscale=true to the URL. */
  var url: String
}

object IconInfo {
  @scala.inline
  def apply(size: integer, url: String): IconInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IconInfo]
  }
}

