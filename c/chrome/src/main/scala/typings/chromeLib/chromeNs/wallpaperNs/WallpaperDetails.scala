package typings
package chromeLib.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WallpaperDetails extends js.Object {
  /** Optional. The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** The file name of the saved wallpaper. */
  var filename: java.lang.String
  /**
    * The supported wallpaper layouts.
    * One of: "STRETCH", "CENTER", or "CENTER_CROPPED"
    */
  var layout: java.lang.String
  /** Optional. True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The URL of the wallpaper to be set. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WallpaperDetails {
  @scala.inline
  def apply(
    filename: java.lang.String,
    layout: java.lang.String,
    data: js.Any = null,
    thumbnail: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): WallpaperDetails = {
    val __obj = js.Dynamic.literal(filename = filename, layout = layout)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WallpaperDetails]
  }
}

