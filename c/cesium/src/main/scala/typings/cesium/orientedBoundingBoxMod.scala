package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Intersect
import typings.cesium.mod.Interval
import typings.cesium.mod.Matrix3
import typings.cesium.mod.Matrix4
import typings.cesium.mod.Occluder
import typings.cesium.mod.OrientedBoundingBox
import typings.cesium.mod.Plane
import typings.cesium.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientedBoundingBoxMod {
  
  @JSImport("cesium/Source/Core/OrientedBoundingBox", JSImport.Default)
  @js.native
  open class default () extends OrientedBoundingBox {
    def this(center: Cartesian3) = this()
    def this(center: Unit, halfAxes: Matrix3) = this()
    def this(center: Cartesian3, halfAxes: Matrix3) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/OrientedBoundingBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Duplicates a OrientedBoundingBox instance.
      * @param box - The bounding box to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new OrientedBoundingBox instance if none was provided. (Returns undefined if box is undefined)
      */
    inline def clone(box: OrientedBoundingBox): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[OrientedBoundingBox]
    inline def clone(box: OrientedBoundingBox, result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    
    /**
      * Computes the eight corners of an oriented bounding box. The corners are ordered by (-X, -Y, -Z), (-X, -Y, +Z), (-X, +Y, -Z), (-X, +Y, +Z), (+X, -Y, -Z), (+X, -Y, +Z), (+X, +Y, -Z), (+X, +Y, +Z).
      * @param box - The oriented bounding box.
      * @param [result] - An array of eight {@link Cartesian3} instances onto which to store the corners.
      * @returns The modified result parameter or a new array if none was provided.
      */
    inline def computeCorners(box: OrientedBoundingBox): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCorners")(box.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
    inline def computeCorners(box: OrientedBoundingBox, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCorners")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
    
    /**
      * The distances calculated by the vector from the center of the bounding box to position projected onto direction.
      * <br>
      * If you imagine the infinite number of planes with normal direction, this computes the smallest distance to the
      * closest and farthest planes from position that intersect the bounding box.
      * @param box - The bounding box to calculate the distance to.
      * @param position - The position to calculate the distance from.
      * @param direction - The direction from position.
      * @param [result] - A Interval to store the nearest and farthest distances.
      * @returns The nearest and farthest distances on the bounding box from position in direction.
      */
    inline def computePlaneDistances(box: OrientedBoundingBox, position: Cartesian3, direction: Cartesian3): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(box.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Interval]
    inline def computePlaneDistances(box: OrientedBoundingBox, position: Cartesian3, direction: Cartesian3, result: Interval): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("computePlaneDistances")(box.asInstanceOf[js.Any], position.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Interval]
    
    /**
      * Computes a transformation matrix from an oriented bounding box.
      * @param box - The oriented bounding box.
      * @param result - The object onto which to store the result.
      * @returns The modified result parameter or a new {@link Matrix4} instance if none was provided.
      */
    inline def computeTransformation(box: OrientedBoundingBox, result: Matrix4): Matrix4 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTransformation")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Matrix4]
    
    /**
      * Computes the estimated distance squared from the closest point on a bounding box to a point.
      * @example
      * // Sort bounding boxes from back to front
      * boxes.sort(function(a, b) {
      *     return Cesium.OrientedBoundingBox.distanceSquaredTo(b, camera.positionWC) - Cesium.OrientedBoundingBox.distanceSquaredTo(a, camera.positionWC);
      * });
      * @param box - The box.
      * @param cartesian - The point
      * @returns The distance squared from the oriented bounding box to the point. Returns 0 if the point is inside the box.
      */
    inline def distanceSquaredTo(box: OrientedBoundingBox, cartesian: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredTo")(box.asInstanceOf[js.Any], cartesian.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Compares the provided OrientedBoundingBox componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param left - The first OrientedBoundingBox.
      * @param right - The second OrientedBoundingBox.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(left: OrientedBoundingBox, right: OrientedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Computes an instance of an OrientedBoundingBox of the given positions.
      * This is an implementation of Stefan Gottschalk's Collision Queries using Oriented Bounding Boxes solution (PHD thesis).
      * Reference: http://gamma.cs.unc.edu/users/gottschalk/main.pdf
      * @example
      * // Compute an object oriented bounding box enclosing two points.
      * const box = Cesium.OrientedBoundingBox.fromPoints([new Cesium.Cartesian3(2, 0, 0), new Cesium.Cartesian3(-2, 0, 0)]);
      * @param [positions] - List of {@link Cartesian3} points that the bounding box will enclose.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new OrientedBoundingBox instance if one was not provided.
      */
    inline def fromPoints(): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")().asInstanceOf[OrientedBoundingBox]
    inline def fromPoints(positions: js.Array[Cartesian3]): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[OrientedBoundingBox]
    inline def fromPoints(positions: js.Array[Cartesian3], result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromPoints(positions: Unit, result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    
    /**
      * Computes an OrientedBoundingBox that bounds a {@link Rectangle} on the surface of an {@link Ellipsoid}.
      * There are no guarantees about the orientation of the bounding box.
      * @param rectangle - The cartographic rectangle on the surface of the ellipsoid.
      * @param [minimumHeight = 0.0] - The minimum height (elevation) within the tile.
      * @param [maximumHeight = 0.0] - The maximum height (elevation) within the tile.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the rectangle is defined.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new OrientedBoundingBox instance if none was provided.
      */
    inline def fromRectangle(rectangle: Rectangle): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Double): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Double, maximumHeight: Double): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Double,
      maximumHeight: Double,
      ellipsoid: Unit,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Double, maximumHeight: Double, ellipsoid: Ellipsoid): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Double,
      maximumHeight: Double,
      ellipsoid: Ellipsoid,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Double,
      maximumHeight: Unit,
      ellipsoid: Unit,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Double, maximumHeight: Unit, ellipsoid: Ellipsoid): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Double,
      maximumHeight: Unit,
      ellipsoid: Ellipsoid,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Unit, maximumHeight: Double): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Unit,
      maximumHeight: Double,
      ellipsoid: Unit,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Unit, maximumHeight: Double, ellipsoid: Ellipsoid): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Unit,
      maximumHeight: Double,
      ellipsoid: Ellipsoid,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Unit,
      maximumHeight: Unit,
      ellipsoid: Unit,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(rectangle: Rectangle, minimumHeight: Unit, maximumHeight: Unit, ellipsoid: Ellipsoid): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def fromRectangle(
      rectangle: Rectangle,
      minimumHeight: Unit,
      maximumHeight: Unit,
      ellipsoid: Ellipsoid,
      result: OrientedBoundingBox
    ): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRectangle")(rectangle.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    
    /**
      * Computes an OrientedBoundingBox that bounds an affine transformation.
      * @param transformation - The affine transformation.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new OrientedBoundingBox instance if none was provided.
      */
    inline def fromTransformation(transformation: Matrix4): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformation")(transformation.asInstanceOf[js.Any]).asInstanceOf[OrientedBoundingBox]
    inline def fromTransformation(transformation: Matrix4, result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTransformation")(transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    
    /**
      * Determines which side of a plane the oriented bounding box is located.
      * @param box - The oriented bounding box to test.
      * @param plane - The plane to test against.
      * @returns {@link Intersect.INSIDE} if the entire box is on the side of the plane
      *                      the normal is pointing, {@link Intersect.OUTSIDE} if the entire box is
      *                      on the opposite side, and {@link Intersect.INTERSECTING} if the box
      *                      intersects the plane.
      */
    inline def intersectPlane(box: OrientedBoundingBox, plane: Plane): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPlane")(box.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Intersect]
    
    /**
      * Determines whether or not a bounding box is hidden from view by the occluder.
      * @param box - The bounding box surrounding the occludee object.
      * @param occluder - The occluder.
      * @returns <code>true</code> if the box is not visible; otherwise <code>false</code>.
      */
    inline def isOccluded(box: OrientedBoundingBox, occluder: Occluder): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOccluded")(box.asInstanceOf[js.Any], occluder.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Stores the provided instance into the provided array.
      * @param value - The value to pack.
      * @param array - The array to pack into.
      * @param [startingIndex = 0] - The index into the array at which to start packing the elements.
      * @returns The array that was packed into
      */
    inline def pack(value: OrientedBoundingBox, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def pack(value: OrientedBoundingBox, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    /**
      * The number of elements used to pack the object into an array.
      */
    @JSImport("cesium/Source/Core/OrientedBoundingBox", "default.packedLength")
    @js.native
    def packedLength: Double = js.native
    inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an instance from a packed array.
      * @param array - The packed array.
      * @param [startingIndex = 0] - The starting index of the element to be unpacked.
      * @param [result] - The object into which to store the result.
      * @returns The modified result parameter or a new OrientedBoundingBox instance if one was not provided.
      */
    inline def unpack(array: js.Array[Double]): OrientedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[OrientedBoundingBox]
    inline def unpack(array: js.Array[Double], startingIndex: Double): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def unpack(array: js.Array[Double], startingIndex: Double, result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
    inline def unpack(array: js.Array[Double], startingIndex: Unit, result: OrientedBoundingBox): OrientedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[OrientedBoundingBox]
  }
}
