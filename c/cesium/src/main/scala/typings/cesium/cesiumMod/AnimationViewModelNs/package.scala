package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AnimationViewModelNs {
  import typings.cesium.cesiumMod.AnimationViewModel
  import typings.cesium.cesiumMod.JulianDate

  type DateFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
  type TimeFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
}
