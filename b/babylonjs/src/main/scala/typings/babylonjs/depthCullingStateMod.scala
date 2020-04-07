package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/States/depthCullingState", JSImport.Namespace)
@js.native
object depthCullingStateMod extends js.Object {
  @js.native
  /**
    * Initializes the state.
    */
  class DepthCullingState () extends js.Object {
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
    @JSName("apply")
    def apply(gl: WebGLRenderingContext): Unit = js.native
    def cull(): Nullable[Boolean] = js.native
    def cull(value: Nullable[Boolean]): js.Any = js.native
    def cullFace(): Nullable[Double] = js.native
    def cullFace(value: Nullable[Double]): js.Any = js.native
    def depthFunc(): Nullable[Double] = js.native
    def depthFunc(value: Nullable[Double]): js.Any = js.native
    def depthMask(): Boolean = js.native
    def depthMask(value: Boolean): js.Any = js.native
    def depthTest(): Boolean = js.native
    def depthTest(value: Boolean): js.Any = js.native
    def frontFace(): Nullable[Double] = js.native
    def frontFace(value: Nullable[Double]): js.Any = js.native
    def isDirty(): Boolean = js.native
    def reset(): Unit = js.native
    def zOffset(): Double = js.native
    def zOffset(value: Double): js.Any = js.native
  }
  
}

