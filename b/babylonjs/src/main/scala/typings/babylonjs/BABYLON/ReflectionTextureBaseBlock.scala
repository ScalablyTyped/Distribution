package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReflectionTextureBaseBlock extends NodeMaterialBlock {
  
  /** @hidden */
  var _2DSamplerName: String = js.native
  
  /** @hidden */
  var _cubeSamplerName: String = js.native
  
  /** @hidden */
  var _define3DName: String = js.native
  
  /** @hidden */
  var _defineCubicName: String = js.native
  
  /** @hidden */
  var _defineEquirectangularFixedName: String = js.native
  
  /** @hidden */
  var _defineEquirectangularName: String = js.native
  
  /** @hidden */
  var _defineExplicitName: String = js.native
  
  /** @hidden */
  var _defineLocalCubicName: String = js.native
  
  /** @hidden */
  var _defineMirroredEquirectangularFixedName: String = js.native
  
  /** @hidden */
  var _defineOppositeZ: String = js.native
  
  /** @hidden */
  var _definePlanarName: String = js.native
  
  /** @hidden */
  var _defineProjectionName: String = js.native
  
  /** @hidden */
  var _defineSkyboxName: String = js.native
  
  /** @hidden */
  var _defineSphericalName: String = js.native
  
  var _directionWName: String = js.native
  
  /* protected */ def _getTexture(): Nullable[BaseTexture] = js.native
  
  var _positionUVWName: String = js.native
  
  var _reflectionColorName: String = js.native
  
  /** @hidden */
  var _reflectionCoordsName: String = js.native
  
  /** @hidden */
  var _reflectionMatrixName: String = js.native
  
  var _reflectionVectorName: String = js.native
  
  /**
    * Gets the camera (or eye) position component
    */
  def cameraPosition: NodeMaterialConnectionPoint = js.native
  
  /**
    * Generates the reflection color code for the fragment code path
    * @param lodVarName name of the lod variable
    * @param swizzleLookupTexture swizzle to use for the final color variable
    * @returns the shader code
    */
  def handleFragmentSideCodeReflectionColor(): String = js.native
  def handleFragmentSideCodeReflectionColor(lodVarName: js.UndefOr[scala.Nothing], swizzleLookupTexture: String): String = js.native
  def handleFragmentSideCodeReflectionColor(lodVarName: String): String = js.native
  def handleFragmentSideCodeReflectionColor(lodVarName: String, swizzleLookupTexture: String): String = js.native
  
  /**
    * Generates the reflection coords code for the fragment code path
    * @param worldNormalVarName name of the world normal variable
    * @param worldPos name of the world position variable. If not provided, will use the world position connected to this block
    * @param onlyReflectionVector if true, generates code only for the reflection vector computation, not for the reflection coordinates
    * @returns the shader code
    */
  def handleFragmentSideCodeReflectionCoords(worldNormalVarName: String): String = js.native
  def handleFragmentSideCodeReflectionCoords(worldNormalVarName: String, worldPos: js.UndefOr[scala.Nothing], onlyReflectionVector: Boolean): String = js.native
  def handleFragmentSideCodeReflectionCoords(worldNormalVarName: String, worldPos: String): String = js.native
  def handleFragmentSideCodeReflectionCoords(worldNormalVarName: String, worldPos: String, onlyReflectionVector: Boolean): String = js.native
  
  /**
    * Handles the inits for the fragment code path
    * @param state node material build state
    */
  def handleFragmentSideInits(state: NodeMaterialBuildState): Unit = js.native
  
  /**
    * Gets the code to inject in the vertex shader
    * @param state current state of the node material building
    * @returns the shader code
    */
  def handleVertexSide(state: NodeMaterialBuildState): String = js.native
  
  def isReady(): Boolean = js.native
  
  /**
    * Gets the world position input component
    */
  def position: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the texture associated with the node
    */
  var texture: Nullable[BaseTexture] = js.native
  
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
  
  /**
    * Generates the code corresponding to the connected output points
    * @param state node material build state
    * @param varName name of the variable to output
    * @returns the shader code
    */
  def writeOutputs(state: NodeMaterialBuildState, varName: String): String = js.native
}
