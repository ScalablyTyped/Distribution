package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WaveBlockKind extends js.Object

@JSGlobal("BABYLON.WaveBlockKind")
@js.native
object WaveBlockKind extends js.Object {
  /** SawTooth */
  @js.native
  sealed trait SawTooth extends WaveBlockKind
  
  /** Square */
  @js.native
  sealed trait Square extends WaveBlockKind
  
  /** Triangle */
  @js.native
  sealed trait Triangle extends WaveBlockKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WaveBlockKind with Double] = js.native
  /* 0 */ @js.native
  object SawTooth extends TopLevel[SawTooth with Double]
  
  /* 1 */ @js.native
  object Square extends TopLevel[Square with Double]
  
  /* 2 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
}

