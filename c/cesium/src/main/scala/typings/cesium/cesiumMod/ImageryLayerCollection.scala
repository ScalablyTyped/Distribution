package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryLayerCollection")
@js.native
class ImageryLayerCollection () extends js.Object {
  var layerAdded: Event[js.Array[_]] = js.native
  var layerMoved: Event[js.Array[_]] = js.native
  var layerRemoved: Event[js.Array[_]] = js.native
  var layerShownOrHidden: Event[js.Array[_]] = js.native
  var length: Double = js.native
  def add(layer: ImageryLayer): Unit = js.native
  def add(layer: ImageryLayer, index: Double): Unit = js.native
  def addImageryProvider(imageryProvider: ImageryProvider): ImageryLayer = js.native
  def addImageryProvider(imageryProvider: ImageryProvider, index: Double): ImageryLayer = js.native
  def contains(layer: ImageryLayer): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): ImageryLayer = js.native
  def indexOf(layer: ImageryLayer): Double = js.native
  def isDestroyed(): Boolean = js.native
  def lower(layer: ImageryLayer): Unit = js.native
  def lowerToBottom(layer: ImageryLayer): Unit = js.native
  def pickImageryLayerFeatures(ray: Ray, scene: Scene): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  def raise(layer: ImageryLayer): Unit = js.native
  def raiseToTop(layer: ImageryLayer): Unit = js.native
  def remove(layer: ImageryLayer): Boolean = js.native
  def remove(layer: ImageryLayer, destroy: Boolean): Boolean = js.native
  def removeAll(): Unit = js.native
  def removeAll(destroy: Boolean): Unit = js.native
}

