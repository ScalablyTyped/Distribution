package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointPrimitiveCollection")
@js.native
class PointPrimitiveCollection () extends js.Object {
  def this(options: cesiumLib.Anon_BlendOptionDebugShowBoundingVolume) = this()
  var blendOption: BlendOption = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var length: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): PointPrimitive = js.native
  def add(pointPrimitive: js.Any): PointPrimitive = js.native
  def contains(): scala.Boolean = js.native
  def contains(pointPrimitive: PointPrimitive): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): PointPrimitive = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(pointPrimitive: PointPrimitive): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
}

