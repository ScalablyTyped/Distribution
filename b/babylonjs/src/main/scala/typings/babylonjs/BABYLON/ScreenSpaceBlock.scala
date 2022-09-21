package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenSpaceBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the vector input
    */
  def vector: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the worldViewProjection transform input
    */
  def worldViewProjection: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the x output component
    */
  def x: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the y output component
    */
  def y: NodeMaterialConnectionPoint = js.native
}
