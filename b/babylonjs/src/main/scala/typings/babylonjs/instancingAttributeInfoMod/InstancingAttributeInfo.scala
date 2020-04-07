package typings.babylonjs.instancingAttributeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancingAttributeInfo extends js.Object {
  /**
    * Name of the GLSL attribute
    * if attribute index is not specified, this is used to retrieve the index from the effect
    */
  var attributeName: String
  /**
    * size of the attribute, 1, 2, 3 or 4
    */
  var attributeSize: Double
  /**
    * type of the attribute, gl.BYTE, gl.UNSIGNED_BYTE, gl.SHORT, gl.UNSIGNED_SHORT, gl.FIXED, gl.FLOAT.
    * default is FLOAT
    */
  var attributeType: js.UndefOr[Double] = js.undefined
  /**
    * Modifies the rate at which generic vertex attributes advance when rendering multiple instances
    * default to 1
    */
  var divisor: js.UndefOr[Double] = js.undefined
  /**
    * Index/offset of the attribute in the vertex shader
    * if not specified, this will be computes from the name.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * normalization of fixed-point data. behavior unclear, use FALSE, default is FALSE
    */
  var normalized: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of the data in the Vertex Buffer acting as the instancing buffer
    */
  var offset: Double
}

object InstancingAttributeInfo {
  @scala.inline
  def apply(
    attributeName: String,
    attributeSize: Double,
    offset: Double,
    attributeType: Int | Double = null,
    divisor: Int | Double = null,
    index: Int | Double = null,
    normalized: js.UndefOr[Boolean] = js.undefined
  ): InstancingAttributeInfo = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeSize = attributeSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (attributeType != null) __obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(normalized)) __obj.updateDynamic("normalized")(normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancingAttributeInfo]
  }
}

