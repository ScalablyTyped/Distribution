package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DepthOfFieldEffectBlurLevel extends StObject
@JSGlobal("BABYLON.DepthOfFieldEffectBlurLevel")
@js.native
object DepthOfFieldEffectBlurLevel extends StObject {
  
  /**
    * Large blur
    */
  @js.native
  sealed trait High
    extends StObject
       with DepthOfFieldEffectBlurLevel
  
  /**
    * Subtle blur
    */
  @js.native
  sealed trait Low
    extends StObject
       with DepthOfFieldEffectBlurLevel
  
  /**
    * Medium blur
    */
  @js.native
  sealed trait Medium
    extends StObject
       with DepthOfFieldEffectBlurLevel
}
