package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
