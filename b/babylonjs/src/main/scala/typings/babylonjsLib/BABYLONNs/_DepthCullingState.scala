package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
@JSGlobal("BABYLON._DepthCullingState")
@js.native
/**
  * Initializes the state.
  */
class _DepthCullingState () extends js.Object {
  var _cull: js.Any = js.native
  var _cullFace: js.Any = js.native
  var _depthFunc: js.Any = js.native
  var _depthMask: js.Any = js.native
  var _depthTest: js.Any = js.native
  var _frontFace: js.Any = js.native
  var _isCullDirty: js.Any = js.native
  var _isCullFaceDirty: js.Any = js.native
  var _isDepthFuncDirty: js.Any = js.native
  var _isDepthMaskDirty: js.Any = js.native
  var _isDepthTestDirty: js.Any = js.native
  var _isFrontFaceDirty: js.Any = js.native
  var _isZOffsetDirty: js.Any = js.native
  var _zOffset: js.Any = js.native
  var cull: Nullable[scala.Boolean] = js.native
  var cullFace: Nullable[scala.Double] = js.native
  var depthFunc: Nullable[scala.Double] = js.native
  var depthMask: scala.Boolean = js.native
  var depthTest: scala.Boolean = js.native
  var frontFace: Nullable[scala.Double] = js.native
  val isDirty: scala.Boolean = js.native
  var zOffset: scala.Double = js.native
  @JSName("apply")
  def apply(gl: babylonjsLib.WebGLRenderingContext): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

