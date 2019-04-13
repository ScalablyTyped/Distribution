package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LabelCollection")
@js.native
class LabelCollection () extends js.Object {
  def this(options: cesiumLib.Anon_DebugShowBoundingVolume) = this()
  var debugShowBoundingVolume: scala.Boolean = js.native
  var length: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Label = js.native
  def add(options: js.Any): Label = js.native
  def contains(label: Label): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): Label = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(label: Label): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
}

