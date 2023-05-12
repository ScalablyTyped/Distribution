package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends StObject {
  
  /** @internal */
  /* protected */ var _environmentTexture: Nullable[BaseTexture] = js.native
  
  /** @internal (Backing field) */
  var _fluidRenderer: Nullable[FluidRenderer] = js.native
  
  /** @internal (Backing field) */
  var _prePassRenderer: Nullable[PrePassRenderer] = js.native
  
  /** @internal (Backing field) */
  var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
  
  /**
    * ActionManagers available on the scene.
    * @deprecated
    */
  var actionManagers: js.Array[AbstractActionManager] = js.native
  
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): Unit = js.native
  
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit = js.native
  
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  def addReflectionProbe(newReflectionProbe: ReflectionProbe): Unit = js.native
  
  /**
    * All of the animation groups added to this scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/animation/groupAnimations
    */
  var animationGroups: js.Array[AnimationGroup] = js.native
  
  /**
    * Gets a list of Animations associated with the scene
    */
  var animations: js.Array[Animation] = js.native
  
  /** All of the cameras added to this scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras
    */
  var cameras: js.Array[Camera] = js.native
  
  /**
    * Disables the fluid renderer associated with the scene
    */
  def disableFluidRenderer(): Unit = js.native
  
  /**
    * Disables the prepass associated with the scene
    */
  def disablePrePassRenderer(): Unit = js.native
  
  /**
    * Disables the subsurface effect for prepass
    */
  def disableSubSurfaceForPrePass(): Unit = js.native
  
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/highlightLayer
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/glowLayer
    */
  var effectLayers: js.Array[EffectLayer] = js.native
  
  /**
    * Enables the fluid renderer and associates it with the scene
    * @returns the FluidRenderer
    */
  def enableFluidRenderer(): Nullable[FluidRenderer] = js.native
  
  /**
    * Enables the prepass and associates it with the scene
    * @returns the PrePassRenderer
    */
  def enablePrePassRenderer(): Nullable[PrePassRenderer] = js.native
  
  /**
    * Enables the subsurface effect for prepass
    * @returns the SubSurfaceConfiguration
    */
  def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
  
  /**
    * Texture used in all pbr material as the reflection texture.
    * As in the majority of the scene they are the same (exception for multi room and so on),
    * this is easier to reference from here than from all the materials.
    */
  def environmentTexture: Nullable[BaseTexture] = js.native
  def environmentTexture_=(value: Nullable[BaseTexture]): Unit = js.native
  
  /**
    * Gets or Sets the fluid renderer associated to the scene.
    */
  var fluidRenderer: Nullable[FluidRenderer] = js.native
  
  /**
    * The list of geometries used in the scene.
    */
  var geometries: js.Array[Geometry] = js.native
  
  /**
    * Return the first glow layer of the scene with a given name.
    * @param name The name of the glow layer to look for.
    * @returns The glow layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer] = js.native
  
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @returns The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer] = js.native
  
  /**
    * Gets a lens flare system using its Id
    * @param id defines the Id to look for
    * @returns the lens flare system or null if not found
    * @deprecated Please use getLensFlareSystemById instead
    */
  def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem] = js.native
  
  /**
    * Gets a lens flare system using its Id
    * @param id defines the Id to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemById(id: String): Nullable[LensFlareSystem] = js.native
  
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem] = js.native
  
  /**
    * @returns all meshes, lights, cameras, transformNodes and bones
    */
  def getNodes(): js.Array[Node] = js.native
  
  /**
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer] = js.native
  
  /**
    * The list of lens flare system added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/lenseFlare
    */
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  
  /**
    * All of the lights added to this scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/lights/lights_introduction
    */
  var lights: js.Array[Light] = js.native
  
  /**
    * All of the materials added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addMaterial and removeMaterial Scene methods.
    * Note also that the order of the Material within the array is not significant and might change.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/materials_introduction
    */
  var materials: js.Array[Material] = js.native
  
  /**
    * All of the (abstract) meshes added to this scene
    */
  var meshes: js.Array[AbstractMesh] = js.native
  
  /**
    * The list of morph target managers added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/dynamicMeshMorph
    */
  var morphTargetManagers: js.Array[MorphTargetManager] = js.native
  
  /**
    * All of the multi-materials added to this scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/multiMaterials
    */
  var multiMaterials: js.Array[MultiMaterial] = js.native
  
  /**
    * All of the particle systems added to this scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/particles/particle_system/particle_system_intro
    */
  var particleSystems: js.Array[IParticleSystem] = js.native
  
  /**
    * The list of postprocesses added to the scene
    */
  var postProcesses: js.Array[PostProcess] = js.native
  
  /**
    * Gets or Sets the current prepass renderer associated to the scene.
    */
  var prePassRenderer: Nullable[PrePassRenderer] = js.native
  
  /**
    * The list of procedural textures added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures
    */
  var proceduralTextures: js.Array[ProceduralTexture] = js.native
  
  /**
    * The list of reflection probes added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/reflectionProbes
    */
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): Double = js.native
  
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  def removeLensFlareSystem(toRemove: LensFlareSystem): Double = js.native
  
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  def removeReflectionProbe(toRemove: ReflectionProbe): Double = js.native
  
  /**
    * Gets the list of root nodes (ie. nodes with no parent)
    */
  var rootNodes: js.Array[Node] = js.native
  
  /**
    * The list of skeletons added to the scene
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/bonesSkeletons
    */
  var skeletons: js.Array[Skeleton] = js.native
  
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
  
  /**
    * Gets or Sets the current prepass renderer associated to the scene.
    */
  var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
  
  /**
    * Textures to keep.
    */
  var textures: js.Array[BaseTexture] = js.native
  
  /**
    * All of the transform nodes added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addTransformNode and removeTransformNode Scene methods.
    * Note also that the order of the TransformNode within the array is not significant and might change.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/transforms/parent_pivot/transform_node
    */
  var transformNodes: js.Array[TransformNode] = js.native
}
