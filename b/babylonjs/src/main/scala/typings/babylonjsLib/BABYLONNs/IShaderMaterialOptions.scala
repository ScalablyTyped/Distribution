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

