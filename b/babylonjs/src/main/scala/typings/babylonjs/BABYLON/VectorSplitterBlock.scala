package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VectorSplitterBlock")
@js.native
class VectorSplitterBlock protected () extends NodeMaterialBlock {
  /**
    * Create a new VectorSplitterBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  /**
    * Gets the w component (output)
    */
  def w(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the x component (output)
    */
  def x(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the xy component (input)
    */
  def xyIn(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the xy component (output)
    */
  def xyOut(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the xyz component (input)
    */
  def xyzIn(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the xyz component (output)
    */
  def xyzOut(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the xyzw component (input)
    */
  def xyzw(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the y component (output)
    */
  def y(): NodeMaterialConnectionPoint = js.native
  /**
    * Gets the z component (output)
    */
  def z(): NodeMaterialConnectionPoint = js.native
}

