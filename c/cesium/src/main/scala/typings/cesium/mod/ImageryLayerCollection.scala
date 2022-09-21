package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageryLayerCollection")
@js.native
open class ImageryLayerCollection () extends StObject {
  
  /**
    * Adds a layer to the collection.
    * @param layer - the layer to add.
    * @param [index] - the index to add the layer at.  If omitted, the layer will
    *                         be added on top of all existing layers.
    */
  def add(layer: ImageryLayer): Unit = js.native
  def add(layer: ImageryLayer, index: Double): Unit = js.native
  
  /**
    * Creates a new layer using the given ImageryProvider and adds it to the collection.
    * @param imageryProvider - the imagery provider to create a new layer for.
    * @param [index] - the index to add the layer at.  If omitted, the layer will
    *                         added on top of all existing layers.
    * @returns The newly created layer.
    */
  def addImageryProvider(imageryProvider: ImageryProvider): ImageryLayer = js.native
  def addImageryProvider(imageryProvider: ImageryProvider, index: Double): ImageryLayer = js.native
  
  /**
    * Checks to see if the collection contains a given layer.
    * @param layer - the layer to check for.
    * @returns true if the collection contains the layer, false otherwise.
    */
  def contains(layer: ImageryLayer): Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by all layers in this collection.  Explicitly destroying this
    * object allows for deterministic release of WebGL resources, instead of relying on the garbage
    * collector.
    * <br /><br />
    * Once this object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * layerCollection = layerCollection && layerCollection.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets a layer by index from the collection.
    * @param index - the index to retrieve.
    * @returns The imagery layer at the given index.
    */
  def get(index: Double): ImageryLayer = js.native
  
  /**
    * Determines the index of a given layer in the collection.
    * @param layer - The layer to find the index of.
    * @returns The index of the layer in the collection, or -1 if the layer does not exist in the collection.
    */
  def indexOf(layer: ImageryLayer): Double = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns true if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * An event that is raised when a layer is added to the collection.  Event handlers are passed the layer that
    * was added and the index at which it was added.
    */
  var layerAdded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event that is raised when a layer changes position in the collection.  Event handlers are passed the layer that
    * was moved, its new index after the move, and its old index prior to the move.
    */
  var layerMoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event that is raised when a layer is removed from the collection.  Event handlers are passed the layer that
    * was removed and the index from which it was removed.
    */
  var layerRemoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event that is raised when a layer is shown or hidden by setting the
    * {@link ImageryLayer#show} property.  Event handlers are passed a reference to this layer,
    * the index of the layer in the collection, and a flag that is true if the layer is now
    * shown or false if it is now hidden.
    */
  var layerShownOrHidden: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the number of layers in this collection.
    */
  var length: Double = js.native
  
  /**
    * Lowers a layer down one position in the collection.
    * @param layer - the layer to move.
    */
  def lower(layer: ImageryLayer): Unit = js.native
  
  /**
    * Lowers a layer to the bottom of the collection.
    * @param layer - the layer to move.
    */
  def lowerToBottom(layer: ImageryLayer): Unit = js.native
  
  /**
    * Asynchronously determines the imagery layer features that are intersected by a pick ray.  The intersected imagery
    * layer features are found by invoking {@link ImageryProvider#pickFeatures} for each imagery layer tile intersected
    * by the pick ray.  To compute a pick ray from a location on the screen, use {@link Camera.getPickRay}.
    * @example
    * const pickRay = viewer.camera.getPickRay(windowPosition);
    * const featuresPromise = viewer.imageryLayers.pickImageryLayerFeatures(pickRay, viewer.scene);
    * if (!Cesium.defined(featuresPromise)) {
    *     console.log('No features picked.');
    * } else {
    *     Promise.resolve(featuresPromise).then(function(features) {
    *         // This function is called asynchronously when the list if picked features is available.
    *         console.log(`Number of features: ${features.length}`);
    *         if (features.length > 0) {
    *             console.log(`First feature name: ${features[0].name}`);
    *         }
    *     });
    * }
    * @param ray - The ray to test for intersection.
    * @param scene - The scene.
    * @returns A promise that resolves to an array of features intersected by the pick ray.
    *                                             If it can be quickly determined that no features are intersected (for example,
    *                                             because no active imagery providers support {@link ImageryProvider#pickFeatures}
    *                                             or because the pick ray does not intersect the surface), this function will
    *                                             return undefined.
    */
  def pickImageryLayerFeatures(ray: Ray, scene: Scene): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  
  /**
    * Determines the imagery layers that are intersected by a pick ray. To compute a pick ray from a
    * location on the screen, use {@link Camera.getPickRay}.
    * @param ray - The ray to test for intersection.
    * @param scene - The scene.
    * @returns An array that includes all of
    *                                 the layers that are intersected by a given pick ray. Undefined if
    *                                 no layers are selected.
    */
  def pickImageryLayers(ray: Ray, scene: Scene): js.UndefOr[js.Array[ImageryLayer]] = js.native
  
  /**
    * Raises a layer up one position in the collection.
    * @param layer - the layer to move.
    */
  def raise(layer: ImageryLayer): Unit = js.native
  
  /**
    * Raises a layer to the top of the collection.
    * @param layer - the layer to move.
    */
  def raiseToTop(layer: ImageryLayer): Unit = js.native
  
  /**
    * Removes a layer from this collection, if present.
    * @param layer - The layer to remove.
    * @param [destroy = true] - whether to destroy the layers in addition to removing them.
    * @returns true if the layer was in the collection and was removed,
    *                    false if the layer was not in the collection.
    */
  def remove(layer: ImageryLayer): Boolean = js.native
  def remove(layer: ImageryLayer, destroy: Boolean): Boolean = js.native
  
  /**
    * Removes all layers from this collection.
    * @param [destroy = true] - whether to destroy the layers in addition to removing them.
    */
  def removeAll(): Unit = js.native
  def removeAll(destroy: Boolean): Unit = js.native
}
