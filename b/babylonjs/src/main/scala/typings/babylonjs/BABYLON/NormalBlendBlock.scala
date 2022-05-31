package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalBlendBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the first input component
    */
  def normalMap0: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the second input component
    */
  def normalMap1: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
}
