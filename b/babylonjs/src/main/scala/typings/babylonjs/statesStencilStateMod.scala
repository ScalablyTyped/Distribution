package typings.babylonjs

import typings.babylonjs.statesIstencilstateMod.IStencilState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statesStencilStateMod {
  
  @JSImport("babylonjs/States/stencilState", "StencilState")
  @js.native
  open class StencilState ()
    extends StObject
       with IStencilState {
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var func: Double = js.native
    
    /* CompleteClass */
    var funcMask: Double = js.native
    
    /* CompleteClass */
    var funcRef: Double = js.native
    
    /* CompleteClass */
    var mask: Double = js.native
    
    /* CompleteClass */
    var opDepthFail: Double = js.native
    
    /* CompleteClass */
    var opStencilDepthPass: Double = js.native
    
    /* CompleteClass */
    var opStencilFail: Double = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
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
  /* static members */
  object StencilState {
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    @JSImport("babylonjs/States/stencilState", "StencilState.ALWAYS")
    @js.native
    val ALWAYS: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    @JSImport("babylonjs/States/stencilState", "StencilState.KEEP")
    @js.native
    val KEEP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    @JSImport("babylonjs/States/stencilState", "StencilState.REPLACE")
    @js.native
    val REPLACE: Double = js.native
  }
}
