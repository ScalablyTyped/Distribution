package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HermiteSpline")
@js.native
class HermiteSpline protected ()
  extends cesiumLib.cesiumMod.CesiumNs.HermiteSpline {
  def this(options: cesiumLib.Anon_InTangents) = this()
}

@JSImport("cesium", "HermiteSpline")
@js.native
object HermiteSpline extends js.Object {
  def createC1(): cesiumLib.cesiumMod.CesiumNs.HermiteSpline = js.native
  def createClampedCubic(): cesiumLib.cesiumMod.CesiumNs.HermiteSpline | cesiumLib.cesiumMod.CesiumNs.LinearSpline = js.native
  def createNaturalCubic(): cesiumLib.cesiumMod.CesiumNs.HermiteSpline | cesiumLib.cesiumMod.CesiumNs.LinearSpline = js.native
}

