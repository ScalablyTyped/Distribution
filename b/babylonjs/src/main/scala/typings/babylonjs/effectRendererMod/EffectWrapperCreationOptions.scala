package typings.babylonjs.effectRendererMod

import typings.babylonjs.thinEngineMod.ThinEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to create an EffectWrapper
  */
trait EffectWrapperCreationOptions extends js.Object {
  /**
    * Attributes to use in the shader
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Engine to use to create the effect
    */
  var engine: ThinEngine
  /**
    * Fragment shader for the effect
    */
  var fragmentShader: String
  /**
    * The friendly name of the effect displayed in Spector.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Texture sampler names to use in the shader
    */
  var samplerNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Uniforms to use in the shader
    */
  var uniformNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Vertex shader for the effect
    */
  var vertexShader: js.UndefOr[String] = js.undefined
}

object EffectWrapperCreationOptions {
  @scala.inline
  def apply(
    engine: ThinEngine,
    fragmentShader: String,
    attributeNames: js.Array[String] = null,
    name: String = null,
    samplerNames: js.Array[String] = null,
    uniformNames: js.Array[String] = null,
    vertexShader: String = null
  ): EffectWrapperCreationOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any])
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (samplerNames != null) __obj.updateDynamic("samplerNames")(samplerNames.asInstanceOf[js.Any])
    if (uniformNames != null) __obj.updateDynamic("uniformNames")(uniformNames.asInstanceOf[js.Any])
    if (vertexShader != null) __obj.updateDynamic("vertexShader")(vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapperCreationOptions]
  }
}

