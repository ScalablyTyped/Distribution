package typings.boundsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties can be mutated
  */
@js.native
trait WatchOptions extends js.Object {
  
  def onEnter(ratio: Double): Unit = js.native
  @JSName("onEnter")
  var onEnter_Original: WatchCallback = js.native
  
  def onLeave(ratio: Double): Unit = js.native
  @JSName("onLeave")
  var onLeave_Original: WatchCallback = js.native
}
