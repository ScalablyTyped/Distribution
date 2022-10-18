package typings.cesium

import typings.cesium.anon.InTangents
import typings.cesium.anon.LastTangent
import typings.cesium.anon.Points
import typings.cesium.anon.Times
import typings.cesium.mod.HermiteSpline
import typings.cesium.mod.LinearSpline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreHermiteSplineMod {
  
  @JSImport("cesium/Source/Core/HermiteSpline", JSImport.Default)
  @js.native
  open class default protected () extends HermiteSpline {
    def this(options: InTangents) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/HermiteSpline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a spline where the tangents at each control point are the same.
      * The curves are guaranteed to be at least in the class C<sup>1</sup>.
      * @example
      * const points = [
      *     new Cesium.Cartesian3(1235398.0, -4810983.0, 4146266.0),
      *     new Cesium.Cartesian3(1372574.0, -5345182.0, 4606657.0),
      *     new Cesium.Cartesian3(-757983.0, -5542796.0, 4514323.0),
      *     new Cesium.Cartesian3(-2821260.0, -5248423.0, 4021290.0),
      *     new Cesium.Cartesian3(-2539788.0, -4724797.0, 3620093.0)
      * ];
      *
      * // Add tangents
      * const tangents = new Array(points.length);
      * tangents[0] = new Cesium.Cartesian3(1125196, -161816, 270551);
      * const temp = new Cesium.Cartesian3();
      * for (let i = 1; i < tangents.length - 1; ++i) {
      *     tangents[i] = Cesium.Cartesian3.multiplyByScalar(Cesium.Cartesian3.subtract(points[i + 1], points[i - 1], temp), 0.5, new Cesium.Cartesian3());
      * }
      * tangents[tangents.length - 1] = new Cesium.Cartesian3(1165345, 112641, 47281);
      *
      * const spline = Cesium.HermiteSpline.createC1({
      *     times : times,
      *     points : points,
      *     tangents : tangents
      * });
      * @param options - Object with the following properties:
      * @param options.times - The array of control point times.
      * @param options.points - The array of control points.
      * @param options.tangents - The array of tangents at the control points.
      * @returns A hermite spline.
      */
    inline def createC1(options: Points): HermiteSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createC1")(options.asInstanceOf[js.Any]).asInstanceOf[HermiteSpline]
    
    /**
      * Creates a clamped cubic spline. The tangents at the interior control points are generated
      * to create a curve in the class C<sup>2</sup>.
      * @example
      * // Create a clamped cubic spline above the earth from Philadelphia to Los Angeles.
      * const spline = Cesium.HermiteSpline.createClampedCubic({
      *     times : [ 0.0, 1.5, 3.0, 4.5, 6.0 ],
      *     points : [
      *         new Cesium.Cartesian3(1235398.0, -4810983.0, 4146266.0),
      *         new Cesium.Cartesian3(1372574.0, -5345182.0, 4606657.0),
      *         new Cesium.Cartesian3(-757983.0, -5542796.0, 4514323.0),
      *         new Cesium.Cartesian3(-2821260.0, -5248423.0, 4021290.0),
      *         new Cesium.Cartesian3(-2539788.0, -4724797.0, 3620093.0)
      *     ],
      *     firstTangent : new Cesium.Cartesian3(1125196, -161816, 270551),
      *     lastTangent : new Cesium.Cartesian3(1165345, 112641, 47281)
      * });
      * @param options - Object with the following properties:
      * @param options.times - The array of control point times.
      * @param options.points - The array of control points.
      * @param options.firstTangent - The outgoing tangent of the first control point.
      * @param options.lastTangent - The incoming tangent of the last control point.
      * @returns A hermite spline, or a linear spline if less than 3 control points were given.
      */
    inline def createClampedCubic(options: LastTangent): HermiteSpline | LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createClampedCubic")(options.asInstanceOf[js.Any]).asInstanceOf[HermiteSpline | LinearSpline]
    
    /**
      * Creates a natural cubic spline. The tangents at the control points are generated
      * to create a curve in the class C<sup>2</sup>.
      * @example
      * // Create a natural cubic spline above the earth from Philadelphia to Los Angeles.
      * const spline = Cesium.HermiteSpline.createNaturalCubic({
      *     times : [ 0.0, 1.5, 3.0, 4.5, 6.0 ],
      *     points : [
      *         new Cesium.Cartesian3(1235398.0, -4810983.0, 4146266.0),
      *         new Cesium.Cartesian3(1372574.0, -5345182.0, 4606657.0),
      *         new Cesium.Cartesian3(-757983.0, -5542796.0, 4514323.0),
      *         new Cesium.Cartesian3(-2821260.0, -5248423.0, 4021290.0),
      *         new Cesium.Cartesian3(-2539788.0, -4724797.0, 3620093.0)
      *     ]
      * });
      * @param options - Object with the following properties:
      * @param options.times - The array of control point times.
      * @param options.points - The array of control points.
      * @returns A hermite spline, or a linear spline if less than 3 control points were given.
      */
    inline def createNaturalCubic(options: Times): HermiteSpline | LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createNaturalCubic")(options.asInstanceOf[js.Any]).asInstanceOf[HermiteSpline | LinearSpline]
  }
}
