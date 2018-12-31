package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@JSGlobal("BABYLON._AlphaState")
@js.native
/**
  * Initializes the state.
  */
class _AlphaState () extends js.Object {
  var _alphaBlend: js.Any = js.native
  var _blendConstants: js.Any = js.native
  var _blendEquationParameters: js.Any = js.native
  var _blendFunctionParameters: js.Any = js.native
  var _isAlphaBlendDirty: js.Any = js.native
  var _isBlendConstantsDirty: js.Any = js.native
  var _isBlendEquationParametersDirty: js.Any = js.native
  var _isBlendFunctionParametersDirty: js.Any = js.native
  var alphaBlend: scala.Boolean = js.native
  val isDirty: scala.Boolean = js.native
  @JSName("apply")
  def apply(gl: babylonjsLib.WebGLRenderingContext): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setAlphaBlendConstants(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  def setAlphaBlendFunctionParameters(value0: scala.Double, value1: scala.Double, value2: scala.Double, value3: scala.Double): scala.Unit = js.native
  def setAlphaEquationParameters(rgb: scala.Double, alpha: scala.Double): scala.Unit = js.native
}

