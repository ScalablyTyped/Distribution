package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryLayerCollection extends js.Object {
  var layerAdded: Event[js.Array[_]] = js.native
  var layerMoved: Event[js.Array[_]] = js.native
  var layerRemoved: Event[js.Array[_]] = js.native
  var layerShownOrHidden: Event[js.Array[_]] = js.native
  var length: scala.Double = js.native
  def add(layer: ImageryLayer): scala.Unit = js.native
  def add(layer: ImageryLayer, index: scala.Double): scala.Unit = js.native
  def addImageryProvider(imageryProvider: ImageryProvider): ImageryLayer = js.native
  def addImageryProvider(imageryProvider: ImageryProvider, index: scala.Double): ImageryLayer = js.native
  def contains(layer: ImageryLayer): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): ImageryLayer = js.native
  def indexOf(layer: ImageryLayer): scala.Double = js.native
  def isDestroyed(): scala.Boolean = js.native
  def lower(layer: ImageryLayer): scala.Unit = js.native
  def lowerToBottom(layer: ImageryLayer): scala.Unit = js.native
  def pickImageryLayerFeatures(ray: Ray, scene: Scene): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  def raise(layer: ImageryLayer): scala.Unit = js.native
  def raiseToTop(layer: ImageryLayer): scala.Unit = js.native
  def remove(layer: ImageryLayer): scala.Boolean = js.native
  def remove(layer: ImageryLayer, destroy: scala.Boolean): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(destroy: scala.Boolean): scala.Unit = js.native
}

