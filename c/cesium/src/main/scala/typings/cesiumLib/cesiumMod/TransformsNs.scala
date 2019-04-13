package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Transforms")
@js.native
object TransformsNs extends js.Object {
  def computeFixedToIcrfMatrix(date: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeFixedToIcrfMatrix(date: cesiumLib.cesiumMod.JulianDate, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeIcrfToFixedMatrix(date: cesiumLib.cesiumMod.JulianDate, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: cesiumLib.cesiumMod.JulianDate): cesiumLib.cesiumMod.Matrix3 = js.native
  def computeTemeToPseudoFixedMatrix(date: cesiumLib.cesiumMod.JulianDate, result: cesiumLib.cesiumMod.Matrix3): cesiumLib.cesiumMod.Matrix3 = js.native
  def eastNorthUpToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Matrix4 = js.native
  def eastNorthUpToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Matrix4 = js.native
  def eastNorthUpToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: cesiumLib.cesiumMod.Matrix4
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def headingPitchRollQuaternion(origin: cesiumLib.cesiumMod.Cartesian3, headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def headingPitchRollQuaternion(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: cesiumLib.cesiumMod.Quaternion
  ): cesiumLib.cesiumMod.Quaternion = js.native
  def headingPitchRollToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3, headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def headingPitchRollToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: cesiumLib.cesiumMod.Matrix4
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def northEastDownToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Matrix4 = js.native
  def northEastDownToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Matrix4 = js.native
  def northEastDownToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: cesiumLib.cesiumMod.Matrix4
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def northUpEastToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Matrix4 = js.native
  def northUpEastToFixedFrame(origin: cesiumLib.cesiumMod.Cartesian3, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Matrix4 = js.native
  def northUpEastToFixedFrame(
    origin: cesiumLib.cesiumMod.Cartesian3,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: cesiumLib.cesiumMod.Matrix4
  ): cesiumLib.cesiumMod.Matrix4 = js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: cesiumLib.cesiumMod.Matrix4,
    viewportTransformation: cesiumLib.cesiumMod.Matrix4,
    point: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: cesiumLib.cesiumMod.Matrix4,
    viewportTransformation: cesiumLib.cesiumMod.Matrix4,
    point: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def preloadIcrfFixed(timeInterval: cesiumLib.cesiumMod.TimeInterval): js.Promise[scala.Unit] = js.native
  type LocalFrameToFixedFrame = js.Function3[
    /* origin */ cesiumLib.cesiumMod.Cartesian3, 
    /* ellipsoid */ js.UndefOr[cesiumLib.cesiumMod.Ellipsoid], 
    /* result */ js.UndefOr[cesiumLib.cesiumMod.Matrix4], 
    cesiumLib.cesiumMod.Matrix4
  ]
}

