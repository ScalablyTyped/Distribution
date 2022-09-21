package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Default
import typings.babylonjs.anon.Ubo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialPluginBase extends StObject {
  
  /* protected */ def _enable(enable: Boolean): Unit = js.native
  
  /* protected */ var _material: Material = js.native
  
  /* protected */ var _pluginDefineNames: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Any]] = js.native
  
  /* protected */ var _pluginManager: MaterialPluginManager = js.native
  
  /**
    * Add fallbacks to the effect fallbacks list.
    * @param defines defines the Base texture to use.
    * @param fallbacks defines the current fallback list.
    * @param currentRank defines the current fallback rank.
    * @returns the new fallback rank.
    */
  def addFallbacks(defines: MaterialDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  
  /**
    * Binds the material data.
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param engine the engine this scene belongs to.
    * @param subMesh the submesh to bind data for
    */
  def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, engine: Engine, subMesh: SubMesh): Unit = js.native
  
  /**
    * Collects all defines.
    * @param defines The object to append to.
    */
  def collectDefines(defines: org.scalablytyped.runtime.StringDictionary[Default]): Unit = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param plugin define the config where to copy the info
    */
  def copyTo(plugin: MaterialPluginBase): Unit = js.native
  
  /**
    * Disposes the resources of the material.
    * @param forceDisposeTextures - Forces the disposal of all textures.
    */
  def dispose(): Unit = js.native
  def dispose(forceDisposeTextures: Boolean): Unit = js.native
  
  /**
    * Fills the list of render target textures.
    * @param renderTargets the list of render targets to update
    */
  def fillRenderTargetTextures(renderTargets: SmartArray[RenderTargetTexture]): Unit = js.native
  
  /**
    * Returns an array of the actively used textures.
    * @param activeTextures Array of BaseTextures
    */
  def getActiveTextures(activeTextures: js.Array[BaseTexture]): Unit = js.native
  
  /**
    * Returns the animatable textures.
    * @param animatables Array of animatable textures.
    */
  def getAnimatables(animatables: js.Array[IAnimatable]): Unit = js.native
  
  /**
    * Gets the attributes used by the plugin.
    * @param attributes list that the attribute names should be added to.
    * @param scene the scene that the material belongs to.
    * @param mesh the mesh being rendered.
    */
  def getAttributes(attributes: js.Array[String], scene: Scene, mesh: AbstractMesh): Unit = js.native
  
  /**
    * Gets the current class name useful for serialization or dynamic coding.
    * @returns The class name.
    */
  def getClassName(): String = js.native
  
  /**
    * Returns a list of custom shader code fragments to customize the shader.
    * @param shaderType "vertex" or "fragment"
    * @returns null if no code to be added, or a list of pointName => code.
    * Note that `pointName` can also be a regular expression if it starts with a `!`.
    * In that case, the string found by the regular expression (if any) will be
    * replaced by the code provided.
    */
  def getCustomCode(shaderType: String): Nullable[org.scalablytyped.runtime.StringDictionary[String]] = js.native
  
  /**
    * Gets the samplers used by the plugin.
    * @param samplers list that the sampler names should be added to.
    */
  def getSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Gets the uniform buffers names added by the plugin.
    * @param ubos list that the ubo names should be added to.
    */
  def getUniformBuffersNames(ubos: js.Array[String]): Unit = js.native
  
  /**
    * Gets the description of the uniforms to add to the ubo (if engine supports ubos) or to inject directly in the vertex/fragment shaders (if engine does not support ubos)
    * @returns the description of the uniforms
    */
  def getUniforms(): Ubo = js.native
  
  /**
    * Binds the material data (this function is called even if mustRebind() returns false)
    * @param uniformBuffer defines the Uniform buffer to fill in.
    * @param scene defines the scene the material belongs to.
    * @param engine defines the engine the material belongs to.
    * @param subMesh the submesh to bind data for
    */
  def hardBindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, engine: Engine, subMesh: SubMesh): Unit = js.native
  
  /**
    * Gets a boolean indicating that current material needs to register RTT
    * @returns true if this uses a render target otherwise false.
    */
  def hasRenderTargetTextures(): Boolean = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param texture - Base texture to use.
    * @returns - Boolean specifying if a texture is used in the material.
    */
  def hasTexture(texture: BaseTexture): Boolean = js.native
  
  /**
    * Specifies that the submesh is ready to be used.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene the material belongs to.
    * @param engine the engine this scene belongs to.
    * @param subMesh the submesh to check for readiness
    * @returns - boolean indicating that the submesh is ready or not.
    */
  def isReadyForSubMesh(defines: MaterialDefines, scene: Scene, engine: Engine, subMesh: SubMesh): Boolean = js.native
  
  /**
    * Helper function to mark defines as being dirty.
    */
  def markAllDefinesAsDirty(): Unit = js.native
  
  /**
    * Defines the name of the plugin
    */
  var name: String = js.native
  
  /**
    * Parses a anisotropy Configuration from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Sets the defines for the next rendering
    * @param defines the list of "defines" to update.
    * @param scene defines the scene to the material belongs to.
    * @param mesh the mesh being rendered
    */
  def prepareDefines(defines: MaterialDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
  
  /**
    * Sets the defines for the next rendering. Called before MaterialHelper.PrepareDefinesForAttributes is called.
    * @param defines the list of "defines" to update.
    * @param scene defines the scene to the material belongs to.
    * @param mesh the mesh being rendered
    */
  def prepareDefinesBeforeAttributes(defines: MaterialDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
  
  /**
    * Defines the priority of the plugin. Lower numbers run first.
    */
  var priority: Double = js.native
  
  /**
    * Indicates that this plugin should be notified for the extra events (HasRenderTargetTextures / FillRenderTargetTextures / HardBindForSubMesh)
    */
  var registerForExtraEvents: Boolean = js.native
  
  /**
    * Serializes this clear coat configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): Any = js.native
}
