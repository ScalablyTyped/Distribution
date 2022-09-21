package typings.cesium

import typings.cesium.mod.AxisAlignedBoundingBox
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Intersect
import typings.cesium.mod.Plane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisAlignedBoundingBoxMod {
  
  @JSImport("cesium/Source/Core/AxisAlignedBoundingBox", JSImport.Default)
  @js.native
  open class default () extends AxisAlignedBoundingBox {
    def this(minimum: Cartesian3) = this()
    def this(minimum: Unit, maximum: Cartesian3) = this()
    def this(minimum: Cartesian3, maximum: Cartesian3) = this()
    def this(minimum: Unit, maximum: Unit, center: Cartesian3) = this()
    def this(minimum: Unit, maximum: Cartesian3, center: Cartesian3) = this()
    def this(minimum: Cartesian3, maximum: Unit, center: Cartesian3) = this()
    def this(minimum: Cartesian3, maximum: Cartesian3, center: Cartesian3) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/AxisAlignedBoundingBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Duplicates a AxisAlignedBoundingBox instance.
      * @param box - The bounding box to duplicate.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new AxisAlignedBoundingBox instance if none was provided. (Returns undefined if box is undefined)
      */
    inline def clone(box: AxisAlignedBoundingBox): AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any]).asInstanceOf[AxisAlignedBoundingBox]
    inline def clone(box: AxisAlignedBoundingBox, result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(box.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
    
    /**
      * Compares the provided AxisAlignedBoundingBox componentwise and returns
      * <code>true</code> if they are equal, <code>false</code> otherwise.
      * @param [left] - The first AxisAlignedBoundingBox.
      * @param [right] - The second AxisAlignedBoundingBox.
      * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
      */
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(left: Unit, right: AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(left: AxisAlignedBoundingBox): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(left: AxisAlignedBoundingBox, right: AxisAlignedBoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Creates an instance of an AxisAlignedBoundingBox from its corners.
      * @example
      * // Compute an axis aligned bounding box from the two corners.
      * const box = Cesium.AxisAlignedBoundingBox.fromCorners(new Cesium.Cartesian3(-1, -1, -1), new Cesium.Cartesian3(1, 1, 1));
      * @param minimum - The minimum point along the x, y, and z axes.
      * @param maximum - The maximum point along the x, y, and z axes.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new AxisAlignedBoundingBox instance if one was not provided.
      */
    inline def fromCorners(minimum: Cartesian3, maximum: Cartesian3): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCorners")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
    inline def fromCorners(minimum: Cartesian3, maximum: Cartesian3, result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCorners")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
    
    /**
      * Computes an instance of an AxisAlignedBoundingBox. The box is determined by
      * finding the points spaced the farthest apart on the x, y, and z axes.
      * @example
      * // Compute an axis aligned bounding box enclosing two points.
      * const box = Cesium.AxisAlignedBoundingBox.fromPoints([new Cesium.Cartesian3(2, 0, 0), new Cesium.Cartesian3(-2, 0, 0)]);
      * @param positions - List of points that the bounding box will enclose.  Each point must have a <code>x</code>, <code>y</code>, and <code>z</code> properties.
      * @param [result] - The object onto which to store the result.
      * @returns The modified result parameter or a new AxisAlignedBoundingBox instance if one was not provided.
      */
    inline def fromPoints(positions: js.Array[Cartesian3]): AxisAlignedBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any]).asInstanceOf[AxisAlignedBoundingBox]
    inline def fromPoints(positions: js.Array[Cartesian3], result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(positions.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[AxisAlignedBoundingBox]
    
    /**
      * Determines which side of a plane a box is located.
      * @param box - The bounding box to test.
      * @param plane - The plane to test against.
      * @returns {@link Intersect.INSIDE} if the entire box is on the side of the plane
      *                      the normal is pointing, {@link Intersect.OUTSIDE} if the entire box is
      *                      on the opposite side, and {@link Intersect.INTERSECTING} if the box
      *                      intersects the plane.
      */
    inline def intersectPlane(box: AxisAlignedBoundingBox, plane: Plane): Intersect = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectPlane")(box.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Intersect]
  }
}
