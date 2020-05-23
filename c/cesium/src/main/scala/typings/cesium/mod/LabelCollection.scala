package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LabelCollection")
@js.native
class LabelCollection () extends js.Object {
  def this(options: typings.cesium.anon.BlendOption) = this()
  var blendOption: BlendOption = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Label = js.native
  def add(options: LabelOptions): Label = js.native
  def contains(label: Label): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): Label = js.native
  def isDestroyed(): Boolean = js.native
  def remove(label: Label): Boolean = js.native
  def removeAll(): Unit = js.native
}

