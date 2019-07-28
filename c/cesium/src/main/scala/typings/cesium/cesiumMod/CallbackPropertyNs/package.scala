package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CallbackPropertyNs {
  type Callback = js.Function2[/* time */ js.UndefOr[JulianDate], /* result */ js.UndefOr[js.Any], js.Any]
}
