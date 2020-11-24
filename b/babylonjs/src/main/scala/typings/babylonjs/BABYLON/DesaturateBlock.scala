package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesaturateBlock extends NodeMaterialBlock {
  
  /**
    * Gets the color operand input component
    */
  def color: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the level operand input component
    */
  def level: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
