package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Transforms")
@js.native
object TransformsNs extends js.Object {
  def computeFixedToIcrfMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def computeFixedToIcrfMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate, result: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate, result: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: cesiumLib.cesiumMod.CesiumNs.JulianDate, result: cesiumLib.cesiumMod.CesiumNs.Matrix3): cesiumLib.cesiumMod.CesiumNs.Matrix3 = js.native
  def eastNorthUpToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def eastNorthUpToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def eastNorthUpToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    fixedFrameTransform: cesiumLib.cesiumMod.CesiumNs.TransformsNs.LocalFrameToFixedFrame
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    fixedFrameTransform: cesiumLib.cesiumMod.CesiumNs.TransformsNs.LocalFrameToFixedFrame,
    result: cesiumLib.cesiumMod.CesiumNs.Quaternion
  ): cesiumLib.cesiumMod.CesiumNs.Quaternion = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    fixedFrameTransform: cesiumLib.cesiumMod.CesiumNs.TransformsNs.LocalFrameToFixedFrame
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    fixedFrameTransform: cesiumLib.cesiumMod.CesiumNs.TransformsNs.LocalFrameToFixedFrame,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northEastDownToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northEastDownToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northEastDownToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northUpEastToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northUpEastToFixedFrame(origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def northUpEastToFixedFrame(
    origin: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.Matrix4
  ): cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    viewportTransformation: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    viewportTransformation: cesiumLib.cesiumMod.CesiumNs.Matrix4,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def preloadIcrfFixed(timeInterval: cesiumLib.cesiumMod.CesiumNs.TimeInterval): stdLib.Promise[scala.Unit] = js.native
}

