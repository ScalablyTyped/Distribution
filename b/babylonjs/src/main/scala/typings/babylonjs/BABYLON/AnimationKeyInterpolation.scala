package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationKeyInterpolation extends js.Object

@JSGlobal("BABYLON.AnimationKeyInterpolation")
@js.native
object AnimationKeyInterpolation extends js.Object {
  /**
    * Do not interpolate between keys and use the start key value only. Tangents are ignored
    */
  @js.native
  sealed trait STEP extends AnimationKeyInterpolation
  
}

