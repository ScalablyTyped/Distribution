package typings.chromeDashApps.chrome.wallpaper

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WallpaperDetails extends js.Object {
  /** The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  /** The file name of the saved wallpaper. */
  var filename: String
  /**
    * The supported wallpaper layouts.
    * @see WallpaperLayout
    */
  var layout: WallpaperLayout | WallpaperLayoutType
  /** True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[Boolean] = js.undefined
  /** The URL of the wallpaper to be set. */
  var url: js.UndefOr[String] = js.undefined
}

object WallpaperDetails {
  @scala.inline
  def apply(
    filename: String,
    layout: WallpaperLayout | WallpaperLayoutType,
    data: ArrayBuffer = null,
    thumbnail: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): WallpaperDetails = {
    val __obj = js.Dynamic.literal(filename = filename, layout = layout.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WallpaperDetails]
  }
}

