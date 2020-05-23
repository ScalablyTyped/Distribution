package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshAssetTask extends AbstractAssetTask {
  /**
    * Gets the list of loaded animation groups
    */
  var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
  /**
    * Gets the list of loaded meshes
    */
  var loadedMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Gets the list of loaded particle systems
    */
  var loadedParticleSystems: js.Array[IParticleSystem] = js.native
  /**
    * Gets the list of loaded skeletons
    */
  var loadedSkeletons: js.Array[Skeleton] = js.native
  /**
    * Defines the list of mesh's names you want to load
    */
  var meshesNames: js.Any = js.native
  /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  var rootUrl: String = js.native
  /**
    * Defines the filename of the scene to load from
    */
  var sceneFilename: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: MeshAssetTask): Unit = js.native
  def onError(task: MeshAssetTask, message: String): Unit = js.native
  def onError(task: MeshAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: MeshAssetTask): Unit = js.native
}

