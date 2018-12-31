package typings
package chromeDashAppsLib.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WallpaperDetails extends js.Object {
  /** The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /** The file name of the saved wallpaper. */
  var filename: java.lang.String
  /**
    * The supported wallpaper layouts.
    * @see WallpaperLayout
    */
  var layout: WallpaperLayout | WallpaperLayoutType
  /** True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** The URL of the wallpaper to be set. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

