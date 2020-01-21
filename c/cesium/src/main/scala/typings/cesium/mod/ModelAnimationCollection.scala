package typings.cesium.mod

import typings.cesium.AnonDelay
import typings.cesium.AnonDelayLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ModelAnimationCollection")
@js.native
class ModelAnimationCollection () extends js.Object {
  var animationAdded: Event[js.Array[_]] = js.native
  var animationRemoved: Event[js.Array[_]] = js.native
  var length: Double = js.native
  def add(options: AnonDelay): ModelAnimation = js.native
  def addAll(): js.Array[ModelAnimation] = js.native
  def addAll(options: AnonDelayLoop): js.Array[ModelAnimation] = js.native
  def contains(animation: ModelAnimation): Boolean = js.native
  def get(index: Double): ModelAnimation = js.native
  def remove(animation: ModelAnimation): Boolean = js.native
  def removeAll(): Unit = js.native
}

