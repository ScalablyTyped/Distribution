package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BillboardCollection")
@js.native
open class BillboardCollection () extends StObject {
  def this(options: typings.cesium.anon.BlendOption) = this()
  
  /**
    * Creates and adds a billboard with the specified initial properties to the collection.
    * The added billboard is returned so it can be modified or removed from the collection later.
    * @example
    * // Example 1:  Add a billboard, specifying all the default values.
    * const b = billboards.add({
    *   show : true,
    *   position : Cesium.Cartesian3.ZERO,
    *   pixelOffset : Cesium.Cartesian2.ZERO,
    *   eyeOffset : Cesium.Cartesian3.ZERO,
    *   heightReference : Cesium.HeightReference.NONE,
    *   horizontalOrigin : Cesium.HorizontalOrigin.CENTER,
    *   verticalOrigin : Cesium.VerticalOrigin.CENTER,
    *   scale : 1.0,
    *   image : 'url/to/image',
    *   imageSubRegion : undefined,
    *   color : Cesium.Color.WHITE,
    *   id : undefined,
    *   rotation : 0.0,
    *   alignedAxis : Cesium.Cartesian3.ZERO,
    *   width : undefined,
    *   height : undefined,
    *   scaleByDistance : undefined,
    *   translucencyByDistance : undefined,
    *   pixelOffsetScaleByDistance : undefined,
    *   sizeInMeters : false,
    *   distanceDisplayCondition : undefined
    * });
    * @example
    * // Example 2:  Specify only the billboard's cartographic position.
    * const b = billboards.add({
    *   position : Cesium.Cartesian3.fromDegrees(longitude, latitude, height)
    * });
    * @param [options] - A template describing the billboard's properties as shown in Example 1.
    * @returns The billboard that was added to the collection.
    */
  def add(): Billboard = js.native
  def add(options: Any): Billboard = js.native
  
  /**
    * The billboard blending option. The default is used for rendering both opaque and translucent billboards.
    * However, if either all of the billboards are completely opaque or all are completely translucent,
    * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
    * performance by up to 2x.
    */
  var blendOption: BlendOption = js.native
  
  /**
    * Check whether this collection contains a given billboard.
    * @param [billboard] - The billboard to check for.
    * @returns true if this collection contains the billboard, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(billboard: Billboard): Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the primitive.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the texture atlas for this BillboardCollection as a fullscreen quad.
    * </p>
    */
  var debugShowTextureAtlas: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * billboards = billboards && billboards.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the billboard in the collection at the specified index.  Indices are zero-based
    * and increase as billboards are added.  Removing a billboard shifts all billboards after
    * it to the left, changing their indices.  This function is commonly used with
    * {@link BillboardCollection#length} to iterate over all the billboards
    * in the collection.
    * @example
    * // Toggle the show property of every billboard in the collection
    * const len = billboards.length;
    * for (let i = 0; i < len; ++i) {
    *   const b = billboards.get(i);
    *   b.show = !b.show;
    * }
    * @param index - The zero-based index of the billboard.
    * @returns The billboard at the specified index.
    */
  def get(index: Double): Billboard = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of billboards in this collection.  This is commonly used with
    * {@link BillboardCollection#get} to iterate over all the billboards
    * in the collection.
    */
  var length: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms each billboard in this collection from model to world coordinates.
    * When this is the identity matrix, the billboards are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    * @example
    * const center = Cesium.Cartesian3.fromDegrees(-75.59777, 40.03883);
    * billboards.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(center);
    * billboards.add({
    *   image : 'url/to/image',
    *   position : new Cesium.Cartesian3(0.0, 0.0, 0.0) // center
    * });
    * billboards.add({
    *   image : 'url/to/image',
    *   position : new Cesium.Cartesian3(1000000.0, 0.0, 0.0) // east
    * });
    * billboards.add({
    *   image : 'url/to/image',
    *   position : new Cesium.Cartesian3(0.0, 1000000.0, 0.0) // north
    * });
    * billboards.add({
    *   image : 'url/to/image',
    *   position : new Cesium.Cartesian3(0.0, 0.0, 1000000.0) // up
    * });
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Removes a billboard from the collection.
    * @example
    * const b = billboards.add(...);
    * billboards.remove(b);  // Returns true
    * @param billboard - The billboard to remove.
    * @returns <code>true</code> if the billboard was removed; <code>false</code> if the billboard was not found in the collection.
    */
  def remove(billboard: Billboard): Boolean = js.native
  
  /**
    * Removes all billboards from the collection.
    * @example
    * billboards.add(...);
    * billboards.add(...);
    * billboards.removeAll();
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if billboards in this collection will be shown.
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
