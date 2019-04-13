package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CallbackPropertyNs {
  type Callback = js.Function2[
    /* time */ js.UndefOr[cesiumLib.cesiumMod.JulianDate], 
    /* result */ js.UndefOr[js.Any], 
    js.Any
  ]
}
