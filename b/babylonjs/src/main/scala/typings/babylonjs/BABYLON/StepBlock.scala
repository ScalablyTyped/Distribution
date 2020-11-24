package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepBlock extends NodeMaterialBlock {
  
  /**
    * Gets the edge operand input component
    */
  def edge: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the value operand input component
    */
  def value: NodeMaterialConnectionPoint = js.native
}
