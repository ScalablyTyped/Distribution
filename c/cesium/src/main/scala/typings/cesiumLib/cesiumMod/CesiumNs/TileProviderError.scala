package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TileProviderError extends js.Object {
  var error: stdLib.Error
  var level: scala.Double
  var message: java.lang.String
  var provider: ImageryProvider | TerrainProvider
  var retry: scala.Boolean
  var timesRetried: scala.Double
  var x: scala.Double
  var y: scala.Double
}

