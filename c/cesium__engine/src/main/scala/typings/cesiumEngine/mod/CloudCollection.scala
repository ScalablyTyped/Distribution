package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.DebugBillboards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CloudCollection")
@js.native
open class CloudCollection () extends StObject {
  def this(options: DebugBillboards) = this()
  
  /**
    * Creates and adds a cloud with the specified initial properties to the collection.
    * The added cloud is returned so it can be modified or removed from the collection later.
    * @example
    * // Example 1:  Add a cumulus cloud, specifying all the default values.
    * const c = clouds.add({
    *   show : true,
    *   position : Cesium.Cartesian3.ZERO,
    *   scale : new Cesium.Cartesian2(20.0, 12.0),
    *   maximumSize: new Cesium.Cartesian3(20.0, 12.0, 12.0),
    *   slice: -1.0,
    *   cloudType : CloudType.CUMULUS
    * });
    * @example
    * // Example 2:  Specify only the cloud's cartographic position.
    * const c = clouds.add({
    *   position : Cesium.Cartesian3.fromDegrees(longitude, latitude, height)
    * });
    * @param [options] - A template describing the cloud's properties as shown in Example 1.
    * @returns The cloud that was added to the collection.
    */
  def add(): CumulusCloud = js.native
  def add(options: Any): CumulusCloud = js.native
  
  /**
    * Check whether this collection contains a given cloud.
    * @param [cloud] - The cloud to check for.
    * @returns true if this collection contains the cloud, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(cloud: CumulusCloud): Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Renders the billboards with one opaque color for the sake of debugging.
    * </p>
    */
  var debugBillboards: Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the clouds as opaque, monochrome ellipsoids for the sake of debugging.
    * If <code>debugBillboards</code> is also true, then the ellipsoids will draw on top of the billboards.
    * </p>
    */
  var debugEllipsoids: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * clouds = clouds && clouds.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the cloud in the collection at the specified index. Indices are zero-based
    * and increase as clouds are added. Removing a cloud shifts all clouds after
    * it to the left, changing their indices. This function is commonly used with
    * {@link CloudCollection#length} to iterate over all the clouds in the collection.
    * @example
    * // Toggle the show property of every cloud in the collection
    * const len = clouds.length;
    * for (let i = 0; i < len; ++i) {
    *   const c = clouds.get(i);
    *   c.show = !c.show;
    * }
    * @param index - The zero-based index of the cloud.
    * @returns The cloud at the specified index.
    */
  def get(index: Double): CumulusCloud = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of clouds in this collection.
    */
  var length: Double = js.native
  
  /**
    * <p>
    * Controls the amount of detail captured in the precomputed noise texture
    * used to render the cumulus clouds. In order for the texture to be tileable,
    * this must be a power of two. For best results, set this to be a power of two
    * between <code>8.0</code> and <code>32.0</code> (inclusive).
    * </p>
    *
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'>
    *   <code>clouds.noiseDetail = 8.0;</code><br/>
    *   <img src='Images/CloudCollection.noiseDetail8.png' width='250' height='158' />
    * </td>
    * <td align='center'>
    *   <code>clouds.noiseDetail = 32.0;</code><br/>
    *   <img src='Images/CloudCollection.noiseDetail32.png' width='250' height='158' />
    * </td>
    * </tr></table>
    * </div>
    */
  var noiseDetail: Double = js.native
  
  /**
    * <p>
    * Applies a translation to noise texture coordinates to generate different data.
    * This can be modified if the default noise does not generate good-looking clouds.
    * </p>
    *
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'>
    *   <code>default</code><br/>
    *   <img src='Images/CloudCollection.noiseOffsetdefault.png' width='250' height='158' />
    * </td>
    * <td align='center'>
    *   <code>clouds.noiseOffset = new Cesium.Cartesian3(10, 20, 10);</code><br/>
    *   <img src='Images/CloudCollection.noiseOffsetx10y20z10.png' width='250' height='158' />
    * </td>
    * </tr></table>
    * </div>
    */
  var noiseOffset: Cartesian3 = js.native
  
  /**
    * Removes a cloud from the collection.
    * @example
    * const c = clouds.add(...);
    * clouds.remove(c);  // Returns true
    * @param cloud - The cloud to remove.
    * @returns <code>true</code> if the cloud was removed; <code>false</code> if the cloud was not found in the collection.
    */
  def remove(cloud: CumulusCloud): Boolean = js.native
  
  /**
    * Removes all clouds from the collection.
    * @example
    * clouds.add(...);
    * clouds.add(...);
    * clouds.removeAll();
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if billboards in this collection will be shown.
    */
  var show: Boolean = js.native
}
