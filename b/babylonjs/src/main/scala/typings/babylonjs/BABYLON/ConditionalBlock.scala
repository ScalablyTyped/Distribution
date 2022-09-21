package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the first operand component
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the second operand component
    */
  def b: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the condition applied by the block
    */
  var condition: ConditionalBlockConditions = js.native
  
  /**
    * Gets the value to return if condition is false
    */
  def `false`: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the value to return if condition is true
    */
  def `true`: NodeMaterialConnectionPoint = js.native
}
