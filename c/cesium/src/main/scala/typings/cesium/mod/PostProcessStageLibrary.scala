package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostProcessStageLibrary {
  
  @JSImport("cesium", "PostProcessStageLibrary")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createBlackAndWhiteStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlackAndWhiteStage")().asInstanceOf[PostProcessStage]
  
  @scala.inline
  def createBlurStage(): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlurStage")().asInstanceOf[PostProcessStageComposite]
  
  @scala.inline
  def createBrightnessStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrightnessStage")().asInstanceOf[PostProcessStage]
  
  @scala.inline
  def createEdgeDetectionStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createEdgeDetectionStage")().asInstanceOf[PostProcessStage]
  
  @scala.inline
  def createLensFlareStage(): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createLensFlareStage")().asInstanceOf[PostProcessStageComposite]
  
  @scala.inline
  def createNightVisionStage(): PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createNightVisionStage")().asInstanceOf[PostProcessStage]
  
  @scala.inline
  def createSilhouetteStage(option: js.Any): PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilhouetteStage")(option.asInstanceOf[js.Any]).asInstanceOf[PostProcessStageComposite]
  
  @scala.inline
  def isAmbientOcclusionSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientOcclusionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDepthOfFieldSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDepthOfFieldSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEdgeDetectionSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeDetectionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSilhouetteSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSilhouetteSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
