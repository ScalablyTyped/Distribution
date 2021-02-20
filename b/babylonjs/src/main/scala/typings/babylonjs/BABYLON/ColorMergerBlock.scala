package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMergerBlock extends NodeMaterialBlock {
  
  /**
    * Gets the a component (input)
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the b component (input)
    */
  def b: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the g component (input)
    */
  def g: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the r component (input)
    */
  def r: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (output)
    * @deprecated Please use rgbOut instead.
    */
  def rgb: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (input)
    */
  def rgbIn: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (output)
    */
  def rgbOut: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgba component (output)
    */
  def rgba: NodeMaterialConnectionPoint = js.native
}
