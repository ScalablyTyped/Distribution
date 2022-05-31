package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrigonometryBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the operation applied by the block
    */
  var operation: TrigonometryBlockOperations = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
