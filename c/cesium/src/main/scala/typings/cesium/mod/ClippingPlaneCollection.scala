package typings.cesium.mod

import typings.cesium.AnonEdgeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ClippingPlaneCollection")
@js.native
class ClippingPlaneCollection () extends js.Object {
  def this(options: AnonEdgeColor) = this()
  var edgeColor: Color = js.native
  var edgeWidth: Double = js.native
  var enabled: Boolean = js.native
  val length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  var planeAdded: Event[js.Array[_]] = js.native
  var planeRemoved: Event[js.Array[_]] = js.native
  var unionClippingRegions: Boolean = js.native
  def add(plane: ClippingPlane): Unit = js.native
  def contains(plane: ClippingPlane): Boolean = js.native
  def destroy(): Unit = js.native
  def getIndex(index: Double): ClippingPlane = js.native
  def isDestroyed(): Boolean = js.native
  def remove(plane: ClippingPlane): Boolean = js.native
  def update(): Unit = js.native
}

