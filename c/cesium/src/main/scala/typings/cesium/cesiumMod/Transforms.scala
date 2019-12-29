package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Transforms")
@js.native
object Transforms extends js.Object {
  def computeFixedToIcrfMatrix(date: JulianDate): Matrix3 = js.native
  def computeFixedToIcrfMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: JulianDate): Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: JulianDate): Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Quaternion = js.native
  def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Quaternion
  ): Quaternion = js.native
  def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Matrix4 = js.native
  def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Matrix4
  ): Matrix4 = js.native
  def northEastDownToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  def northUpEastToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  def pointToWindowCoordinates(modelViewProjectionMatrix: Matrix4, viewportTransformation: Matrix4, point: Cartesian3): Cartesian2 = js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: Matrix4,
    viewportTransformation: Matrix4,
    point: Cartesian3,
    result: Cartesian2
  ): Cartesian2 = js.native
  def preloadIcrfFixed(timeInterval: TimeInterval): js.Promise[Unit] = js.native
  type LocalFrameToFixedFrame = js.Function3[
    /* origin */ Cartesian3, 
    /* ellipsoid */ js.UndefOr[Ellipsoid], 
    /* result */ js.UndefOr[Matrix4], 
    Matrix4
  ]
}

