package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProviderViewModelNs {
  import typings.cesium.cesiumMod.ImageryProvider
  import typings.cesium.cesiumMod.TerrainProvider

  type CreationFunction = js.Function0[
    ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])
  ]
}
