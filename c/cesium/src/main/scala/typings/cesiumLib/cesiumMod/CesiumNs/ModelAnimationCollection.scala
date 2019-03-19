package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelAnimationCollection extends js.Object {
  var animationAdded: Event[js.Array[_]] = js.native
  var animationRemoved: Event[js.Array[_]] = js.native
  var length: scala.Double = js.native
  def add(options: cesiumLib.Anon_Delay): ModelAnimation = js.native
  def addAll(): js.Array[ModelAnimation] = js.native
  def addAll(options: cesiumLib.Anon_DelayLoop): js.Array[ModelAnimation] = js.native
  def contains(animation: ModelAnimation): scala.Boolean = js.native
  def get(index: scala.Double): ModelAnimation = js.native
  def remove(animation: ModelAnimation): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
}

