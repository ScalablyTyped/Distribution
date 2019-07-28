package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.DataSource
import typings.cesium.cesiumMod.Scene
import typings.cesium.cesiumMod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataSourceDisplayNs {
  type VisualizersCallback = js.Function2[/* scene */ Scene, /* dataSource */ DataSource, js.Array[Visualizer]]
}
