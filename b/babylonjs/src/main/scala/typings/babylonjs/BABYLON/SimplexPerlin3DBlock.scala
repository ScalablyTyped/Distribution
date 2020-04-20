package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SimplexPerlin3DBlock")
@js.native
class SimplexPerlin3DBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new SimplexPerlin3DBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the seed operand input component
    */
  def seed: NodeMaterialConnectionPoint = js.native
}

