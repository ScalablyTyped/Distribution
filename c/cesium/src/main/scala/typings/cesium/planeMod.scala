package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Cartesian4
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Plane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planeMod {
  
  @JSImport("cesium/Source/Core/Plane", JSImport.Default)
  @js.native
  open class default protected () extends Plane {
    def this(normal: Cartesian3, distance: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Plane", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A constant initialized to the XY plane passing through the origin, with normal in positive Z.
      */
    @JSImport("cesium/Source/Core/Plane", "default.ORIGIN_XY_PLANE")
    @js.native
    val ORIGIN_XY_PLANE: Plane = js.native
    
    /**
      * A constant initialized to the YZ plane passing through the origin, with normal in positive X.
      */
    @JSImport("cesium/Source/Core/Plane", "default.ORIGIN_YZ_PLANE")
    @js.native
    val ORIGIN_YZ_PLANE: Plane = js.native
    
    /**
      * A constant initialized to the ZX plane passing through the origin, with normal in positive Y.
      */
    @JSImport("cesium/Source/Core/Plane", "default.ORIGIN_ZX_PLANE")
    @js.native
    val ORIGIN_ZX_PLANE: Plane = js.native
    
    /**
      * Duplicates a Plane instance.
      * @param plane - The plane to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new Plane instance if one was not provided.
      */
    inline def clone(plane: Plane): Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(plane.asInstanceOf[js.Any]).asInstanceOf[Plane]
    inline def clone(plane: Plane, result: Plane): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Plane]
    
    /**
      * Compares the provided Planes by normal and distance and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param left - The first plane.
      * @param right - The second plane.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(left: Plane, right: Plane): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates a plane from the general equation
      * @param coefficients - The plane's normal (normalized).
      * @param [result] - The object onto which to store the result.
      * @returns A new plane instance or the modified result parameter.
      */
    inline def fromCartesian4(coefficients: Cartesian4): Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(coefficients.asInstanceOf[js.Any]).asInstanceOf[Plane]
    inline def fromCartesian4(coefficients: Cartesian4, result: Plane): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(coefficients.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Plane]
    
    /**
      * Creates a plane from a normal and a point on the plane.
      * @example
      * const point = Cesium.Cartesian3.fromDegrees(-72.0, 40.0);
      * const normal = ellipsoid.geodeticSurfaceNormal(point);
      * const tangentPlane = Cesium.Plane.fromPointNormal(point, normal);
      * @param point - The point on the plane.
      * @param normal - The plane's normal (normalized).
      * @param [result] - The object onto which to store the result.
      * @returns A new plane instance or the modified result parameter.
      */
    inline def fromPointNormal(point: Cartesian3, normal: Cartesian3): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Plane]
    inline def fromPointNormal(point: Cartesian3, normal: Cartesian3, result: Plane): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Plane]
    
    /**
      * Computes the signed shortest distance of a point to a plane.
      * The sign of the distance determines which side of the plane the point
      * is on.  If the distance is positive, the point is in the half-space
      * in the direction of the normal; if negative, the point is in the half-space
      * opposite to the normal; if zero, the plane passes through the point.
      * @param plane - The plane.
      * @param point - The point.
      * @returns The signed shortest distance of the point to the plane.
      */
    inline def getPointDistance(plane: Plane, point: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointDistance")(plane.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Projects a point onto the plane.
      * @param plane - The plane to project the point onto
      * @param point - The point to project onto the plane
      * @param [result] - The result point.  If undefined, a new Cartesian3 will be created.
      * @returns The modified result parameter or a new Cartesian3 instance if one was not provided.
      */
    inline def projectPointOntoPlane(plane: Plane, point: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPointOntoPlane")(plane.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    inline def projectPointOntoPlane(plane: Plane, point: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projectPointOntoPlane")(plane.asInstanceOf[js.Any], point.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Transforms the plane by the given transformation matrix.
      * @param plane - The plane.
      * @param transform - The transformation matrix.
      * @param [result] - The object into which to store the result.
      * @returns The plane transformed by the given transformation matrix.
      */
    inline def transform(plane: Plane, transform: Matrix4): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(plane.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Plane]
    inline def transform(plane: Plane, transform: Matrix4, result: Plane): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(plane.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Plane]
  }
}
