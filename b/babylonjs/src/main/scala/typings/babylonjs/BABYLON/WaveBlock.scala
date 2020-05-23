package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveBlock extends NodeMaterialBlock {
  /**
    * Gets or sets the kibnd of wave to be applied by the block
    */
  var kind: WaveBlockKind = js.native
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}

