package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.DestroyPrimitives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PrimitiveCollection")
@js.native
open class PrimitiveCollection () extends StObject {
  def this(options: DestroyPrimitives) = this()
  
  /**
    * Adds a primitive to the collection.
    * @example
    * const billboards = scene.primitives.add(new Cesium.BillboardCollection());
    * @param primitive - The primitive to add.
    * @param [index] - The index to add the layer at.  If omitted, the primitive will be added at the bottom of all existing primitives.
    * @returns The primitive added to the collection.
    */
  def add(primitive: Any): Any = js.native
  def add(primitive: Any, index: Double): Any = js.native
  
  /**
    * Determines if this collection contains a primitive.
    * @param [primitive] - The primitive to check for.
    * @returns <code>true</code> if the primitive is in the collection; <code>false</code> if the primitive is <code>undefined</code> or was not found in the collection.
    */
  def contains(): Boolean = js.native
  def contains(primitive: Any): Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by each primitive in this collection.  Explicitly destroying this
    * collection allows for deterministic release of WebGL resources, instead of relying on the garbage
    * collector to destroy this collection.
    * <br /><br />
    * Since destroying a collection destroys all the contained primitives, only destroy a collection
    * when you are sure no other code is still using any of the contained primitives.
    * <br /><br />
    * Once this collection is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * primitives = primitives && primitives.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Determines if primitives in the collection are destroyed when they are removed by
    * {@link PrimitiveCollection#destroy} or  {@link PrimitiveCollection#remove} or implicitly
    * by {@link PrimitiveCollection#removeAll}.
    * @example
    * // Example 1. Primitives are destroyed by default.
    * const primitives = new Cesium.PrimitiveCollection();
    * const labels = primitives.add(new Cesium.LabelCollection());
    * primitives = primitives.destroy();
    * const b = labels.isDestroyed(); // true
    * @example
    * // Example 2. Do not destroy primitives in a collection.
    * const primitives = new Cesium.PrimitiveCollection();
    * primitives.destroyPrimitives = false;
    * const labels = primitives.add(new Cesium.LabelCollection());
    * primitives = primitives.destroy();
    * const b = labels.isDestroyed(); // false
    * labels = labels.destroy();    // explicitly destroy
    */
  var destroyPrimitives: Boolean = js.native
  
  /**
    * Returns the primitive in the collection at the specified index.
    * @example
    * // Toggle the show property of every primitive in the collection.
    * const primitives = scene.primitives;
    * const length = primitives.length;
    * for (let i = 0; i < length; ++i) {
    *   const p = primitives.get(i);
    *   p.show = !p.show;
    * }
    * @param index - The zero-based index of the primitive to return.
    * @returns The primitive at the <code>index</code>.
    */
  def get(index: Double): Any = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the number of primitives in the collection.
    */
  val length: Double = js.native
  
  /**
    * Lowers a primitive "down one" in the collection.  If all primitives in the collection are drawn
    * on the globe surface, this visually moves the primitive down one.
    * @param [primitive] - The primitive to lower.
    */
  def lower(): Unit = js.native
  def lower(primitive: Any): Unit = js.native
  
  /**
    * Lowers a primitive to the "bottom" of the collection.  If all primitives in the collection are drawn
    * on the globe surface, this visually moves the primitive to the bottom.
    * @param [primitive] - The primitive to lower to the bottom.
    */
  def lowerToBottom(): Unit = js.native
  def lowerToBottom(primitive: Any): Unit = js.native
  
  /**
    * Raises a primitive "up one" in the collection.  If all primitives in the collection are drawn
    * on the globe surface, this visually moves the primitive up one.
    * @param [primitive] - The primitive to raise.
    */
  def raise(): Unit = js.native
  def raise(primitive: Any): Unit = js.native
  
  /**
    * Raises a primitive to the "top" of the collection.  If all primitives in the collection are drawn
    * on the globe surface, this visually moves the primitive to the top.
    * @param [primitive] - The primitive to raise the top.
    */
  def raiseToTop(): Unit = js.native
  def raiseToTop(primitive: Any): Unit = js.native
  
  /**
    * Removes a primitive from the collection.
    * @example
    * const billboards = scene.primitives.add(new Cesium.BillboardCollection());
    * scene.primitives.remove(billboards);  // Returns true
    * @param [primitive] - The primitive to remove.
    * @returns <code>true</code> if the primitive was removed; <code>false</code> if the primitive is <code>undefined</code> or was not found in the collection.
    */
  def remove(): Boolean = js.native
  def remove(primitive: Any): Boolean = js.native
  
  /**
    * Removes all primitives in the collection.
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if primitives in this collection will be shown.
    */
  var show: Boolean = js.native
}
