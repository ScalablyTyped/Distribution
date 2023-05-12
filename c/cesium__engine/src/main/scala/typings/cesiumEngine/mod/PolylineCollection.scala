package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.ModelMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolylineCollection")
@js.native
open class PolylineCollection () extends StObject {
  def this(options: ModelMatrix) = this()
  
  /**
    * Creates and adds a polyline with the specified initial properties to the collection.
    * The added polyline is returned so it can be modified or removed from the collection later.
    * @example
    * // Example 1:  Add a polyline, specifying all the default values.
    * const p = polylines.add({
    *   show : true,
    *   positions : ellipsoid.cartographicArrayToCartesianArray([
    *            Cesium.Cartographic.fromDegrees(-75.10, 39.57),
    *            Cesium.Cartographic.fromDegrees(-77.02, 38.53)]),
    *   width : 1
    * });
    * @param [options] - A template describing the polyline's properties as shown in Example 1.
    * @returns The polyline that was added to the collection.
    */
  def add(): Polyline = js.native
  def add(options: Any): Polyline = js.native
  
  /**
    * Determines if this collection contains the specified polyline.
    * @param polyline - The polyline to check for.
    * @returns true if this collection contains the polyline, false otherwise.
    */
  def contains(polyline: Polyline): Boolean = js.native
  
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
    * polylines = polylines && polylines.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the polyline in the collection at the specified index.  Indices are zero-based
    * and increase as polylines are added.  Removing a polyline shifts all polylines after
    * it to the left, changing their indices.  This function is commonly used with
    * {@link PolylineCollection#length} to iterate over all the polylines
    * in the collection.
    * @example
    * // Toggle the show property of every polyline in the collection
    * const len = polylines.length;
    * for (let i = 0; i < len; ++i) {
    *   const p = polylines.get(i);
    *   p.show = !p.show;
    * }
    * @param index - The zero-based index of the polyline.
    * @returns The polyline at the specified index.
    */
  def get(index: Double): Polyline = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of polylines in this collection.  This is commonly used with
    * {@link PolylineCollection#get} to iterate over all the polylines
    * in the collection.
    */
  var length: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms each polyline in this collection from model to world coordinates.
    * When this is the identity matrix, the polylines are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Removes a polyline from the collection.
    * @example
    * const p = polylines.add(...);
    * polylines.remove(p);  // Returns true
    * @param polyline - The polyline to remove.
    * @returns <code>true</code> if the polyline was removed; <code>false</code> if the polyline was not found in the collection.
    */
  def remove(polyline: Polyline): Boolean = js.native
  
  /**
    * Removes all polylines from the collection.
    * @example
    * polylines.add(...);
    * polylines.add(...);
    * polylines.removeAll();
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if polylines in this collection will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * Called when {@link Viewer} or {@link CesiumWidget} render the scene to
    * get the draw commands needed to render this primitive.
    * <p>
    * Do not call this function directly.  This is documented just to
    * list the exceptions that may be propagated when the scene is rendered:
    * </p>
    */
  def update(): Unit = js.native
}
