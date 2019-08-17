package typings.blueimpDashLoadDashImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object blueimpDashLoadDashImageMod {
  import typings.std.HTMLCanvasElement

  type AspectRatio = Double
  type LoadImageCallback = js.Function1[/* canvas */ HTMLCanvasElement, Unit]
  type LoadImageOptions = BasicOptions with CanvasOptions with CropOptions with MetaOptions
  type Orientation = Double | Boolean
}
