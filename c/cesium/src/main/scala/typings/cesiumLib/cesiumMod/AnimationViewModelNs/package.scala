package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AnimationViewModelNs {
  type DateFormatter = js.Function2[
    /* date */ cesiumLib.cesiumMod.JulianDate, 
    /* viewModel */ cesiumLib.cesiumMod.AnimationViewModel, 
    java.lang.String
  ]
  type TimeFormatter = js.Function2[
    /* date */ cesiumLib.cesiumMod.JulianDate, 
    /* viewModel */ cesiumLib.cesiumMod.AnimationViewModel, 
    java.lang.String
  ]
}
