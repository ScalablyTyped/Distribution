package typings.cesium.mod

import typings.cesium.anon.Delay
import typings.cesium.anon.RemoveOnStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ModelAnimationCollection")
@js.native
class ModelAnimationCollection () extends js.Object {
  
  def add(options: Delay): ModelAnimation = js.native
  
  def addAll(): js.Array[ModelAnimation] = js.native
  def addAll(options: RemoveOnStop): js.Array[ModelAnimation] = js.native
  
  var animationAdded: Event[js.Array[_]] = js.native
  
  var animationRemoved: Event[js.Array[_]] = js.native
  
  def contains(animation: ModelAnimation): Boolean = js.native
  
  def get(index: Double): ModelAnimation = js.native
  
  var length: Double = js.native
  
  def remove(animation: ModelAnimation): Boolean = js.native
  
  def removeAll(): Unit = js.native
}
