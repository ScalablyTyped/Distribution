package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of the scene acting as a container for the different elements composing a scene.
  * This class is dynamically extended by the different components of the scene increasing
  * flexibility and reducing coupling
  */
@JSGlobal("BABYLON.AbstractScene")
@js.native
abstract class AbstractScene () extends js.Object {
  /**
    * ActionManagers available on the scene.
    */
  var actionManagers: js.Array[ActionManager] = js.native
  /**
    * All of the animation groups added to this scene
    * @see http://doc.babylonjs.com/how_to/group
    */
  var animationGroups: js.Array[AnimationGroup] = js.native
  /**
    * Gets a list of Animations associated with the scene
    */
  var animations: js.Array[Animation] = js.native
  /** All of the cameras added to this scene
    * @see http://doc.babylonjs.com/babylon101/cameras
    */
  var cameras: js.Array[Camera] = js.native
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  var effectLayers: js.Array[EffectLayer] = js.native
  /**
    * The list of geometries used in the scene.
    */
  var geometries: js.Array[Geometry] = js.native
  /**
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer] = js.native
  /**
    * The list of lens flare system added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  /**
    * All of the lights added to this scene
    * @see http://doc.babylonjs.com/babylon101/lights
    */
  var lights: js.Array[Light] = js.native
  /**
    * All of the materials added to this scene
    * @see http://doc.babylonjs.com/babylon101/materials
    */
  var materials: js.Array[Material] = js.native
  /**
    * All of the (abstract) meshes added to this scene
    */
  var meshes: js.Array[AbstractMesh] = js.native
  /**
    * The list of morph target managers added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh
    */
  var morphTargetManagers: js.Array[MorphTargetManager] = js.native
  /**
    * All of the multi-materials added to this scene
    * @see http://doc.babylonjs.com/how_to/multi_materials
    */
  var multiMaterials: js.Array[MultiMaterial] = js.native
  /**
    * All of the particle systems added to this scene
    * @see http://doc.babylonjs.com/babylon101/particles
    */
  var particleSystems: js.Array[IParticleSystem] = js.native
  /**
    * The list of procedural textures added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  var proceduralTextures: js.Array[ProceduralTexture] = js.native
  /**
    * Gets the list of root nodes (ie. nodes with no parent)
    */
  var rootNodes: js.Array[Node] = js.native
  /**
    * The list of skeletons added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  var skeletons: js.Array[Skeleton] = js.native
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]] = js.native
  /**
    * Textures to keep.
    */
  var textures: js.Array[BaseTexture] = js.native
  /**
    * All of the tranform nodes added to this scene
    * @see http://doc.babylonjs.com/how_to/transformnode
    */
  var transformNodes: js.Array[TransformNode] = js.native
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  def addEffectLayer(newEffectLayer: EffectLayer): scala.Unit = js.native
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): scala.Unit = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: java.lang.String): Nullable[GlowLayer] = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: java.lang.String): Nullable[HighlightLayer] = js.native
  /**
    * Gets a lens flare system using its id
    * @param id defines the id to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByID(id: java.lang.String): Nullable[LensFlareSystem] = js.native
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  def getLensFlareSystemByName(name: java.lang.String): Nullable[LensFlareSystem] = js.native
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  def removeEffectLayer(toRemove: EffectLayer): scala.Double = js.native
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  def removeLensFlareSystem(toRemove: LensFlareSystem): scala.Double = js.native
}

/* static members */
@JSGlobal("BABYLON.AbstractScene")
@js.native
object AbstractScene extends js.Object {
  /**
    * Stores the list of available parsers in the application.
    */
  var _BabylonFileParsers: js.Any = js.native
  /**
    * Stores the list of available individual parsers in the application.
    */
  var _IndividualBabylonFileParsers: js.Any = js.native
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddIndividualParser(name: java.lang.String, parser: babylonjsLib.BABYLONNs.IndividualBabylonFileParser): scala.Unit = js.native
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddParser(name: java.lang.String, parser: babylonjsLib.BABYLONNs.BabylonFileParser): scala.Unit = js.native
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetIndividualParser(name: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.IndividualBabylonFileParser] = js.native
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetParser(name: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BabylonFileParser] = js.native
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  def Parse(
    jsonData: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    container: babylonjsLib.BABYLONNs.AssetContainer,
    rootUrl: java.lang.String
  ): scala.Unit = js.native
}

