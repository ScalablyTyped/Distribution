package typings.cesium.cesiumMod

import typings.cesium.Anon_Delay
import typings.cesium.Anon_DelayLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ModelAnimationCollection")
@js.native
class ModelAnimationCollection () extends js.Object {
  var animationAdded: Event[js.Array[_]] = js.native
  var animationRemoved: Event[js.Array[_]] = js.native
  var length: Double = js.native
  def add(options: Anon_Delay): ModelAnimation = js.native
  def addAll(): js.Array[ModelAnimation] = js.native
  def addAll(options: Anon_DelayLoop): js.Array[ModelAnimation] = js.native
  def contains(animation: ModelAnimation): Boolean = js.native
  def get(index: Double): ModelAnimation = js.native
  def remove(animation: ModelAnimation): Boolean = js.native
  def removeAll(): Unit = js.native
}

