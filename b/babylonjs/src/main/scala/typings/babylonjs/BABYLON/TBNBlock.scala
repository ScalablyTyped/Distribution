package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TBNBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the TBN output component
    */
  def TBN: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the normal input component
    */
  def normal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the row0 of the output matrix
    */
  def row0: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the row1 of the output matrix
    */
  def row1: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the row2 of the output matrix
    */
  def row2: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tangent input component
    */
  def tangent: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world matrix input component
    */
  def world: NodeMaterialConnectionPoint = js.native
}
