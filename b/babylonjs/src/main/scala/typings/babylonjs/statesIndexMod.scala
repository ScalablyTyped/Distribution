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
  class AlphaState ()
    extends typings.babylonjs.alphaCullingStateMod.AlphaState
  
  @JSImport("babylonjs/States/index", "DepthCullingState")
  @js.native
  /**
    * Initializes the state.
    */
  class DepthCullingState ()
    extends typings.babylonjs.depthCullingStateMod.DepthCullingState
  
  @JSImport("babylonjs/States/index", "StencilState")
  @js.native
  class StencilState ()
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
}
