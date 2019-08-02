package typings.blueimpDashLoadDashImage

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object blueimpDashLoadDashImageMod {
  type AspectRatio = Double
  type LoadImageCallback = js.Function1[/* canvas */ HTMLCanvasElement, Unit]
  type LoadImageOptions = BasicOptions with CanvasOptions with CropOptions with MetaOptions
  type Orientation = Double | Boolean
}
