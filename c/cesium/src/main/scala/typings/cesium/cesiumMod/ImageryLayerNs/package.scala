package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImageryLayerNs {
  import typings.cesium.cesiumMod.ImageryLayer

  type ValueFunc = js.Function5[
    /* frameState */ js.Any, 
    /* layer */ ImageryLayer, 
    /* x */ Double, 
    /* y */ Double, 
    /* level */ Double, 
    Double
  ]
}
