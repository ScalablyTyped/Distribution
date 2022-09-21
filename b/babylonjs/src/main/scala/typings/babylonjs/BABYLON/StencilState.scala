package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StencilState
  extends StObject
     with IStencilState {
  
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
