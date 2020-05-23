package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSplitterBlock extends NodeMaterialBlock {
  /**
    * Gets the a component (output)
    */
  def a: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the b component (output)
    */
  def b: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the g component (output)
    */
  def g: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the r component (output)
    */
  def r: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the rgb component (input)
    */
  def rgbIn: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the rgb component (output)
    */
  def rgbOut: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the rgba component (input)
    */
  def rgba: NodeMaterialConnectionPoint = js.native
}

