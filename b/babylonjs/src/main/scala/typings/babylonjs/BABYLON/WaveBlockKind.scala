package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WaveBlockKind extends StObject
@JSGlobal("BABYLON.WaveBlockKind")
@js.native
object WaveBlockKind extends StObject {
  
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
