package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BillboardNs {
  import typings.std.HTMLCanvasElement
  import typings.std.HTMLImageElement

  type CreateImageCallback = js.Function1[
    /* id */ String, 
    HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
  ]
}
