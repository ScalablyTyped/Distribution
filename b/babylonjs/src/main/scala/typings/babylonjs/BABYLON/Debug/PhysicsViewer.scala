package typings.babylonjs.BABYLON.Debug

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.IPhysicsEnginePlugin
import typings.babylonjs.BABYLON.Mesh
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PhysicsImpostor
import typings.babylonjs.BABYLON.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsViewer extends js.Object {
  var _debugBoxMesh: js.Any = js.native
  var _debugCylinderMesh: js.Any = js.native
  var _debugMaterial: js.Any = js.native
  var _debugMeshMeshes: js.Any = js.native
  var _debugSphereMesh: js.Any = js.native
  var _getDebugBoxMesh: js.Any = js.native
  var _getDebugCylinderMesh: js.Any = js.native
  var _getDebugMaterial: js.Any = js.native
  var _getDebugMesh: js.Any = js.native
  var _getDebugMeshMesh: js.Any = js.native
  var _getDebugSphereMesh: js.Any = js.native
  /** @hidden */
  var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
  /** @hidden */
  var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
  /** @hidden */
  var _numMeshes: Double = js.native
  /** @hidden */
  var _physicsEnginePlugin: Nullable[IPhysicsEnginePlugin] = js.native
  var _renderFunction: js.Any = js.native
  /** @hidden */
  var _scene: Nullable[Scene] = js.native
  var _utilityLayer: js.Any = js.native
  /** @hidden */
  /* protected */ def _updateDebugMeshes(): Unit = js.native
  /** Releases all resources */
  def dispose(): Unit = js.native
  /**
    * Hides a specified physic impostor
    * @param impostor defines the impostor to hide
    */
  def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
  /**
    * Renders a specified physic impostor
    * @param impostor defines the impostor to render
    * @param targetMesh defines the mesh represented by the impostor
    * @returns the new debug mesh used to render the impostor
    */
  def showImpostor(impostor: PhysicsImpostor): Nullable[AbstractMesh] = js.native
  def showImpostor(impostor: PhysicsImpostor, targetMesh: Mesh): Nullable[AbstractMesh] = js.native
}

