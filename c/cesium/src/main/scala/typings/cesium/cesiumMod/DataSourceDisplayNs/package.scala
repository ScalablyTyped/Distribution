package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataSourceDisplayNs {
  import typings.cesium.cesiumMod.DataSource
  import typings.cesium.cesiumMod.Scene
  import typings.cesium.cesiumMod.Visualizer

  type VisualizersCallback = js.Function2[/* scene */ Scene, /* dataSource */ DataSource, js.Array[Visualizer]]
}
