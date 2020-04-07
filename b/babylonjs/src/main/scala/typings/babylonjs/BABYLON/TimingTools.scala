package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TimingTools")
@js.native
class TimingTools () extends js.Object

/* static members */
@JSGlobal("BABYLON.TimingTools")
@js.native
object TimingTools extends js.Object {
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  def SetImmediate(action: js.Function0[Unit]): Unit = js.native
}

