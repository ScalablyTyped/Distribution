package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StencilState")
@js.native
class StencilState ()
  extends typings.babylonjs.BABYLON.StencilState

/* static members */
@JSGlobal("BABYLON.StencilState")
@js.native
object StencilState extends js.Object {
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: Double = js.native
}

