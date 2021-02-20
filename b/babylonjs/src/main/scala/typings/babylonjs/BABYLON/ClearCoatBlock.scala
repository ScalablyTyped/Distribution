package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCoatBlock extends NodeMaterialBlock {
  
  var _generateTBNSpace: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  /**
    * Gets the clear coat object output component
    */
  def clearcoat: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the ior input component
    */
  def indexOfRefraction: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the intensity input component
    */
  def intensity: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the bump texture input component
    */
  def normalMapColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Defines if the F0 value should be remapped to account for the interface change in the material.
    */
  var remapF0OnInterfaceChange: Boolean = js.native
  
  /**
    * Gets the roughness input component
    */
  def roughness: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tint "at distance" input component
    */
  def tintAtDistance: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tint color input component
    */
  def tintColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the tint thickness input component
    */
  def tintThickness: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the uv input component
    */
  def uv: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world tangent input component
    */
  def worldTangent: NodeMaterialConnectionPoint = js.native
}
