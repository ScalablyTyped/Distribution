package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Space extends js.Object

@JSGlobal("BABYLON.Space")
@js.native
object Space extends js.Object {
  /** Bone space */
  @js.native
  sealed trait BONE extends Space
  
  /** Local (object) space */
  @js.native
  sealed trait LOCAL extends Space
  
  /** World space */
  @js.native
  sealed trait WORLD extends Space
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Space with Double] = js.native
  /* 2 */ @js.native
  object BONE extends TopLevel[BONE with Double]
  
  /* 0 */ @js.native
  object LOCAL extends TopLevel[LOCAL with Double]
  
  /* 1 */ @js.native
  object WORLD extends TopLevel[WORLD with Double]
  
}

