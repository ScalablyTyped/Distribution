package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LightBlock")
@js.native
class LightBlock protected () extends NodeMaterialBlock {
  /**
    * Create a new LightBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  var _injectVertexCode: js.Any = js.native
  var _lightId: js.Any = js.native
  /**
    * Gets or sets the light associated with this block
    */
  var light: Nullable[Light] = js.native
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
    * Gets the glossinness power component
    */
  def glossPower: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the glossiness component
    */
  def glossiness: NodeMaterialConnectionPoint = js.native
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
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

