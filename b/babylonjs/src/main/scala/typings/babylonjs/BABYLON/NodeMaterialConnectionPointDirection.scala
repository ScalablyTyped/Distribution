package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeMaterialConnectionPointDirection with Double] = js.native
  /* 0 */ @js.native
  object Input extends TopLevel[Input with Double]
  
  /* 1 */ @js.native
  object Output extends TopLevel[Output with Double]
  
}

