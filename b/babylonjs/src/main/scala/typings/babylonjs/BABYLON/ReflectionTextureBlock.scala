package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ReflectionTextureBlock")
@js.native
class ReflectionTextureBlock protected () extends NodeMaterialBlock {
  /**
    * Create a new TextureBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
  var _2DSamplerName: js.Any = js.native
  var _cubeSamplerName: js.Any = js.native
  var _define3DName: js.Any = js.native
  var _defineCubicName: js.Any = js.native
  var _defineEquirectangularFixedName: js.Any = js.native
  var _defineEquirectangularName: js.Any = js.native
  var _defineExplicitName: js.Any = js.native
  var _defineLocalCubicName: js.Any = js.native
  var _defineMirroredEquirectangularFixedName: js.Any = js.native
  var _definePlanarName: js.Any = js.native
  var _defineProjectionName: js.Any = js.native
  var _defineSkyboxName: js.Any = js.native
  var _defineSphericalName: js.Any = js.native
  var _directionWName: js.Any = js.native
  var _injectVertexCode: js.Any = js.native
  var _positionUVWName: js.Any = js.native
  var _reflection2DCoordsName: js.Any = js.native
  var _reflectionColorName: js.Any = js.native
  var _reflectionCoordsName: js.Any = js.native
  var _reflectionMatrixName: js.Any = js.native
  var _writeOutput: js.Any = js.native
  /**
    * Gets or sets the texture associated with the node
    */
  var texture: Nullable[BaseTexture] = js.native
  /**
    * Gets the b output component
    */
  def b: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the camera (or eye) position component
    */
  def cameraPosition: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the g output component
    */
  def g: NodeMaterialConnectionPoint = js.native
  def isReady(): Boolean = js.native
  /**
    * Gets the world position input component
    */
  def position: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the r output component
    */
  def r: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the rgb output component
    */
  def rgb: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the view input component
    */
  def view: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world input component
    */
  def world: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world position input component
    */
  def worldPosition: NodeMaterialConnectionPoint = js.native
}

