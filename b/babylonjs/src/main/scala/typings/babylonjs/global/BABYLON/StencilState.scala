package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StencilState")
@js.native
open class StencilState ()
  extends StObject
     with typings.babylonjs.BABYLON.StencilState {
  
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
}
/* static members */
object StencilState {
  
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  @JSGlobal("BABYLON.StencilState.ALWAYS")
  @js.native
  val ALWAYS: /* 519 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be kept */
  @JSGlobal("BABYLON.StencilState.KEEP")
  @js.native
  val KEEP: /* 7680 */ Double = js.native
  
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  @JSGlobal("BABYLON.StencilState.REPLACE")
  @js.native
  val REPLACE: /* 7681 */ Double = js.native
}
