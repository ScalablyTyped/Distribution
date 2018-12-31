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

