package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcessRenderEffect extends js.Object {
  
  /**
    * Attaches the effect on cameras
    * @param cameras The camera to attach to.
    * @hidden
    */
  def _attachCameras(cameras: js.Array[Camera]): Unit = js.native
  /**
    * Attaches the effect on cameras
    * @param cameras The camera to attach to.
    * @hidden
    */
  def _attachCameras(cameras: Camera): Unit = js.native
  
  var _cameras: js.Any = js.native
  
  /**
    * Detatches the effect on cameras
    * @param cameras The camera to detatch from.
    * @hidden
    */
  def _detachCameras(cameras: js.Array[Camera]): Unit = js.native
  /**
    * Detaches the effect on cameras
    * @param cameras The camera to detatch from.
    * @hidden
    */
  def _detachCameras(cameras: Camera): Unit = js.native
  
  /**
    * Disables the effect on the given cameras
    * @param cameras The camera to disable.
    * @hidden
    */
  def _disable(cameras: Camera): Unit = js.native
  /**
    * Disables the effect on the given cameras
    * @param cameras The camera to disable.
    * @hidden
    */
  def _disable(cameras: Nullable[js.Array[Camera]]): Unit = js.native
  
  /**
    * Enables the effect on given cameras
    * @param cameras The camera to enable.
    * @hidden
    */
  def _enable(cameras: Camera): Unit = js.native
  /**
    * Enables the effect on given cameras
    * @param cameras The camera to enable.
    * @hidden
    */
  def _enable(cameras: Nullable[js.Array[Camera]]): Unit = js.native
  
  var _getPostProcesses: js.Any = js.native
  
  var _indicesForCamera: js.Any = js.native
  
  /**
    * Name of the effect
    * @hidden
    */
  var _name: String = js.native
  
  var _postProcesses: js.Any = js.native
  
  var _singleInstance: js.Any = js.native
  
  /**
    * Updates the current state of the effect
    * @hidden
    */
  def _update(): Unit = js.native
  
  /**
    * Gets a list of the post processes contained in the effect.
    * @param camera The camera to get the post processes on.
    * @returns The list of the post processes in the effect.
    */
  def getPostProcesses(): Nullable[js.Array[PostProcess]] = js.native
  def getPostProcesses(camera: Camera): Nullable[js.Array[PostProcess]] = js.native
  
  /**
    * Checks if all the post processes in the effect are supported.
    */
  def isSupported: Boolean = js.native
}
