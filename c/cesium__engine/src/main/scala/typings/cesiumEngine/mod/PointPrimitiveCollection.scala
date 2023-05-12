package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.DebugShowBoundingVolume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PointPrimitiveCollection")
@js.native
open class PointPrimitiveCollection () extends StObject {
  def this(options: DebugShowBoundingVolume) = this()
  
  /**
    * Creates and adds a point with the specified initial properties to the collection.
    * The added point is returned so it can be modified or removed from the collection later.
    * @example
    * // Example 1:  Add a point, specifying all the default values.
    * const p = pointPrimitives.add({
    *   show : true,
    *   position : Cesium.Cartesian3.ZERO,
    *   pixelSize : 10.0,
    *   color : Cesium.Color.WHITE,
    *   outlineColor : Cesium.Color.TRANSPARENT,
    *   outlineWidth : 0.0,
    *   id : undefined
    * });
    * @example
    * // Example 2:  Specify only the point's cartographic position.
    * const p = pointPrimitives.add({
    *   position : Cesium.Cartesian3.fromDegrees(longitude, latitude, height)
    * });
    * @param [options] - A template describing the point's properties as shown in Example 1.
    * @returns The point that was added to the collection.
    */
  def add(): PointPrimitive = js.native
  def add(options: Any): PointPrimitive = js.native
  
  /**
    * The point blending option. The default is used for rendering both opaque and translucent points.
    * However, if either all of the points are completely opaque or all are completely translucent,
    * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
    * performance by up to 2x.
    */
  var blendOption: BlendOption = js.native
  
  /**
    * Check whether this collection contains a given point.
    * @param [pointPrimitive] - The point to check for.
    * @returns true if this collection contains the point, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(pointPrimitive: PointPrimitive): Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the primitive.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * pointPrimitives = pointPrimitives && pointPrimitives.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the point in the collection at the specified index.  Indices are zero-based
    * and increase as points are added.  Removing a point shifts all points after
    * it to the left, changing their indices.  This function is commonly used with
    * {@link PointPrimitiveCollection#length} to iterate over all the points
    * in the collection.
    * @example
    * // Toggle the show property of every point in the collection
    * const len = pointPrimitives.length;
    * for (let i = 0; i < len; ++i) {
    *   const p = pointPrimitives.get(i);
    *   p.show = !p.show;
    * }
    * @param index - The zero-based index of the point.
    * @returns The point at the specified index.
    */
  def get(index: Double): PointPrimitive = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of points in this collection.  This is commonly used with
    * {@link PointPrimitiveCollection#get} to iterate over all the points
    * in the collection.
    */
  var length: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms each point in this collection from model to world coordinates.
    * When this is the identity matrix, the pointPrimitives are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    * @example
    * const center = Cesium.Cartesian3.fromDegrees(-75.59777, 40.03883);
    * pointPrimitives.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(center);
    * pointPrimitives.add({
    *   color : Cesium.Color.ORANGE,
    *   position : new Cesium.Cartesian3(0.0, 0.0, 0.0) // center
    * });
    * pointPrimitives.add({
    *   color : Cesium.Color.YELLOW,
    *   position : new Cesium.Cartesian3(1000000.0, 0.0, 0.0) // east
    * });
    * pointPrimitives.add({
    *   color : Cesium.Color.GREEN,
    *   position : new Cesium.Cartesian3(0.0, 1000000.0, 0.0) // north
    * });
    * pointPrimitives.add({
    *   color : Cesium.Color.CYAN,
    *   position : new Cesium.Cartesian3(0.0, 0.0, 1000000.0) // up
    * });
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Removes a point from the collection.
    * @example
    * const p = pointPrimitives.add(...);
    * pointPrimitives.remove(p);  // Returns true
    * @param pointPrimitive - The point to remove.
    * @returns <code>true</code> if the point was removed; <code>false</code> if the point was not found in the collection.
    */
  def remove(pointPrimitive: PointPrimitive): Boolean = js.native
  
  /**
    * Removes all points from the collection.
    * @example
    * pointPrimitives.add(...);
    * pointPrimitives.add(...);
    * pointPrimitives.removeAll();
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if primitives in this collection will be shown.
    */
  var show: Boolean = js.native
}
