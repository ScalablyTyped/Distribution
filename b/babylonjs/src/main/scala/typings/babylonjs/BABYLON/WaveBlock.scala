package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WaveBlock")
@js.native
class WaveBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new WaveBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets or sets the kibnd of wave to be applied by the block
    */
  var kind: WaveBlockKind = js.native
  /**
    * Gets the input component
    */
  def input(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

