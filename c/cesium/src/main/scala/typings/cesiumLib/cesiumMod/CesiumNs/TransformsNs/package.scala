package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransformsNs {
  type LocalFrameToFixedFrame = js.Function3[
    /* origin */ cesiumLib.cesiumMod.CesiumNs.Cartesian3, 
    /* ellipsoid */ js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid], 
    /* result */ js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4], 
    cesiumLib.cesiumMod.CesiumNs.Matrix4
  ]
}
