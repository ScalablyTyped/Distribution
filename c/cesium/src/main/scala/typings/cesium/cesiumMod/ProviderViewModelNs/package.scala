package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.ImageryProvider
import typings.cesium.cesiumMod.TerrainProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProviderViewModelNs {
  type CreationFunction = js.Function0[
    ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])
  ]
}
