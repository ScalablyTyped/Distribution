package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataSourceDisplayNs {
  type VisualizersCallback = js.Function2[
    /* scene */ cesiumLib.cesiumMod.Scene, 
    /* dataSource */ cesiumLib.cesiumMod.DataSource, 
    js.Array[cesiumLib.cesiumMod.Visualizer]
  ]
}
