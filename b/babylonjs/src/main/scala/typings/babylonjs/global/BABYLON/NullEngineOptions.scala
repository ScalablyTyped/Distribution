package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NullEngineOptions")
@js.native
open class NullEngineOptions ()
  extends StObject
     with typings.babylonjs.BABYLON.NullEngineOptions {
  
  /**
    * If delta time between frames should be constant
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  /* CompleteClass */
  var deterministicLockstep: Boolean = js.native
  
  /**
    * Maximum about of steps between frames (Default: 4)
    * @see https://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  /* CompleteClass */
  var lockstepMaxSteps: Double = js.native
  
  /**
    * Render height (Default: 256)
    */
  /* CompleteClass */
  var renderHeight: Double = js.native
  
  /**
    * Render width (Default: 512)
    */
  /* CompleteClass */
  var renderWidth: Double = js.native
  
  /**
    * Texture size (Default: 512)
    */
  /* CompleteClass */
  var textureSize: Double = js.native
}
