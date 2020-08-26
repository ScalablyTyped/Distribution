package typings.boundsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties can be mutated
  */
@js.native
trait WatchOptions extends js.Object {
  @JSName("onEnter")
  var onEnter_Original: WatchCallback = js.native
  @JSName("onLeave")
  var onLeave_Original: WatchCallback = js.native
  def onEnter(ratio: Double): Unit = js.native
  def onLeave(ratio: Double): Unit = js.native
}

