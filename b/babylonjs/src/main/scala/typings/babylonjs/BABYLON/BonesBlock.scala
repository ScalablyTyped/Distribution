package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BonesBlock")
@js.native
class BonesBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new BonesBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the matrix indices input component
    */
  def matricesIndices: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the extra matrix indices input component
    */
  def matricesIndicesExtra: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the matrix weights input component
    */
  def matricesWeights: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the extra matrix weights input component
    */
  def matricesWeightsExtra: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world input component
    */
  def world: NodeMaterialConnectionPoint = js.native
}

