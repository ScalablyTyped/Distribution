package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@JSGlobal("BABYLON._StencilState")
@js.native
class _StencilState () extends js.Object {
  var _isStencilFuncDirty: js.Any = js.native
  var _isStencilMaskDirty: js.Any = js.native
  var _isStencilOpDirty: js.Any = js.native
  var _isStencilTestDirty: js.Any = js.native
  var _stencilFunc: js.Any = js.native
  var _stencilFuncMask: js.Any = js.native
  var _stencilFuncRef: js.Any = js.native
  var _stencilMask: js.Any = js.native
  var _stencilOpDepthFail: js.Any = js.native
  var _stencilOpStencilDepthPass: js.Any = js.native
  var _stencilOpStencilFail: js.Any = js.native
  var _stencilTest: js.Any = js.native
  val isDirty: scala.Boolean = js.native
  var stencilFunc: scala.Double = js.native
  var stencilFuncMask: scala.Double = js.native
  var stencilFuncRef: scala.Double = js.native
  var stencilMask: scala.Double = js.native
  var stencilOpDepthFail: scala.Double = js.native
  var stencilOpStencilDepthPass: scala.Double = js.native
  var stencilOpStencilFail: scala.Double = js.native
  var stencilTest: scala.Boolean = js.native
  @JSName("apply")
  def apply(gl: babylonjsLib.WebGLRenderingContext): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

