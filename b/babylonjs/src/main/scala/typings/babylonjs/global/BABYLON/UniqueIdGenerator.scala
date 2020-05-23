package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.UniqueIdGenerator")
@js.native
class UniqueIdGenerator ()
  extends typings.babylonjs.BABYLON.UniqueIdGenerator

/* static members */
@JSGlobal("BABYLON.UniqueIdGenerator")
@js.native
object UniqueIdGenerator extends js.Object {
  var _UniqueIdCounter: js.Any = js.native
  /**
    * Gets an unique (relatively to the current scene) Id
    */
  def UniqueId: Double = js.native
}

