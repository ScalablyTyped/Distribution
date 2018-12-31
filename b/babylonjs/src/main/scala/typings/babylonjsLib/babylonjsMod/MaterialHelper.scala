package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * "Static Class" containing the most commonly used helper while dealing with material for
  * rendering purpose.
  *
  * It contains the basic tools to help defining defines, binding uniform for the common part of the materials.
  *
  * This works by convention in BabylonJS but is meant to be use only with shader following the in place naming rules and conventions.
  */
@JSImport("babylonjs", "MaterialHelper")
@js.native
class MaterialHelper ()
  extends babylonjsLib.BABYLONNs.MaterialHelper

/**
  * "Static Class" containing the most commonly used helper while dealing with material for
  * rendering purpose.
  *
  * It contains the basic tools to help defining defines, binding uniform for the common part of the materials.
  *
  * This works by convention in BabylonJS but is meant to be use only with shader following the in place naming rules and conventions.
  */
@JSImport("babylonjs", "MaterialHelper")
@js.native
object MaterialHelper extends js.Object {
  var _tempFogColor: js.Any = js.native
  /**
    * Binds the bones information from the mesh to the effect.
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    */
  def BindBonesParameters(): scala.Unit = js.native
  def BindBonesParameters(mesh: babylonjsLib.BABYLONNs.AbstractMesh): scala.Unit = js.native
  def BindBonesParameters(mesh: babylonjsLib.BABYLONNs.AbstractMesh, effect: babylonjsLib.BABYLONNs.Effect): scala.Unit = js.native
  /**
    * Binds the clip plane information from the scene to the effect.
    * @param scene The scene the clip plane information are extracted from
    * @param effect The effect we are binding the data to
    */
  def BindClipPlane(effect: babylonjsLib.BABYLONNs.Effect, scene: babylonjsLib.BABYLONNs.Scene): scala.Unit = js.native
  /**
    * Bind the current view position to an effect.
    * @param effect The effect to be bound
    * @param scene The scene the eyes position is used from
    */
  def BindEyePosition(effect: babylonjsLib.BABYLONNs.Effect, scene: babylonjsLib.BABYLONNs.Scene): scala.Unit = js.native
  /**
    * Binds the fog information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param linearSpace Defines if the fog effect is applied in linear space
    */
  def BindFogParameters(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    effect: babylonjsLib.BABYLONNs.Effect
  ): scala.Unit = js.native
  def BindFogParameters(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    effect: babylonjsLib.BABYLONNs.Effect,
    linearSpace: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Binds the light information to the effect.
    * @param light The light containing the generator
    * @param effect The effect we are binding the data to
    * @param lightIndex The light index in the effect used to render
    */
  def BindLightProperties(
    light: babylonjsLib.BABYLONNs.Light,
    effect: babylonjsLib.BABYLONNs.Effect,
    lightIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Binds the light shadow information to the effect for the given mesh.
    * @param light The light containing the generator
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param lightIndex The light index in the effect used to render the mesh
    * @param effect The effect we are binding the data to
    */
  def BindLightShadow(
    light: babylonjsLib.BABYLONNs.Light,
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    lightIndex: java.lang.String,
    effect: babylonjsLib.BABYLONNs.Effect
  ): scala.Unit = js.native
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param defines The generated defines for the effect
    * @param maxSimultaneousLights The maximum number of light that can be bound to the effect
    * @param usePhysicalLightFalloff Specifies whether the light falloff is defined physically or not
    */
  def BindLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    effect: babylonjsLib.BABYLONNs.Effect,
    defines: js.Any
  ): scala.Unit = js.native
  def BindLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    effect: babylonjsLib.BABYLONNs.Effect,
    defines: js.Any,
    maxSimultaneousLights: scala.Double
  ): scala.Unit = js.native
  def BindLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    effect: babylonjsLib.BABYLONNs.Effect,
    defines: js.Any,
    maxSimultaneousLights: scala.Double,
    usePhysicalLightFalloff: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Binds the logarithmic depth information from the scene to the effect for the given defines.
    * @param defines The generated defines used in the effect
    * @param effect The effect we are binding the data to
    * @param scene The scene we are willing to render with logarithmic scale for
    */
  def BindLogDepth(defines: js.Any, effect: babylonjsLib.BABYLONNs.Effect, scene: babylonjsLib.BABYLONNs.Scene): scala.Unit = js.native
  /**
    * Binds the morph targets information from the mesh to the effect.
    * @param abstractMesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    */
  def BindMorphTargetParameters(abstractMesh: babylonjsLib.BABYLONNs.AbstractMesh, effect: babylonjsLib.BABYLONNs.Effect): scala.Unit = js.native
  /**
    * Binds a texture matrix value to its corrsponding uniform
    * @param texture The texture to bind the matrix for
    * @param uniformBuffer The uniform buffer receivin the data
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  def BindTextureMatrix(
    texture: babylonjsLib.BABYLONNs.BaseTexture,
    uniformBuffer: babylonjsLib.BABYLONNs.UniformBuffer,
    key: java.lang.String
  ): scala.Unit = js.native
  /**
    * This helps decreasing rank by rank the shadow quality (0 being the highest rank and quality)
    * @param defines The defines to update while falling back
    * @param fallbacks The authorized effect fallbacks
    * @param maxSimultaneousLights The maximum number of lights allowed
    * @param rank the current rank of the Effect
    * @returns The newly affected rank
    */
  def HandleFallbacksForShadows(defines: js.Any, fallbacks: babylonjsLib.BABYLONNs.EffectFallbacks): scala.Double = js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: babylonjsLib.BABYLONNs.EffectFallbacks,
    maxSimultaneousLights: scala.Double
  ): scala.Double = js.native
  def HandleFallbacksForShadows(
    defines: js.Any,
    fallbacks: babylonjsLib.BABYLONNs.EffectFallbacks,
    maxSimultaneousLights: scala.Double,
    rank: scala.Double
  ): scala.Double = js.native
  /**
    * Prepares the list of attributes required for bones according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the bones attributes for
    * @param defines The current Defines of the effect
    * @param fallbacks The current efffect fallback strategy
    */
  def PrepareAttributesForBones(
    attribs: js.Array[java.lang.String],
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    fallbacks: babylonjsLib.BABYLONNs.EffectFallbacks
  ): scala.Unit = js.native
  /**
    * Prepares the list of attributes required for instances according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param defines The current Defines of the effect
    */
  def PrepareAttributesForInstances(attribs: js.Array[java.lang.String], defines: js.Any): scala.Unit = js.native
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param defines The current Defines of the effect
    */
  def PrepareAttributesForMorphTargets(attribs: js.Array[java.lang.String], mesh: babylonjsLib.BABYLONNs.AbstractMesh, defines: js.Any): scala.Unit = js.native
  /**
    * Prepares the defines used in the shader depending on the attributes data available in the mesh
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    * @param useVertexColor Precise whether vertex colors should be used or not (override mesh info)
    * @param useBones Precise whether bones should be used or not (override mesh info)
    * @param useMorphTargets Precise whether morph targets should be used or not (override mesh info)
    * @param useVertexAlpha Precise whether vertex alpha should be used or not (override mesh info)
    * @returns false if defines are considered not dirty and have not been checked
    */
  def PrepareDefinesForAttributes(
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    useVertexColor: scala.Boolean,
    useBones: scala.Boolean
  ): scala.Boolean = js.native
  def PrepareDefinesForAttributes(
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    useVertexColor: scala.Boolean,
    useBones: scala.Boolean,
    useMorphTargets: scala.Boolean
  ): scala.Boolean = js.native
  def PrepareDefinesForAttributes(
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    useVertexColor: scala.Boolean,
    useBones: scala.Boolean,
    useMorphTargets: scala.Boolean,
    useVertexAlpha: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Helper used to prepare the list of defines associated with frame values for shader compilation
    * @param scene defines the current scene
    * @param engine defines the current engine
    * @param defines specifies the list of active defines
    * @param useInstances defines if instances have to be turned on
    * @param useClipPlane defines if clip plane have to be turned on
    */
  def PrepareDefinesForFrameBoundValues(
    scene: babylonjsLib.BABYLONNs.Scene,
    engine: babylonjsLib.BABYLONNs.Engine,
    defines: js.Any,
    useInstances: scala.Boolean
  ): scala.Unit = js.native
  def PrepareDefinesForFrameBoundValues(
    scene: babylonjsLib.BABYLONNs.Scene,
    engine: babylonjsLib.BABYLONNs.Engine,
    defines: js.Any,
    useInstances: scala.Boolean,
    useClipPlane: babylonjsLib.BABYLONNs.Nullable[scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param maxSimultaneousLights Specfies how manuy lights can be added to the effect at max
    * @param disableLighting Specifies whether the lighting is disabled (override scene and light)
    * @returns true if normals will be required for the rest of the effect
    */
  def PrepareDefinesForLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    specularSupported: scala.Boolean
  ): scala.Boolean = js.native
  def PrepareDefinesForLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    specularSupported: scala.Boolean,
    maxSimultaneousLights: scala.Double
  ): scala.Boolean = js.native
  def PrepareDefinesForLights(
    scene: babylonjsLib.BABYLONNs.Scene,
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    defines: js.Any,
    specularSupported: scala.Boolean,
    maxSimultaneousLights: scala.Double,
    disableLighting: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Helps preparing the defines values about the UVs in used in the effect.
    * UVs are shared as much as we can accross channels in the shaders.
    * @param texture The texture we are preparing the UVs for
    * @param defines The defines to update
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  def PrepareDefinesForMergedUV(texture: babylonjsLib.BABYLONNs.BaseTexture, defines: js.Any, key: java.lang.String): scala.Unit = js.native
  /**
    * Helper used to prepare the list of defines associated with misc. values for shader compilation
    * @param mesh defines the current mesh
    * @param scene defines the current scene
    * @param useLogarithmicDepth defines if logarithmic depth has to be turned on
    * @param pointsCloud defines if point cloud rendering has to be turned on
    * @param fogEnabled defines if fog has to be turned on
    * @param alphaTest defines if alpha testing has to be turned on
    * @param defines defines the current list of defines
    */
  def PrepareDefinesForMisc(
    mesh: babylonjsLib.BABYLONNs.AbstractMesh,
    scene: babylonjsLib.BABYLONNs.Scene,
    useLogarithmicDepth: scala.Boolean,
    pointsCloud: scala.Boolean,
    fogEnabled: scala.Boolean,
    alphaTest: scala.Boolean,
    defines: js.Any
  ): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions,
    samplersList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions,
    samplersList: js.Array[java.lang.String],
    defines: js.Any
  ): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions,
    samplersList: js.Array[java.lang.String],
    defines: js.Any,
    maxSimultaneousLights: scala.Double
  ): scala.Unit = js.native
  /**
    * Prepares the uniforms and samplers list to be used in the effect. This can automatically remove from the list uniforms
    * that won t be acctive due to defines being turned off.
    * @param uniformsListOrOptions The uniform names to prepare or an EffectCreationOptions containing the liist and extra information
    * @param samplersList The samplers list
    * @param defines The defines helping in the list generation
    * @param maxSimultaneousLights The maximum number of simultanous light allowed in the effect
    */
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[java.lang.String]): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[java.lang.String], samplersList: js.Array[java.lang.String]): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[java.lang.String],
    samplersList: js.Array[java.lang.String],
    defines: js.Any
  ): scala.Unit = js.native
  def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[java.lang.String],
    samplersList: js.Array[java.lang.String],
    defines: js.Any,
    maxSimultaneousLights: scala.Double
  ): scala.Unit = js.native
}

