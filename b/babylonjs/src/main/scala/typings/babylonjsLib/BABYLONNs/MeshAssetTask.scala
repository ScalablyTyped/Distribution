package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a task used by AssetsManager to load meshes
  */
@JSGlobal("BABYLON.MeshAssetTask")
@js.native
class MeshAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new MeshAssetTask
    * @param name defines the name of the task
    * @param meshesNames defines the list of mesh's names you want to load
    * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
    * @param sceneFilename defines the filename of the scene to load from
    */
  def this(/**
    * Defines the name of the task
    */
  name: java.lang.String, /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: js.Any, /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: java.lang.String, /**
    * Defines the filename of the scene to load from
    */
  sceneFilename: java.lang.String) = this()
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
  var rootUrl: java.lang.String = js.native
  /**
    * Defines the filename of the scene to load from
    */
  var sceneFilename: java.lang.String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: MeshAssetTask): scala.Unit = js.native
  def onError(task: MeshAssetTask, message: java.lang.String): scala.Unit = js.native
  def onError(task: MeshAssetTask, message: java.lang.String, exception: js.Any): scala.Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: MeshAssetTask): scala.Unit = js.native
}

