package typings
package babylonjsLib.BABYLONNs.DebugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Used to show the physics impostor around the specific mesh
     */
@JSGlobal("BABYLON.Debug.PhysicsViewer")
@js.native
class PhysicsViewer protected () extends js.Object {
  /**
           * Creates a new PhysicsViewer
           * @param scene defines the hosting scene
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  var _debugBoxMesh: js.Any = js.native
  var _debugMaterial: js.Any = js.native
  var _debugSphereMesh: js.Any = js.native
  var _getDebugBoxMesh: js.Any = js.native
  var _getDebugMaterial: js.Any = js.native
  var _getDebugMesh: js.Any = js.native
  var _getDebugSphereMesh: js.Any = js.native
  /** @hidden */
  var _impostors: js.Array[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PhysicsImpostor]] = js.native
  /** @hidden */
  var _meshes: js.Array[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh]] = js.native
  /** @hidden */
  var _numMeshes: scala.Double = js.native
  /** @hidden */
  var _physicsEnginePlugin: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.IPhysicsEnginePlugin] = js.native
  var _renderFunction: js.Any = js.native
  /** @hidden */
  var _scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene] = js.native
  /** @hidden */
  /* protected */ def _updateDebugMeshes(): scala.Unit = js.native
  /** Releases all resources */
  def dispose(): scala.Unit = js.native
  /**
           * Hides a specified physic impostor
           * @param impostor defines the impostor to hide
           */
  def hideImpostor(impostor: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PhysicsImpostor]): scala.Unit = js.native
  /**
           * Renders a specified physic impostor
           * @param impostor defines the impostor to render
           */
  def showImpostor(impostor: babylonjsLib.BABYLONNs.PhysicsImpostor): scala.Unit = js.native
}

