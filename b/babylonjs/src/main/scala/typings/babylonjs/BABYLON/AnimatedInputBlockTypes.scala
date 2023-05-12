package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimatedInputBlockTypes extends StObject
@JSGlobal("BABYLON.AnimatedInputBlockTypes")
@js.native
object AnimatedInputBlockTypes extends StObject {
  
  /** No animation */
  @js.native
  sealed trait None
    extends StObject
       with AnimatedInputBlockTypes
  
  /** Time elapsed (in seconds) since the engine was initialized. Will only work for floats */
  @js.native
  sealed trait RealTime
    extends StObject
       with AnimatedInputBlockTypes
  
  /** Time based animation (is incremented by 0.6 each second). Will only work for floats */
  @js.native
  sealed trait Time
    extends StObject
       with AnimatedInputBlockTypes
}
