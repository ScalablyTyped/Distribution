package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGeometryUpdater")
@js.native
class EllipsoidGeometryUpdater protected () extends GeometryUpdater {
  def this(entity: Entity, scene: Scene) = this()
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: js.UndefOr[scala.Nothing], modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: Boolean): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: js.UndefOr[scala.Nothing], modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: Boolean): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
}

