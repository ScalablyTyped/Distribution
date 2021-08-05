package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transforms {
  
  @JSImport("cesium", "Transforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeFixedToIcrfMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  inline def computeFixedToIcrfMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  inline def computeIcrfToFixedMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  inline def computeIcrfToFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  inline def computeTemeToPseudoFixedMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  inline def computeTemeToPseudoFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  
  inline def eastNorthUpToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
  inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4): HeadingPitchRoll = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any]).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Unit, fixedFrameTransform: Unit, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Unit, fixedFrameTransform: LocalFrameToFixedFrame): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: HeadingPitchRoll
  ): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Ellipsoid): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Ellipsoid, fixedFrameTransform: Unit, result: HeadingPitchRoll): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Ellipsoid, fixedFrameTransform: LocalFrameToFixedFrame): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  inline def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: HeadingPitchRoll
  ): HeadingPitchRoll = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedFrameToHeadingPitchRoll")(transform.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[HeadingPitchRoll]
  
  inline def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: Unit,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  inline def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Quaternion
  ): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollQuaternion")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  inline def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: Unit,
    result: Matrix4
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Unit,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Matrix4
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: Unit,
    result: Matrix4
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Matrix4
  ): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("headingPitchRollToFixedFrame")(origin.asInstanceOf[js.Any], headingPitchRoll.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], fixedFrameTransform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  
  inline def northEastDownToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
  inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  
  inline def northUpEastToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
  inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
  
  inline def pointToWindowCoordinates(modelViewProjectionMatrix: Matrix4, viewportTransformation: Matrix4, point: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  inline def pointToWindowCoordinates(
    modelViewProjectionMatrix: Matrix4,
    viewportTransformation: Matrix4,
    point: Cartesian3,
    result: Cartesian2
  ): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  inline def preloadIcrfFixed(timeInterval: TimeInterval): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preloadIcrfFixed")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type LocalFrameToFixedFrame = js.Function3[
    /* origin */ Cartesian3, 
    /* ellipsoid */ js.UndefOr[Ellipsoid], 
    /* result */ js.UndefOr[Matrix4], 
    Matrix4
  ]
}
