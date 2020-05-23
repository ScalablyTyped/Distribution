package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeMaterialConnectionPointDirection extends js.Object

@JSGlobal("BABYLON.NodeMaterialConnectionPointDirection")
@js.native
object NodeMaterialConnectionPointDirection extends js.Object {
  /** Input */
  @js.native
  sealed trait Input extends NodeMaterialConnectionPointDirection
  
  /** Output */
  @js.native
  sealed trait Output extends NodeMaterialConnectionPointDirection
  
}

