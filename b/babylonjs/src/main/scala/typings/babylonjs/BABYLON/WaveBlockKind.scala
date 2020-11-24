package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
