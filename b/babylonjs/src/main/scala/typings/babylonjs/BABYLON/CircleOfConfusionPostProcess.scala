package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleOfConfusionPostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var _depthTexture: Any = js.native
  
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  def depthTexture_=(value: RenderTargetTexture): Unit = js.native
  
  /**
    * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  var fStop: Double = js.native
  
  /**
    * Focal length of the effect's camera in scene units/1000 (eg. millimeter). (default: 50)
    */
  var focalLength: Double = js.native
  
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  var focusDistance: Double = js.native
  
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diameter of the resulting aperture can be computed by lensSize/fStop.
    */
  var lensSize: Double = js.native
}
