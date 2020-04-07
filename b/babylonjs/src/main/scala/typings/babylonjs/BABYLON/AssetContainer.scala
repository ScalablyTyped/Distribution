package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AssetContainer")
@js.native
class AssetContainer protected () extends AbstractScene {
  /**
    * Instantiates an AssetContainer.
    * @param scene The scene the AssetContainer belongs to.
    */
  def this(scene: Scene) = this()
  var _moveAssets: js.Any = js.native
  var _wasAddedToScene: js.Any = js.native
  /**
    * The scene the AssetContainer belongs to.
    */
  var scene: Scene = js.native
  /**
    * Adds all the assets from the container to the scene.
    */
  def addAllToScene(): Unit = js.native
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
    * @returns a list of rootNodes, skeletons and aniamtion groups that were duplicated
    */
  def instantiateModelsToScene(): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: js.Function1[/* sourceName */ String, String]): InstantiatedEntries = js.native
  def instantiateModelsToScene(nameFunction: js.Function1[/* sourceName */ String, String], cloneMaterials: Boolean): InstantiatedEntries = js.native
  def mergeAnimationsTo(scene: js.UndefOr[scala.Nothing], animatables: js.Array[Animatable]): Unit = js.native
  def mergeAnimationsTo(
    scene: js.UndefOr[scala.Nothing],
    animatables: js.Array[Animatable],
    targetConverter: Nullable[js.Function1[/* target */ _, Nullable[Node]]]
  ): Unit = js.native
  def mergeAnimationsTo(scene: Null, animatables: js.Array[Animatable]): Unit = js.native
  def mergeAnimationsTo(
    scene: Null,
    animatables: js.Array[Animatable],
    targetConverter: Nullable[js.Function1[/* target */ _, Nullable[Node]]]
  ): Unit = js.native
  /**
    * Merge animations from this asset container into a scene
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param animatables set of animatables to retarget to a node from the scene
    * @param targetConverter defines a function used to convert animation targets from the asset container to the scene (default: search node by name)
    */
  def mergeAnimationsTo(scene: Scene, animatables: js.Array[Animatable]): Unit = js.native
  def mergeAnimationsTo(
    scene: Scene,
    animatables: js.Array[Animatable],
    targetConverter: Nullable[js.Function1[/* target */ _, Nullable[Node]]]
  ): Unit = js.native
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
}

