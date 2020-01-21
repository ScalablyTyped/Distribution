package typings.cesium.mod

import typings.cesium.AnonBlendOptionDebugShowBoundingVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointPrimitiveCollection")
@js.native
class PointPrimitiveCollection () extends js.Object {
  def this(options: AnonBlendOptionDebugShowBoundingVolume) = this()
  var blendOption: BlendOption = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): PointPrimitive = js.native
  def add(pointPrimitive: js.Any): PointPrimitive = js.native
  def contains(): Boolean = js.native
  def contains(pointPrimitive: PointPrimitive): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): PointPrimitive = js.native
  def isDestroyed(): Boolean = js.native
  def remove(pointPrimitive: PointPrimitive): Boolean = js.native
  def removeAll(): Unit = js.native
}

