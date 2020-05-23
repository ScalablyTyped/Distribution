package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAPBroadphase extends BroadPhase {
  var axisIndex: Double = js.native
  var axisList: js.Array[_] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def autoDetectAxis(): Unit = js.native
}

