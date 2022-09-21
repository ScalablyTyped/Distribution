package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the chaos input component
    */
  def chaos: NodeMaterialConnectionPoint = js.native
  
  /** Gets or sets the number of octaves */
  var octaves: Double = js.native
  
  /**
    * Gets the offset X input component
    */
  def offsetX: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the offset Y input component
    */
  def offsetY: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the offset Z input component
    */
  def offsetZ: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the seed input component
    */
  def seed: NodeMaterialConnectionPoint = js.native
}
