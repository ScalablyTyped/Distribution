package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeMaterialConnectionPointCompatibilityStates extends js.Object

@JSGlobal("BABYLON.NodeMaterialConnectionPointCompatibilityStates")
@js.native
object NodeMaterialConnectionPointCompatibilityStates extends js.Object {
  /** Points are compatibles */
  @js.native
  sealed trait Compatible extends NodeMaterialConnectionPointCompatibilityStates
  
  /** Points are incompatible because of their targets (vertex vs fragment) */
  @js.native
  sealed trait TargetIncompatible extends NodeMaterialConnectionPointCompatibilityStates
  
  /** Points are incompatible because of their types */
  @js.native
  sealed trait TypeIncompatible extends NodeMaterialConnectionPointCompatibilityStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeMaterialConnectionPointCompatibilityStates with Double] = js.native
  /* 0 */ @js.native
  object Compatible extends TopLevel[Compatible with Double]
  
  /* 2 */ @js.native
  object TargetIncompatible extends TopLevel[TargetIncompatible with Double]
  
  /* 1 */ @js.native
  object TypeIncompatible extends TopLevel[TypeIncompatible with Double]
  
}

