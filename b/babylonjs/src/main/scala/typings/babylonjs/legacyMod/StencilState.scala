package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "StencilState")
@js.native
class StencilState ()
  extends typings.babylonjs.indexMod.StencilState
/* static members */
object StencilState {
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSImport("babylonjs/Legacy/legacy", "StencilState.ALWAYS")
  @js.native
  val ALWAYS: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSImport("babylonjs/Legacy/legacy", "StencilState.KEEP")
  @js.native
  val KEEP: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSImport("babylonjs/Legacy/legacy", "StencilState.REPLACE")
  @js.native
  val REPLACE: Double = js.native
}
