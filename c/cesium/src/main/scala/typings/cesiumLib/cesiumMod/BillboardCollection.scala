package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BillboardCollection")
@js.native
class BillboardCollection () extends js.Object {
  def this(options: cesiumLib.Anon_BlendOption) = this()
  var blendOption: BlendOption = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var length: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Billboard = js.native
  def add(billboard: js.Any): Billboard = js.native
  def contains(): scala.Boolean = js.native
  def contains(billboard: Billboard): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): Billboard = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(billboard: Billboard): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

