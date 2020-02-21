package typings.cesium.mod

import typings.cesium.AnonBlendOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BillboardCollection")
@js.native
class BillboardCollection () extends js.Object {
  def this(options: AnonBlendOption) = this()
  var blendOption: BlendOption = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Billboard = js.native
  def add(billboard: BillboardOptions): Billboard = js.native
  def contains(): Boolean = js.native
  def contains(billboard: Billboard): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): Billboard = js.native
  def isDestroyed(): Boolean = js.native
  def remove(billboard: Billboard): Boolean = js.native
  def removeAll(): Unit = js.native
  def update(): Unit = js.native
}

