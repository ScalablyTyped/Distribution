package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipsoidGeometryUpdater extends GeometryUpdater {
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: scala.Boolean): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: scala.Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: scala.Boolean): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: scala.Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
}

