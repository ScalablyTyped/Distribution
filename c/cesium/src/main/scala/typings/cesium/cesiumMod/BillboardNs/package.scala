package typings.cesium.cesiumMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BillboardNs {
  type CreateImageCallback = js.Function1[
    /* id */ String, 
    HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
  ]
}
