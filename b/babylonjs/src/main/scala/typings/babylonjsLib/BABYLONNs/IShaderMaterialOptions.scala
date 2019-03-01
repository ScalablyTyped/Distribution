package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options associated with the creation of a shader material.
  */
trait IShaderMaterialOptions extends js.Object {
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.Array[java.lang.String]
  /**
    * The list of defines used in the shader
    */
  var defines: js.Array[java.lang.String]
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: scala.Boolean
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: scala.Boolean
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.Array[java.lang.String]
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[java.lang.String]
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.Array[java.lang.String]
}

object IShaderMaterialOptions {
  @scala.inline
  def apply(
    attributes: js.Array[java.lang.String],
    defines: js.Array[java.lang.String],
    needAlphaBlending: scala.Boolean,
    needAlphaTesting: scala.Boolean,
    samplers: js.Array[java.lang.String],
    uniformBuffers: js.Array[java.lang.String],
    uniforms: js.Array[java.lang.String]
  ): IShaderMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("defines")(defines)
    __obj.updateDynamic("needAlphaBlending")(needAlphaBlending)
    __obj.updateDynamic("needAlphaTesting")(needAlphaTesting)
    __obj.updateDynamic("samplers")(samplers)
    __obj.updateDynamic("uniformBuffers")(uniformBuffers)
    __obj.updateDynamic("uniforms")(uniforms)
    __obj.asInstanceOf[IShaderMaterialOptions]
  }
}

