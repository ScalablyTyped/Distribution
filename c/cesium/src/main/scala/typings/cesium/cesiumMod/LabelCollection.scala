package typings.cesium.cesiumMod

import typings.cesium.Anon_DebugShowBoundingVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LabelCollection")
@js.native
class LabelCollection () extends js.Object {
  def this(options: Anon_DebugShowBoundingVolume) = this()
  var debugShowBoundingVolume: Boolean = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Label = js.native
  def add(options: js.Any): Label = js.native
  def contains(label: Label): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): Label = js.native
  def isDestroyed(): Boolean = js.native
  def remove(label: Label): Boolean = js.native
  def removeAll(): Unit = js.native
}

