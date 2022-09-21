package typings.cesium

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.HeadingPitchRoll
import typings.cesium.mod.JulianDate
import typings.cesium.mod.Matrix3
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Quaternion
import typings.cesium.mod.TimeInterval
import typings.cesium.mod.Transforms.LocalFrameToFixedFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  object default {
    
    @JSImport("cesium/Source/Core/Transforms", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes a rotation matrix to transform a point or vector from the Earth-Fixed frame axes (ITRF)
      * to the International Celestial Reference Frame (GCRF/ICRF) inertial frame axes
      * at a given time.  This function may return undefined if the data necessary to
      * do the transformation is not yet loaded.
      * @example
      * // Transform a point from the ICRF axes to the Fixed axes.
      * const now = Cesium.JulianDate.now();
      * const pointInFixed = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const fixedToIcrf = Cesium.Transforms.computeIcrfToFixedMatrix(now);
      * let pointInInertial = new Cesium.Cartesian3();
      * if (Cesium.defined(fixedToIcrf)) {
      *     pointInInertial = Cesium.Matrix3.multiplyByVector(fixedToIcrf, pointInFixed, pointInInertial);
      * }
      * @param date - The time at which to compute the rotation matrix.
      * @param [result] - The object onto which to store the result.  If this parameter is
      *                  not specified, a new instance is created and returned.
      * @returns The rotation matrix, or undefined if the data necessary to do the
      *                   transformation is not yet loaded.
      */
    inline def computeFixedToIcrfMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def computeFixedToIcrfMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFixedToIcrfMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a rotation matrix to transform a point or vector from the International Celestial
      * Reference Frame (GCRF/ICRF) inertial frame axes to the Earth-Fixed frame axes (ITRF)
      * at a given time.  This function may return undefined if the data necessary to
      * do the transformation is not yet loaded.
      * @example
      * scene.postUpdate.addEventListener(function(scene, time) {
      *   // View in ICRF.
      *   const icrfToFixed = Cesium.Transforms.computeIcrfToFixedMatrix(time);
      *   if (Cesium.defined(icrfToFixed)) {
      *     const offset = Cesium.Cartesian3.clone(camera.position);
      *     const transform = Cesium.Matrix4.fromRotationTranslation(icrfToFixed);
      *     camera.lookAtTransform(transform, offset);
      *   }
      * });
      * @param date - The time at which to compute the rotation matrix.
      * @param [result] - The object onto which to store the result.  If this parameter is
      *                  not specified, a new instance is created and returned.
      * @returns The rotation matrix, or undefined if the data necessary to do the
      *                   transformation is not yet loaded.
      */
    inline def computeIcrfToFixedMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def computeIcrfToFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeIcrfToFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a rotation matrix to transform a point or vector from True Equator Mean Equinox (TEME) axes to the
      * pseudo-fixed axes at a given time.  This method treats the UT1 time standard as equivalent to UTC.
      * @example
      * //Set the view to the inertial frame.
      * scene.postUpdate.addEventListener(function(scene, time) {
      *    const now = Cesium.JulianDate.now();
      *    const offset = Cesium.Matrix4.multiplyByPoint(camera.transform, camera.position, new Cesium.Cartesian3());
      *    const transform = Cesium.Matrix4.fromRotationTranslation(Cesium.Transforms.computeTemeToPseudoFixedMatrix(now));
      *    const inverseTransform = Cesium.Matrix4.inverseTransformation(transform, new Cesium.Matrix4());
      *    Cesium.Matrix4.multiplyByPoint(inverseTransform, offset, offset);
      *    camera.lookAtTransform(transform, offset);
      * });
      * @param date - The time at which to compute the rotation matrix.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix3 instance if none was provided.
      */
    inline def computeTemeToPseudoFixedMatrix(date: JulianDate): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
    inline def computeTemeToPseudoFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTemeToPseudoFixedMatrix")(date.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    
    /**
      * Computes a 4x4 transformation matrix from a reference frame with an east-north-up axes
      * centered at the provided origin to the provided ellipsoid's fixed reference frame.
      * The local axes are defined as:
      * <ul>
      * <li>The <code>x</code> axis points in the local east direction.</li>
      * <li>The <code>y</code> axis points in the local north direction.</li>
      * <li>The <code>z</code> axis points in the direction of the ellipsoid surface normal which passes through the position.</li>
      * </ul>
      * @example
      * // Get the transform from local east-north-up at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const transform = Cesium.Transforms.eastNorthUpToFixedFrame(center);
      * @param origin - The center point of the local reference frame.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if none was provided.
      */
    inline def eastNorthUpToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("eastNorthUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes heading-pitch-roll angles from a transform in a particular reference frame. Heading is the rotation from the local north
      * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
      * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
      * @param transform - The transform
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [fixedFrameTransform = Transforms.eastNorthUpToFixedFrame] - A 4x4 transformation
      *  matrix from a reference frame to the provided ellipsoid's fixed reference frame
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new HeadingPitchRoll instance if none was provided.
      */
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
    
    /**
      * Computes a quaternion from a reference frame with axes computed from the heading-pitch-roll angles
      * centered at the provided origin. Heading is the rotation from the local north
      * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
      * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
      * @example
      * // Get the quaternion from local heading-pitch-roll at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const heading = -Cesium.Math.PI_OVER_TWO;
      * const pitch = Cesium.Math.PI_OVER_FOUR;
      * const roll = 0.0;
      * const hpr = new HeadingPitchRoll(heading, pitch, roll);
      * const quaternion = Cesium.Transforms.headingPitchRollQuaternion(center, hpr);
      * @param origin - The center point of the local reference frame.
      * @param headingPitchRoll - The heading, pitch, and roll.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [fixedFrameTransform = Transforms.eastNorthUpToFixedFrame] - A 4x4 transformation
      *  matrix from a reference frame to the provided ellipsoid's fixed reference frame
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Quaternion instance if none was provided.
      */
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
    
    /**
      * Computes a 4x4 transformation matrix from a reference frame with axes computed from the heading-pitch-roll angles
      * centered at the provided origin to the provided ellipsoid's fixed reference frame. Heading is the rotation from the local north
      * direction where a positive angle is increasing eastward. Pitch is the rotation from the local east-north plane. Positive pitch angles
      * are above the plane. Negative pitch angles are below the plane. Roll is the first rotation applied about the local east axis.
      * @example
      * // Get the transform from local heading-pitch-roll at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const heading = -Cesium.Math.PI_OVER_TWO;
      * const pitch = Cesium.Math.PI_OVER_FOUR;
      * const roll = 0.0;
      * const hpr = new Cesium.HeadingPitchRoll(heading, pitch, roll);
      * const transform = Cesium.Transforms.headingPitchRollToFixedFrame(center, hpr);
      * @param origin - The center point of the local reference frame.
      * @param headingPitchRoll - The heading, pitch, and roll.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [fixedFrameTransform = Transforms.eastNorthUpToFixedFrame] - A 4x4 transformation
      *  matrix from a reference frame to the provided ellipsoid's fixed reference frame
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if none was provided.
      */
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
    
    /**
      * Generates a function that computes a 4x4 transformation matrix from a reference frame
      * centered at the provided origin to the provided ellipsoid's fixed reference frame.
      * @param firstAxis - name of the first axis of the local reference frame. Must be
      *  'east', 'north', 'up', 'west', 'south' or 'down'.
      * @param secondAxis - name of the second axis of the local reference frame. Must be
      *  'east', 'north', 'up', 'west', 'south' or 'down'.
      * @returns The function that will computes a
      * 4x4 transformation matrix from a reference frame, with first axis and second axis compliant with the parameters,
      */
    inline def localFrameToFixedFrameGenerator(firstAxis: String, secondAxis: String): LocalFrameToFixedFrame = (^.asInstanceOf[js.Dynamic].applyDynamic("localFrameToFixedFrameGenerator")(firstAxis.asInstanceOf[js.Any], secondAxis.asInstanceOf[js.Any])).asInstanceOf[LocalFrameToFixedFrame]
    
    /**
      * Computes a 4x4 transformation matrix from a reference frame with an north-east-down axes
      * centered at the provided origin to the provided ellipsoid's fixed reference frame.
      * The local axes are defined as:
      * <ul>
      * <li>The <code>x</code> axis points in the local north direction.</li>
      * <li>The <code>y</code> axis points in the local east direction.</li>
      * <li>The <code>z</code> axis points in the opposite direction of the ellipsoid surface normal which passes through the position.</li>
      * </ul>
      * @example
      * // Get the transform from local north-east-down at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const transform = Cesium.Transforms.northEastDownToFixedFrame(center);
      * @param origin - The center point of the local reference frame.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if none was provided.
      */
    inline def northEastDownToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northEastDownToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a 4x4 transformation matrix from a reference frame with an north-up-east axes
      * centered at the provided origin to the provided ellipsoid's fixed reference frame.
      * The local axes are defined as:
      * <ul>
      * <li>The <code>x</code> axis points in the local north direction.</li>
      * <li>The <code>y</code> axis points in the direction of the ellipsoid surface normal which passes through the position.</li>
      * <li>The <code>z</code> axis points in the local east direction.</li>
      * </ul>
      * @example
      * // Get the transform from local north-up-east at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const transform = Cesium.Transforms.northUpEastToFixedFrame(center);
      * @param origin - The center point of the local reference frame.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if none was provided.
      */
    inline def northUpEastToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northUpEastToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes a 4x4 transformation matrix from a reference frame with an north-west-up axes
      * centered at the provided origin to the provided ellipsoid's fixed reference frame.
      * The local axes are defined as:
      * <ul>
      * <li>The <code>x</code> axis points in the local north direction.</li>
      * <li>The <code>y</code> axis points in the local west direction.</li>
      * <li>The <code>z</code> axis points in the direction of the ellipsoid surface normal which passes through the position.</li>
      * </ul>
      * @example
      * // Get the transform from local north-West-Up at cartographic (0.0, 0.0) to Earth's fixed frame.
      * const center = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
      * const transform = Cesium.Transforms.northWestUpToFixedFrame(center);
      * @param origin - The center point of the local reference frame.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix4 instance if none was provided.
      */
    inline def northWestUpToFixedFrame(origin: Cartesian3): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("northWestUpToFixedFrame")(origin.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
    inline def northWestUpToFixedFrame(origin: Cartesian3, ellipsoid: Unit, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northWestUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northWestUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northWestUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    inline def northWestUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("northWestUpToFixedFrame")(origin.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Transform a point from model coordinates to window coordinates.
      * @param modelViewProjectionMatrix - The 4x4 model-view-projection matrix.
      * @param viewportTransformation - The 4x4 viewport transformation.
      * @param point - The point to transform.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Cartesian2 instance if none was provided.
      */
    inline def pointToWindowCoordinates(modelViewProjectionMatrix: Matrix4, viewportTransformation: Matrix4, point: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    inline def pointToWindowCoordinates(
      modelViewProjectionMatrix: Matrix4,
      viewportTransformation: Matrix4,
      point: Cartesian3,
      result: Cartesian2
    ): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWindowCoordinates")(modelViewProjectionMatrix.asInstanceOf[js.Any], viewportTransformation.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
    
    /**
      * Preloads the data necessary to transform between the ICRF and Fixed axes, in either
      * direction, over a given interval.  This function returns a promise that, when resolved,
      * indicates that the preload has completed.
      * @example
      * const interval = new Cesium.TimeInterval(...);
      * Promise.resolve(Cesium.Transforms.preloadIcrfFixed(interval)).then(function() {
      *     // the data is now loaded
      * });
      * @param timeInterval - The interval to preload.
      * @returns A promise that, when resolved, indicates that the preload has completed
      *          and evaluation of the transformation between the fixed and ICRF axes will
      *          no longer return undefined for a time inside the interval.
      */
    inline def preloadIcrfFixed(timeInterval: TimeInterval): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("preloadIcrfFixed")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Transform a position and velocity to a rotation matrix.
      * @param position - The position to transform.
      * @param velocity - The velocity vector to transform.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid whose fixed frame is used in the transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Matrix3 instance if none was provided.
      */
    inline def rotationMatrixFromPositionVelocity(position: Cartesian3, velocity: Cartesian3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationMatrixFromPositionVelocity")(position.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def rotationMatrixFromPositionVelocity(position: Cartesian3, velocity: Cartesian3, ellipsoid: Unit, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationMatrixFromPositionVelocity")(position.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def rotationMatrixFromPositionVelocity(position: Cartesian3, velocity: Cartesian3, ellipsoid: Ellipsoid): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationMatrixFromPositionVelocity")(position.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
    inline def rotationMatrixFromPositionVelocity(position: Cartesian3, velocity: Cartesian3, ellipsoid: Ellipsoid, result: Matrix3): Matrix3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationMatrixFromPositionVelocity")(position.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix3]
  }
}
