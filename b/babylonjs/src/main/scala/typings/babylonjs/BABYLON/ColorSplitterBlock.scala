package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSplitterBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the a component (output)
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the b component (output)
    */
  def b: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the g component (output)
    */
  def g: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the r component (output)
    */
  def r: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (input)
    */
  def rgbIn: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (output)
    */
  def rgbOut: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgba component (input)
    */
  def rgba: NodeMaterialConnectionPoint = js.native
}
