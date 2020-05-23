package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * ActionManagers available on the scene.
    */
  var actionManagers: js.Array[AbstractActionManager]
  /**
    * All of the animation groups added to this scene
    * @see http://doc.babylonjs.com/how_to/group
    */
  var animationGroups: js.Array[AnimationGroup]
  /**
    * Gets a list of Animations associated with the scene
    */
  var animations: js.Array[Animation]
  /** All of the cameras added to this scene
    * @see http://doc.babylonjs.com/babylon101/cameras
    */
  var cameras: js.Array[Camera]
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer]
  /**
    * Environment texture for the scene
    */
  var environmentTexture: Nullable[BaseTexture]
  /**
    * The list of geometries used in the scene.
    */
  var geometries: js.Array[Geometry]
  /**
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer]
  /**
    * The list of lens flare system added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var lensFlareSystems: js.Array[LensFlareSystem]
  /**
    * All of the lights added to this scene
    * @see http://doc.babylonjs.com/babylon101/lights
    */
  var lights: js.Array[Light]
  /**
    * All of the materials added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addMaterial and removeMaterial Scene methods.
    * Note also that the order of the Material within the array is not significant and might change.
    * @see http://doc.babylonjs.com/babylon101/materials
    */
  var materials: js.Array[Material]
  /**
    * All of the (abstract) meshes added to this scene
    */
  var meshes: js.Array[AbstractMesh]
  /**
    * The list of morph target managers added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh
    */
  var morphTargetManagers: js.Array[MorphTargetManager]
  /**
    * All of the multi-materials added to this scene
    * @see http://doc.babylonjs.com/how_to/multi_materials
    */
  var multiMaterials: js.Array[MultiMaterial]
  /**
    * All of the particle systems added to this scene
    * @see http://doc.babylonjs.com/babylon101/particles
    */
  var particleSystems: js.Array[IParticleSystem]
  /**
    * The list of procedural textures added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  var proceduralTextures: js.Array[ProceduralTexture]
  /**
    * The list of reflection probes added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  var reflectionProbes: js.Array[ReflectionProbe]
  /**
    * Gets the list of root nodes (ie. nodes with no parent)
    */
  var rootNodes: js.Array[Node]
  /**
    * The list of skeletons added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  var skeletons: js.Array[Skeleton]
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]]
  /**
    * Textures to keep.
    */
  var textures: js.Array[BaseTexture]
  /**
    * All of the tranform nodes added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addTransformNode and removeTransformNode Scene methods.
    * Note also that the order of the TransformNode wihin the array is not significant and might change.
    * @see http://doc.babylonjs.com/how_to/transformnode
    */
  var transformNodes: js.Array[TransformNode]
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer]
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer]
  /**
    * Gets a lens flare system using its id
    * @param id defines the id to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem]
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem]
  /**
    * @returns all meshes, lights, cameras, transformNodes and bones
    */
  def getNodes(): js.Array[Node]
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): Double
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  def removeLensFlareSystem(toRemove: LensFlareSystem): Double
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  def removeReflectionProbe(toRemove: ReflectionProbe): Double
}

object AbstractScene {
  @scala.inline
  def apply(
    actionManagers: js.Array[AbstractActionManager],
    addEffectLayer: EffectLayer => Unit,
    addLensFlareSystem: LensFlareSystem => Unit,
    addReflectionProbe: ReflectionProbe => Unit,
    animationGroups: js.Array[AnimationGroup],
    animations: js.Array[Animation],
    cameras: js.Array[Camera],
    effectLayers: js.Array[EffectLayer],
    geometries: js.Array[Geometry],
    getGlowLayerByName: String => Nullable[GlowLayer],
    getHighlightLayerByName: String => Nullable[HighlightLayer],
    getLensFlareSystemByID: String => Nullable[LensFlareSystem],
    getLensFlareSystemByName: String => Nullable[LensFlareSystem],
    getNodes: () => js.Array[Node],
    layers: js.Array[Layer],
    lensFlareSystems: js.Array[LensFlareSystem],
    lights: js.Array[Light],
    materials: js.Array[Material],
    meshes: js.Array[AbstractMesh],
    morphTargetManagers: js.Array[MorphTargetManager],
    multiMaterials: js.Array[MultiMaterial],
    particleSystems: js.Array[IParticleSystem],
    proceduralTextures: js.Array[ProceduralTexture],
    reflectionProbes: js.Array[ReflectionProbe],
    removeEffectLayer: EffectLayer => Double,
    removeLensFlareSystem: LensFlareSystem => Double,
    removeReflectionProbe: ReflectionProbe => Double,
    rootNodes: js.Array[Node],
    skeletons: js.Array[Skeleton],
    textures: js.Array[BaseTexture],
    transformNodes: js.Array[TransformNode],
    environmentTexture: Nullable[BaseTexture] = null,
    sounds: Nullable[js.Array[Sound]] = null
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(actionManagers = actionManagers.asInstanceOf[js.Any], addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), animationGroups = animationGroups.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], effectLayers = effectLayers.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), getNodes = js.Any.fromFunction0(getNodes), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], materials = materials.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], morphTargetManagers = morphTargetManagers.asInstanceOf[js.Any], multiMaterials = multiMaterials.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe), rootNodes = rootNodes.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], transformNodes = transformNodes.asInstanceOf[js.Any], environmentTexture = environmentTexture.asInstanceOf[js.Any], sounds = sounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractScene]
  }
}

