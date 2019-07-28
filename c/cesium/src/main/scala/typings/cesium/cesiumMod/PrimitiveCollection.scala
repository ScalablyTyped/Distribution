package typings.cesium.cesiumMod

import typings.cesium.Anon_DestroyPrimitives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PrimitiveCollection")
@js.native
class PrimitiveCollection () extends js.Object {
  def this(options: Anon_DestroyPrimitives) = this()
  var destroyPrimitives: Boolean = js.native
  val length: Double = js.native
  var show: Boolean = js.native
  def add(primitive: js.Any): js.Any = js.native
  def contains(): Boolean = js.native
  def contains(primitive: js.Any): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): js.Any = js.native
  def isDestroyed(): Boolean = js.native
  def lower(): Unit = js.native
  def lower(primitive: js.Any): Unit = js.native
  def lowerToBottom(): Unit = js.native
  def lowerToBottom(primitive: js.Any): Unit = js.native
  def raise(): Unit = js.native
  def raise(primitive: js.Any): Unit = js.native
  def raiseToTop(): Unit = js.native
  def raiseToTop(primitive: js.Any): Unit = js.native
  def remove(): Boolean = js.native
  def remove(primitive: js.Any): Boolean = js.native
  def removeAll(): Unit = js.native
}

