package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetContainer
  extends StObject
     with AbstractScene {
  
  /* private */ var _addNodeAndDescendantsToList: Any = js.native
  
  /**
    * Check if a specific node is contained in this asset container.
    * @param node
    */
  /* private */ var _isNodeInContainer: Any = js.native
  
  /**
    * For every node in the scene, check if its parent node is also in the scene.
    */
  /* private */ var _isValidHierarchy: Any = js.native
  
  /* private */ var _moveAssets: Any = js.native
  
  /* private */ var _onContextRestoredObserver: Any = js.native
  
  /**
    * Given a list of nodes, return a topological sorting of them.
    * @param nodes
    */
  /* private */ var _topologicalSort: Any = js.native
  
  /* private */ var _wasAddedToScene: Any = js.native
  
  /**
    * Adds all the assets from the container to the scene.
    */
  def addAllToScene(): Unit = js.native
  
  /**
    * Adds assets from the container to the scene.
    * @param predicate defines a predicate used to select which entity will be added (can be null)
    */
  def addToScene(): Unit = js.native
  def addToScene(predicate: Nullable[js.Function1[/* entity */ Any, Boolean]]): Unit = js.native
  
  /**
    * Adds all meshes in the asset container to a root mesh that can be used to position all the contained meshes. The root mesh is then added to the front of the meshes in the assetContainer.
    * @returns the root mesh
    */
  def createRootMesh(): Mesh = js.native
  
  /**
    * Disposes all the assets in the container
    */
  def dispose(): Unit = js.native
  
  /**
    * Instantiate or clone all meshes and add the new ones to the scene.
    * Skeletons and animation groups will all be cloned
    * @param nameFunction defines an optional function used to get new names for clones
    * @param cloneMaterials defines an optional boolean that defines if materials must be cloned as well (false by default)
    * @param options defines an optional list of options to control how to instantiate / clone models
    * @param options.doNotInstantiate defines if the model must be instantiated or just cloned
    * @param options.predicate defines a predicate used to filter whih mesh to instantiate/clone
    * @returns a list of rootNodes, skeletons and animation groups that were duplicated
    */
  def instantiateModelsToScene(): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: js.Function1[/* sourceName */ String, String]): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: js.Function1[/* sourceName */ String, String], cloneMaterials: Boolean): InstantiatedEntries = js.native
  def instantiateModelsToScene(
    nameFunction: js.Function1[/* sourceName */ String, String],
    cloneMaterials: Boolean,
    options: Predicate
  ): InstantiatedEntries = js.native
  def instantiateModelsToScene(
    nameFunction: js.Function1[/* sourceName */ String, String],
    cloneMaterials: Unit,
    options: Predicate
  ): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: Unit, cloneMaterials: Boolean): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: Unit, cloneMaterials: Boolean, options: Predicate): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: Unit, cloneMaterials: Unit, options: Predicate): InstantiatedEntries = js.native
  
  def mergeAnimationsTo(scene: Unit, animatables: js.Array[Animatable]): js.Array[AnimationGroup] = js.native
  def mergeAnimationsTo(
    scene: Unit,
    animatables: js.Array[Animatable],
    targetConverter: Nullable[js.Function1[/* target */ Any, Nullable[Node]]]
  ): js.Array[AnimationGroup] = js.native
  /**
    * Merge animations (direct and animation groups) from this asset container into a scene
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param animatables set of animatables to retarget to a node from the scene
    * @param targetConverter defines a function used to convert animation targets from the asset container to the scene (default: search node by name)
    * @returns an array of the new AnimationGroup added to the scene (empty array if none)
    */
  def mergeAnimationsTo(scene: Nullable[Scene], animatables: js.Array[Animatable]): js.Array[AnimationGroup] = js.native
  def mergeAnimationsTo(
    scene: Nullable[Scene],
    animatables: js.Array[Animatable],
    targetConverter: Nullable[js.Function1[/* target */ Any, Nullable[Node]]]
  ): js.Array[AnimationGroup] = js.native
  
  /**
    * Removes all the assets contained in the scene and adds them to the container.
    * @param keepAssets Set of assets to keep in the scene. (default: empty)
    */
  def moveAllFromScene(): Unit = js.native
  def moveAllFromScene(keepAssets: KeepAssets): Unit = js.native
  
  /**
    * Removes all the assets in the container from the scene
    */
  def removeAllFromScene(): Unit = js.native
  
  /**
    * Removes assets in the container from the scene
    * @param predicate defines a predicate used to select which entity will be added (can be null)
    */
  def removeFromScene(): Unit = js.native
  def removeFromScene(predicate: Nullable[js.Function1[/* entity */ Any, Boolean]]): Unit = js.native
  
  /**
    * The scene the AssetContainer belongs to.
    */
  var scene: Scene = js.native
}
