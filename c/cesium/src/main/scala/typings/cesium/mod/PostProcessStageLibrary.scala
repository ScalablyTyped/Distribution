package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostProcessStageLibrary {
  
  @JSImport("cesium", "PostProcessStageLibrary.createBlackAndWhiteStage")
  @js.native
  def createBlackAndWhiteStage(): PostProcessStage = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createBlurStage")
  @js.native
  def createBlurStage(): PostProcessStageComposite = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createBrightnessStage")
  @js.native
  def createBrightnessStage(): PostProcessStage = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createEdgeDetectionStage")
  @js.native
  def createEdgeDetectionStage(): PostProcessStage = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createLensFlareStage")
  @js.native
  def createLensFlareStage(): PostProcessStageComposite = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createNightVisionStage")
  @js.native
  def createNightVisionStage(): PostProcessStage = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.createSilhouetteStage")
  @js.native
  def createSilhouetteStage(option: js.Any): PostProcessStageComposite = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.isAmbientOcclusionSupported")
  @js.native
  def isAmbientOcclusionSupported(scene: Scene): Boolean = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.isDepthOfFieldSupported")
  @js.native
  def isDepthOfFieldSupported(scene: Scene): Boolean = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.isEdgeDetectionSupported")
  @js.native
  def isEdgeDetectionSupported(scene: Scene): Boolean = js.native
  
  @JSImport("cesium", "PostProcessStageLibrary.isSilhouetteSupported")
  @js.native
  def isSilhouetteSupported(scene: Scene): Boolean = js.native
}
