package typings.cesium.global.Cesium

import typings.cesium.mod.Transforms.LocalFrameToFixedFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transforms {
  
  @JSGlobal("Cesium.Transforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeFixedToIcrfMatrix(date: typings.cesium.mod.JulianDate): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def computeFixedToIcrfMatrix(date: typings.cesium.mod.JulianDate, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  inline def computeIcrfToFixedMatrix(date: typings.cesium.mod.JulianDate): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def computeIcrfToFixedMatrix(date: typings.cesium.mod.JulianDate, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  inline def computeTemeToPseudoFixedMatrix(date: typings.cesium.mod.JulianDate): typings.cesium.mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix3]
  inline def computeTemeToPseudoFixedMatrix(date: typings.cesium.mod.JulianDate, result: typings.cesium.mod.Matrix3): typings.cesium.mod.Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix3]
  
  inline def eastNorthUpToFixedFrame(origin: typings.cesium.mod.Cartesian3): typings.cesium.mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def eastNorthUpToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: Unit, result: typings.cesium.mod.Matrix4): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def eastNorthUpToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def eastNorthUpToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  
  inline def fixedFrameToHeadingPitchRoll(transform: typings.cesium.mod.Matrix4): typings.cesium.mod.HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: Unit,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.HeadingPitchRoll
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.HeadingPitchRoll
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: typings.cesium.mod.Matrix4, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.HeadingPitchRoll
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: typings.cesium.mod.Matrix4,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.HeadingPitchRoll
  ): typings.cesium.mod.HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.HeadingPitchRoll]
  
  inline def headingPitchRollQuaternion(origin: typings.cesium.mod.Cartesian3, headingPitchRoll: typings.cesium.mod.HeadingPitchRoll): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  inline def headingPitchRollQuaternion(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.Quaternion
  ): typings.cesium.mod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Quaternion]
  
  inline def headingPitchRollToFixedFrame(origin: typings.cesium.mod.Cartesian3, headingPitchRoll: typings.cesium.mod.HeadingPitchRoll): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: Unit,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    headingPitchRoll: typings.cesium.mod.HeadingPitchRoll,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  
  inline def northEastDownToFixedFrame(origin: typings.cesium.mod.Cartesian3): typings.cesium.mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northEastDownToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: Unit, result: typings.cesium.mod.Matrix4): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northEastDownToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northEastDownToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  
  inline def northUpEastToFixedFrame(origin: typings.cesium.mod.Cartesian3): typings.cesium.mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northUpEastToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: Unit, result: typings.cesium.mod.Matrix4): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northUpEastToFixedFrame(origin: typings.cesium.mod.Cartesian3, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  inline def northUpEastToFixedFrame(
    origin: typings.cesium.mod.Cartesian3,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    result: typings.cesium.mod.Matrix4
  ): typings.cesium.mod.Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Matrix4]
  
  inline def pointToWindowCoordinates(
    modelViewProjectionMatrix: typings.cesium.mod.Matrix4,
    viewportTransformation: typings.cesium.mod.Matrix4,
    point: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def pointToWindowCoordinates(
    modelViewProjectionMatrix: typings.cesium.mod.Matrix4,
    viewportTransformation: typings.cesium.mod.Matrix4,
    point: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  inline def preloadIcrfFixed(timeInterval: typings.cesium.mod.TimeInterval): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preloadIcrfFixed")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
