package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostProcessStageLibrary {
  
  @JSGlobal("Cesium.PostProcessStageLibrary")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlackAndWhiteStage(): typings.cesium.mod.PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlackAndWhiteStage")().asInstanceOf[typings.cesium.mod.PostProcessStage]
  
  inline def createBlurStage(): typings.cesium.mod.PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlurStage")().asInstanceOf[typings.cesium.mod.PostProcessStageComposite]
  
  inline def createBrightnessStage(): typings.cesium.mod.PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrightnessStage")().asInstanceOf[typings.cesium.mod.PostProcessStage]
  
  inline def createEdgeDetectionStage(): typings.cesium.mod.PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createEdgeDetectionStage")().asInstanceOf[typings.cesium.mod.PostProcessStage]
  
  inline def createLensFlareStage(): typings.cesium.mod.PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createLensFlareStage")().asInstanceOf[typings.cesium.mod.PostProcessStageComposite]
  
  inline def createNightVisionStage(): typings.cesium.mod.PostProcessStage = ^.asInstanceOf[js.Dynamic].applyDynamic("createNightVisionStage")().asInstanceOf[typings.cesium.mod.PostProcessStage]
  
  inline def createSilhouetteStage(option: js.Any): typings.cesium.mod.PostProcessStageComposite = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilhouetteStage")(option.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PostProcessStageComposite]
  
  inline def isAmbientOcclusionSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientOcclusionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDepthOfFieldSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDepthOfFieldSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEdgeDetectionSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeDetectionSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSilhouetteSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSilhouetteSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
