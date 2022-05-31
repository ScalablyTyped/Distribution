package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FogBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _fogDistanceName: js.Any = js.native
  
  /* private */ var _fogParameters: js.Any = js.native
  
  /**
    * Gets the fog color input component
    */
  def fogColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the color input component
    */
  def input: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the view input component
    */
  def view: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}
