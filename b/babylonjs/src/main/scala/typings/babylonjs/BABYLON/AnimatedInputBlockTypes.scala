package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimatedInputBlockTypes extends js.Object
@JSGlobal("BABYLON.AnimatedInputBlockTypes")
@js.native
object AnimatedInputBlockTypes extends js.Object {
  
  /** No animation */
  @js.native
  sealed trait None extends AnimatedInputBlockTypes
  
  /** Time based animation. Will only work for floats */
  @js.native
  sealed trait Time extends AnimatedInputBlockTypes
}
