package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowBlock extends NodeMaterialBlock {
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the power operand input component
    */
  def power: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the value operand input component
    */
  def value: NodeMaterialConnectionPoint = js.native
}
