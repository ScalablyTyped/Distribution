package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ReflectBlock")
@js.native
class ReflectBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new ReflectBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the incident component
    */
  def incident(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the normal component
    */
  def normal(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
}

