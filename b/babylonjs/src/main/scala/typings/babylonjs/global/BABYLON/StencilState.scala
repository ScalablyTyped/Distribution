package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StencilState")
@js.native
class StencilState ()
  extends typings.babylonjs.BABYLON.StencilState
/* static members */
object StencilState {
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSGlobal("BABYLON.StencilState.ALWAYS")
  @js.native
  val ALWAYS: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSGlobal("BABYLON.StencilState.KEEP")
  @js.native
  val KEEP: Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSGlobal("BABYLON.StencilState.REPLACE")
  @js.native
  val REPLACE: Double = js.native
}
