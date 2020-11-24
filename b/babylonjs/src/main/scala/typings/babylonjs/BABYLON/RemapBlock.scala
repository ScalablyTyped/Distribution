package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemapBlock extends NodeMaterialBlock {
  
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the source max input component
    */
  def sourceMax: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the source min input component
    */
  def sourceMin: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the source range
    */
  var sourceRange: Vector2 = js.native
  
  /**
    * Gets the target max input component
    */
  def targetMax: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the target min input component
    */
  def targetMin: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the target range
    */
  var targetRange: Vector2 = js.native
}
