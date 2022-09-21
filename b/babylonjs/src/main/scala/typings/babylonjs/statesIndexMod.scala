package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statesIndexMod {
  
  @JSImport("babylonjs/States/index", "AlphaState")
  @js.native
  /**
    * Initializes the state.
    */
  open class AlphaState ()
    extends typings.babylonjs.alphaCullingStateMod.AlphaState
  
  @JSImport("babylonjs/States/index", "DepthCullingState")
  @js.native
  /**
    * Initializes the state.
    * @param reset
    */
  open class DepthCullingState ()
    extends typings.babylonjs.depthCullingStateMod.DepthCullingState {
    def this(reset: Boolean) = this()
  }
  
  @JSImport("babylonjs/States/index", "StencilState")
  @js.native
  open class StencilState ()
    extends typings.babylonjs.stencilStateMod.StencilState
  /* static members */
  object StencilState {
    
    /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
    @JSImport("babylonjs/States/index", "StencilState.ALWAYS")
    @js.native
    val ALWAYS: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be kept */
    @JSImport("babylonjs/States/index", "StencilState.KEEP")
    @js.native
    val KEEP: Double = js.native
    
    /** Passed to stencilOperation to specify that stencil value must be replaced */
    @JSImport("babylonjs/States/index", "StencilState.REPLACE")
    @js.native
    val REPLACE: Double = js.native
  }
  
  @JSImport("babylonjs/States/index", "StencilStateComposer")
  @js.native
  open class StencilStateComposer ()
    extends typings.babylonjs.stencilStateComposerMod.StencilStateComposer {
    def this(reset: Boolean) = this()
  }
}
