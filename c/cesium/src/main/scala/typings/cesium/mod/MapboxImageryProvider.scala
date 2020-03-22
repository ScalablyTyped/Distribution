package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides tiled imagery hosted by Mapbox
  */
@JSImport("cesium", "MapboxImageryProvider")
@js.native
class MapboxImageryProvider () extends MapboxProviderCommonApi {
  def this(options: MapboxImageryProviderOptions) = this()
}

