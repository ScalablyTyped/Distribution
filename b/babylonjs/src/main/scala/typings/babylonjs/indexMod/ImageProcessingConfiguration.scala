package typings.babylonjs.indexMod

import typings.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ImageProcessingConfiguration")
@js.native
class ImageProcessingConfiguration ()
  extends typings.babylonjs.materialsIndexMod.ImageProcessingConfiguration
/* static members */
object ImageProcessingConfiguration {
  
  @JSImport("babylonjs/index", "ImageProcessingConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @return The parsed image processing
    */
  @JSImport("babylonjs/index", "ImageProcessingConfiguration.Parse")
  @js.native
  def Parse(source: js.Any): typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration = js.native
  
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  @JSImport("babylonjs/index", "ImageProcessingConfiguration.PrepareSamplers")
  @js.native
  def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  @JSImport("babylonjs/index", "ImageProcessingConfiguration.PrepareUniforms")
  @js.native
  def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  @JSImport("babylonjs/index", "ImageProcessingConfiguration.TONEMAPPING_ACES")
  @js.native
  val TONEMAPPING_ACES: Double = js.native
  
  /**
    * Default tone mapping applied in BabylonJS.
    */
  @JSImport("babylonjs/index", "ImageProcessingConfiguration.TONEMAPPING_STANDARD")
  @js.native
  val TONEMAPPING_STANDARD: Double = js.native
  
  @JSImport("babylonjs/index", "ImageProcessingConfiguration._VIGNETTEMODE_MULTIPLY")
  @js.native
  def _VIGNETTEMODE_MULTIPLY: js.Any = js.native
  @scala.inline
  def _VIGNETTEMODE_MULTIPLY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_MULTIPLY")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "ImageProcessingConfiguration._VIGNETTEMODE_OPAQUE")
  @js.native
  def _VIGNETTEMODE_OPAQUE: js.Any = js.native
  @scala.inline
  def _VIGNETTEMODE_OPAQUE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_OPAQUE")(x.asInstanceOf[js.Any])
}
