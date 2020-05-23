package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DerivativeBlock extends NodeMaterialBlock {
  /**
    * Gets the derivative output on x
    */
  def dx: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the derivative output on y
    */
  def dy: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
}

