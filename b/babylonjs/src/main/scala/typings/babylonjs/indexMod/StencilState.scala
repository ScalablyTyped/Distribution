package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "StencilState")
@js.native
class StencilState ()
  extends typings.babylonjs.statesIndexMod.StencilState
/* static members */
object StencilState {
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSImport("babylonjs/index", "StencilState.ALWAYS")
  @js.native
  val ALWAYS: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSImport("babylonjs/index", "StencilState.KEEP")
  @js.native
  val KEEP: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSImport("babylonjs/index", "StencilState.REPLACE")
  @js.native
  val REPLACE: Double = js.native
}
