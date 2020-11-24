package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.UniqueIdGenerator")
@js.native
class UniqueIdGenerator ()
  extends typings.babylonjs.BABYLON.UniqueIdGenerator
/* static members */
@JSGlobal("BABYLON.UniqueIdGenerator")
@js.native
object UniqueIdGenerator extends js.Object {
  
  /**
    * Gets an unique (relatively to the current scene) Id
    */
  def UniqueId: Double = js.native
  
  var _UniqueIdCounter: js.Any = js.native
}
