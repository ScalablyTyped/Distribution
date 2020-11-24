package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PostProcessStageLibrary")
@js.native
object PostProcessStageLibrary extends js.Object {
  
  def createBlackAndWhiteStage(): PostProcessStage = js.native
  
  def createBlurStage(): PostProcessStageComposite = js.native
  
  def createBrightnessStage(): PostProcessStage = js.native
  
  def createEdgeDetectionStage(): PostProcessStage = js.native
  
  def createLensFlareStage(): PostProcessStageComposite = js.native
  
  def createNightVisionStage(): PostProcessStage = js.native
  
  def createSilhouetteStage(option: js.Any): PostProcessStageComposite = js.native
  
  def isAmbientOcclusionSupported(scene: Scene): Boolean = js.native
  
  def isDepthOfFieldSupported(scene: Scene): Boolean = js.native
  
  def isEdgeDetectionSupported(scene: Scene): Boolean = js.native
  
  def isSilhouetteSupported(scene: Scene): Boolean = js.native
}
