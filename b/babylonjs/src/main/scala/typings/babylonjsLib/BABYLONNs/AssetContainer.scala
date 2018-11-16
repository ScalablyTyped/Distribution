package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Container with a set of assets that can be added or removed from a scene.
     */
@JSGlobal("BABYLON.AssetContainer")
@js.native
class AssetContainer protected () extends AbstractScene {
  /**
           * Instantiates an AssetContainer.
           * @param scene The scene the AssetContainer belongs to.
           */
  def this(scene: Scene) = this()
  var _moveAssets: js.Any = js.native
  /**
           * The scene the AssetContainer belongs to.
           */
  var scene: Scene = js.native
  /**
           * Adds all the assets from the container to the scene.
           */
  def addAllToScene(): scala.Unit = js.native
  /**
           * Adds all meshes in the asset container to a root mesh that can be used to position all the contained meshes. The root mesh is then added to the front of the meshes in the assetContainer.
           * @returns the root mesh
           */
  def createRootMesh(): Mesh = js.native
  /**
           * Removes all the assets contained in the scene and adds them to the container.
           * @param keepAssets Set of assets to keep in the scene. (default: empty)
           */
  def moveAllFromScene(): scala.Unit = js.native
  /**
           * Removes all the assets contained in the scene and adds them to the container.
           * @param keepAssets Set of assets to keep in the scene. (default: empty)
           */
  def moveAllFromScene(keepAssets: KeepAssets): scala.Unit = js.native
  /**
           * Removes all the assets in the container from the scene
           */
  def removeAllFromScene(): scala.Unit = js.native
}

