package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.EdgeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ClippingPlaneCollection")
@js.native
open class ClippingPlaneCollection () extends StObject {
  def this(options: EdgeColor) = this()
  
  /**
    * Adds the specified {@link ClippingPlane} to the collection to be used to selectively disable rendering
    * on the outside of each plane. Use {@link ClippingPlaneCollection#unionClippingRegions} to modify
    * how modify the clipping behavior of multiple planes.
    * @param plane - The ClippingPlane to add to the collection.
    */
  def add(plane: ClippingPlane): Unit = js.native
  
  /**
    * Checks whether this collection contains a ClippingPlane equal to the given ClippingPlane.
    * @param [clippingPlane] - The ClippingPlane to check for.
    * @returns true if this collection contains the ClippingPlane, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(clippingPlane: ClippingPlane): Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * clippingPlanes = clippingPlanes && clippingPlanes.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * The color applied to highlight the edge along which an object is clipped.
    */
  var edgeColor: Color = js.native
  
  /**
    * The width, in pixels, of the highlight applied to the edge along which an object is clipped.
    */
  var edgeWidth: Double = js.native
  
  /**
    * If true, clipping will be enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Returns the plane in the collection at the specified index.  Indices are zero-based
    * and increase as planes are added.  Removing a plane shifts all planes after
    * it to the left, changing their indices.  This function is commonly used with
    * {@link ClippingPlaneCollection#length} to iterate over all the planes
    * in the collection.
    * @param index - The zero-based index of the plane.
    * @returns The ClippingPlane at the specified index.
    */
  def get(index: Double): ClippingPlane = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of planes in this collection.  This is commonly used with
    * {@link ClippingPlaneCollection#get} to iterate over all the planes
    * in the collection.
    */
  val length: Double = js.native
  
  /**
    * The 4x4 transformation matrix specifying an additional transform relative to the clipping planes
    * original coordinate system.
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * An event triggered when a new clipping plane is added to the collection.  Event handlers
    * are passed the new plane and the index at which it was added.
    */
  var planeAdded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event triggered when a new clipping plane is removed from the collection.  Event handlers
    * are passed the new plane and the index from which it was removed.
    */
  var planeRemoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Removes the first occurrence of the given ClippingPlane from the collection.
    * @returns <code>true</code> if the plane was removed; <code>false</code> if the plane was not found in the collection.
    */
  def remove(clippingPlane: ClippingPlane): Boolean = js.native
  
  /**
    * Removes all planes from the collection.
    */
  def removeAll(): Unit = js.native
  
  /**
    * If true, a region will be clipped if it is on the outside of any plane in the
    * collection. Otherwise, a region will only be clipped if it is on the
    * outside of every plane.
    */
  var unionClippingRegions: Boolean = js.native
  
  /**
    * Called when {@link Viewer} or {@link CesiumWidget} render the scene to
    * build the resources for clipping planes.
    * <p>
    * Do not call this function directly.
    * </p>
    */
  def update(): Unit = js.native
}
