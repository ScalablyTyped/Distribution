package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the left operand input component
    */
  def left: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the right operand input component
    */
  def right: NodeMaterialConnectionPoint = js.native
}
