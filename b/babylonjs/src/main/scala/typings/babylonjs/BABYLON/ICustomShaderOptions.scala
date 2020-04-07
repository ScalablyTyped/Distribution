package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomShaderOptions extends js.Object {
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of defines used in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Gets or sets the custom shader name to use
    */
  var shaderName: String
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.UndefOr[js.Array[String]] = js.undefined
}

object ICustomShaderOptions {
  @scala.inline
  def apply(
    shaderName: String,
    attributes: js.Array[String] = null,
    defines: js.Array[String] = null,
    samplers: js.Array[String] = null,
    uniforms: js.Array[String] = null
  ): ICustomShaderOptions = {
    val __obj = js.Dynamic.literal(shaderName = shaderName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (defines != null) __obj.updateDynamic("defines")(defines.asInstanceOf[js.Any])
    if (samplers != null) __obj.updateDynamic("samplers")(samplers.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomShaderOptions]
  }
}

