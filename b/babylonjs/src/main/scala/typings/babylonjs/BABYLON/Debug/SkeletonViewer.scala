package typings.babylonjs.BABYLON.Debug

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.Color3
import typings.babylonjs.BABYLON.LinesMesh
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonViewer extends js.Object {
  var _debugLines: js.Any = js.native
  var _debugMesh: js.Any = js.native
  var _getBonePosition: js.Any = js.native
  var _getLinesForBonesNoLength: js.Any = js.native
  var _getLinesForBonesWithLength: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _renderFunction: js.Any = js.native
  var _scene: js.Any = js.native
  var _utilityLayer: js.Any = js.native
  /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  var autoUpdateBonesMatrices: Boolean = js.native
  /** Gets or sets the color used to render the skeleton */
  var color: Color3 = js.native
  /** defines the mesh attached to the skeleton */
  var mesh: AbstractMesh = js.native
  /** defines the rendering group id to use with the viewer */
  var renderingGroupId: Double = js.native
  /** defines the skeleton to render */
  var skeleton: Skeleton = js.native
  /**
    * Returns the mesh used to render the bones
    */
  def debugMesh: Nullable[LinesMesh] = js.native
  /** Release associated resources */
  def dispose(): Unit = js.native
  def isEnabled: Boolean = js.native
  /** Gets or sets a boolean indicating if the viewer is enabled */
  def isEnabled(value: Boolean): js.Any = js.native
  /** Update the viewer to sync with current skeleton state */
  def update(): Unit = js.native
}

