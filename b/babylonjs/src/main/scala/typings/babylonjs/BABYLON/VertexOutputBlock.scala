package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VertexOutputBlock")
@js.native
class VertexOutputBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new VertexOutputBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the vector input component
    */
  def vector(): NodeMaterialConnectionPoint = js.native
}

