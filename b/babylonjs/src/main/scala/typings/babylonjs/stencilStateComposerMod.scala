package typings.babylonjs

import typings.babylonjs.istencilstateMod.IStencilState
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stencilStateComposerMod {
  
  @JSImport("babylonjs/States/stencilStateComposer", "StencilStateComposer")
  @js.native
  open class StencilStateComposer () extends StObject {
    def this(reset: Boolean) = this()
    
    /* protected */ var _enabled: Boolean = js.native
    
    /* protected */ var _func: Double = js.native
    
    /* protected */ var _funcMask: Double = js.native
    
    /* protected */ var _funcRef: Double = js.native
    
    /* protected */ var _isStencilFuncDirty: Boolean = js.native
    
    /* protected */ var _isStencilMaskDirty: Boolean = js.native
    
    /* protected */ var _isStencilOpDirty: Boolean = js.native
    
    /* protected */ var _isStencilTestDirty: Boolean = js.native
    
    /* protected */ var _mask: Double = js.native
    
    /* protected */ var _opDepthFail: Double = js.native
    
    /* protected */ var _opStencilDepthPass: Double = js.native
    
    /* protected */ var _opStencilFail: Double = js.native
    
    @JSName("apply")
    def apply(): Unit = js.native
    @JSName("apply")
    def apply(gl: WebGLRenderingContext): Unit = js.native
    
    def enabled: Boolean = js.native
    def enabled_=(value: Boolean): Unit = js.native
    
    def func: Double = js.native
    
    def funcMask: Double = js.native
    def funcMask_=(value: Double): Unit = js.native
    
    def funcRef: Double = js.native
    def funcRef_=(value: Double): Unit = js.native
    
    def func_=(value: Double): Unit = js.native
    
    def isDirty: Boolean = js.native
    
    def mask: Double = js.native
    def mask_=(value: Double): Unit = js.native
    
    def opDepthFail: Double = js.native
    def opDepthFail_=(value: Double): Unit = js.native
    
    def opStencilDepthPass: Double = js.native
    def opStencilDepthPass_=(value: Double): Unit = js.native
    
    def opStencilFail: Double = js.native
    def opStencilFail_=(value: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    var stencilGlobal: IStencilState = js.native
    
    var stencilMaterial: js.UndefOr[IStencilState] = js.native
    
    var useStencilGlobalOnly: Boolean = js.native
  }
}
