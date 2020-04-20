package typings.babylonjs.shaderMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShaderMaterialOptions extends js.Object {
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.Array[String]
  /**
    * The list of defines used in the shader
    */
  var defines: js.Array[String]
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: Boolean
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: Boolean
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.Array[String]
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[String]
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.Array[String]
}

object IShaderMaterialOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    defines: js.Array[String],
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    samplers: js.Array[String],
    uniformBuffers: js.Array[String],
    uniforms: js.Array[String]
  ): IShaderMaterialOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShaderMaterialOptions]
  }
}

