package typings.babylonjs.mod

import typings.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ImageProcessingConfiguration")
@js.native
open class ImageProcessingConfiguration ()
  extends typings.babylonjs.legacyMod.ImageProcessingConfiguration
/* static members */
object ImageProcessingConfiguration {
  
  @JSImport("babylonjs", "ImageProcessingConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @returns The parsed image processing
    */
  inline def Parse(source: Any): typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration]
  
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  inline def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareSamplers")(samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  inline def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniforms")(uniforms.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  @JSImport("babylonjs", "ImageProcessingConfiguration.TONEMAPPING_ACES")
  @js.native
  val TONEMAPPING_ACES: Double = js.native
  
  /**
    * Default tone mapping applied in BabylonJS.
    */
  @JSImport("babylonjs", "ImageProcessingConfiguration.TONEMAPPING_STANDARD")
  @js.native
  val TONEMAPPING_STANDARD: Double = js.native
  
  @JSImport("babylonjs", "ImageProcessingConfiguration._VIGNETTEMODE_MULTIPLY")
  @js.native
  def _VIGNETTEMODE_MULTIPLY: Any = js.native
  inline def _VIGNETTEMODE_MULTIPLY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_MULTIPLY")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "ImageProcessingConfiguration._VIGNETTEMODE_OPAQUE")
  @js.native
  def _VIGNETTEMODE_OPAQUE: Any = js.native
  inline def _VIGNETTEMODE_OPAQUE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_OPAQUE")(x.asInstanceOf[js.Any])
}
