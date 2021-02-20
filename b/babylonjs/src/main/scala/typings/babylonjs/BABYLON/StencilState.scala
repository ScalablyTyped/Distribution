package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StencilState extends StObject {
  
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
  
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
  
  def isDirty: Boolean = js.native
  
  def reset(): Unit = js.native
  
  def stencilFunc: Double = js.native
  
  def stencilFuncMask: Double = js.native
  def stencilFuncMask_=(value: Double): Unit = js.native
  
  def stencilFuncRef: Double = js.native
  def stencilFuncRef_=(value: Double): Unit = js.native
  
  def stencilFunc_=(value: Double): Unit = js.native
  
  def stencilMask: Double = js.native
  def stencilMask_=(value: Double): Unit = js.native
  
  def stencilOpDepthFail: Double = js.native
  def stencilOpDepthFail_=(value: Double): Unit = js.native
  
  def stencilOpStencilDepthPass: Double = js.native
  def stencilOpStencilDepthPass_=(value: Double): Unit = js.native
  
  def stencilOpStencilFail: Double = js.native
  def stencilOpStencilFail_=(value: Double): Unit = js.native
  
  def stencilTest: Boolean = js.native
  def stencilTest_=(value: Boolean): Unit = js.native
}
