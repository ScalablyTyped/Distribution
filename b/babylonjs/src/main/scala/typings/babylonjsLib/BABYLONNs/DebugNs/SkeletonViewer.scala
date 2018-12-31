package typings
package babylonjsLib.BABYLONNs.DebugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to render a debug view of a given skeleton
  * @see http://www.babylonjs-playground.com/#1BZJVJ#8
  */
@JSGlobal("BABYLON.Debug.SkeletonViewer")
@js.native
class SkeletonViewer protected () extends js.Object {
  /**
    * Creates a new SkeletonViewer
    * @param skeleton defines the skeleton to render
    * @param mesh defines the mesh attached to the skeleton
    * @param scene defines the hosting scene
    * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
    * @param renderingGroupId defines the rendering group id to use with the viewer
    */
  def this(/** defines the skeleton to render */
  skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
  mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(/** defines the skeleton to render */
  skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
  mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene, /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: scala.Boolean) = this()
  def this(/** defines the skeleton to render */
  skeleton: babylonjsLib.BABYLONNs.Skeleton, /** defines the mesh attached to the skeleton */
  mesh: babylonjsLib.BABYLONNs.AbstractMesh, scene: babylonjsLib.BABYLONNs.Scene, /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: scala.Boolean, /** defines the rendering group id to use with the viewer */
  renderingGroupId: scala.Double) = this()
  var _debugLines: js.Any = js.native
  var _debugMesh: js.Any = js.native
  var _getBonePosition: js.Any = js.native
  var _getLinesForBonesNoLength: js.Any = js.native
  var _getLinesForBonesWithLength: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _renderFunction: js.Any = js.native
  var _scene: js.Any = js.native
  /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  var autoUpdateBonesMatrices: scala.Boolean = js.native
  /** Gets or sets the color used to render the skeleton */
  var color: babylonjsLib.BABYLONNs.Color3 = js.native
  /** Gets or sets a boolean indicating if the viewer is enabled */
  var isEnabled: scala.Boolean = js.native
  /** defines the mesh attached to the skeleton */
  var mesh: babylonjsLib.BABYLONNs.AbstractMesh = js.native
  /** defines the rendering group id to use with the viewer */
  var renderingGroupId: scala.Double = js.native
  /** defines the skeleton to render */
  var skeleton: babylonjsLib.BABYLONNs.Skeleton = js.native
  /** Release associated resources */
  def dispose(): scala.Unit = js.native
  /** Update the viewer to sync with current skeleton state */
  def update(): scala.Unit = js.native
}

