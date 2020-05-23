package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FogBlock extends NodeMaterialBlock {
  var _fogDistanceName: js.Any = js.native
  var _fogParameters: js.Any = js.native
  /**
    * Gets the fog color input component
    */
  def fogColor: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the color input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the view input component
    */
  def view: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

