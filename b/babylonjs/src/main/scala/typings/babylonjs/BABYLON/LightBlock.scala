package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _injectVertexCode: Any = js.native
  
  /* private */ var _lightId: Any = js.native
  
  /**
    * Gets the camera (or eye) position component
    */
  def cameraPosition: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the diffuse color component
    */
  def diffuseColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the diffuse output component
    */
  def diffuseOutput: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the glossiness power component
    */
  def glossPower: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the glossiness component
    */
  def glossiness: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the light associated with this block
    */
  var light: Nullable[Light] = js.native
  
  /**
    * Gets the shadow output component
    */
  def shadow: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the specular color component
    */
  def specularColor: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the specular output component
    */
  def specularOutput: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the view matrix component
    */
  def view: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}
