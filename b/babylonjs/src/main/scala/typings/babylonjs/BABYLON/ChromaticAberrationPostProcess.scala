package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromaticAberrationPostProcess
  extends StObject
     with PostProcess {
  
  /**
    * The amount of seperation of rgb channels (default: 30)
    */
  var aberrationAmount: Double = js.native
  
  /**
    * The center position where the radialIntensity should be around. [0.5,0.5 is center of screen, 1,1 is top right corder] (default: Vector2(0.5 ,0.5))
    */
  var centerPosition: Vector2 = js.native
  
  /**
    * The normilized direction in which the rgb channels should be seperated. If set to 0,0 radial direction will be used. (default: Vector2(0.707,0.707))
    */
  var direction: Vector2 = js.native
  
  /**
    * The amount the effect will increase for pixels closer to the edge of the screen. (default: 0)
    */
  var radialIntensity: Double = js.native
  
  /** The height of the screen to apply the effect on */
  var screenHeight: Double = js.native
  
  /** The width of the screen to apply the effect on */
  var screenWidth: Double = js.native
}
