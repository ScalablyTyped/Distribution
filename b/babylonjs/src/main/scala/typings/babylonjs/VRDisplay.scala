package typings.babylonjs

import typings.std.EventTarget
import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for WebVR API
// Project: https://w3c.github.io/webvr/
// Definitions by: six a <https://github.com/lostfictions>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
@js.native
trait VRDisplay extends EventTarget {
  /**
    * Dictionary of capabilities describing the VRDisplay.
    */
  val capabilities: VRDisplayCapabilities = js.native
  /**
    * z-depth defining the far plane of the eye view frustum
    * enables mapping of values in the render target depth
    * attachment to scene coordinates. Initially set to 10000.0.
    */
  var depthFar: Double = js.native
  /**
    * z-depth defining the near plane of the eye view frustum
    * enables mapping of values in the render target depth
    * attachment to scene coordinates. Initially set to 0.01.
    */
  var depthNear: Double = js.native
  /**
    * An identifier for this distinct VRDisplay. Used as an
    * association point in the Gamepad API.
    */
  val displayId: Double = js.native
  /**
    * A display name, a user-readable name identifying it.
    */
  val displayName: String = js.native
  val isConnected: Boolean = js.native
  val isPresenting: Boolean = js.native
  /**
    * If this VRDisplay supports room-scale experiences, the optional
    * stage attribute contains details on the room-scale parameters.
    */
  val stageParameters: VRStageParameters | Null = js.native
  /**
    * Passing the value returned by `requestAnimationFrame` to
    * `cancelAnimationFrame` will unregister the callback.
    * @param handle Define the hanle of the request to cancel
    */
  def cancelAnimationFrame(handle: Double): Unit = js.native
  /**
    * Stops presenting to the VRDisplay.
    * @returns a promise to know when it stopped
    */
  def exitPresent(): js.Promise[Unit] = js.native
  /**
    * Return the current VREyeParameters for the given eye.
    * @param whichEye Define the eye we want the parameter for
    * @returns the eye parameters
    */
  def getEyeParameters(whichEye: String): VREyeParameters = js.native
  /**
    * Populates the passed VRFrameData with the information required to render
    * the current frame.
    * @param frameData Define the data structure to populate
    * @returns true if ok otherwise false
    */
  def getFrameData(frameData: VRFrameData): Boolean = js.native
  /**
    * Return the current instantaneous pose of the VRDisplay, with no
    * prediction applied.
    * @returns the current instantaneous pose
    */
  def getImmediatePose(): VRPose = js.native
  /**
    * Get the layers currently being presented.
    * @returns the list of VR layers
    */
  def getLayers(): js.Array[VRLayer] = js.native
  /**
    * Return a VRPose containing the future predicted pose of the VRDisplay
    * when the current frame will be presented. The value returned will not
    * change until JavaScript has returned control to the browser.
    *
    * The VRPose will contain the position, orientation, velocity,
    * and acceleration of each of these properties.
    * @returns the pose object
    */
  def getPose(): VRPose = js.native
  /**
    * The callback passed to `requestAnimationFrame` will be called
    * any time a new frame should be rendered. When the VRDisplay is
    * presenting the callback will be called at the native refresh
    * rate of the HMD. When not presenting this function acts
    * identically to how window.requestAnimationFrame acts. Content should
    * make no assumptions of frame rate or vsync behavior as the HMD runs
    * asynchronously from other displays and at differing refresh rates.
    * @param callback Define the eaction to run next frame
    * @returns the request handle it
    */
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  /**
    * Begin presenting to the VRDisplay. Must be called in response to a user gesture.
    * Repeat calls while already presenting will update the VRLayers being displayed.
    * @param layers Define the list of layer to present
    * @returns a promise to know when the request has been fulfilled
    */
  def requestPresent(layers: js.Array[VRLayer]): js.Promise[Unit] = js.native
  /**
    * Reset the pose for this display, treating its current position and
    * orientation as the "origin/zero" values. VRPose.position,
    * VRPose.orientation, and VRStageParameters.sittingToStandingTransform may be
    * updated when calling resetPose(). This should be called in only
    * sitting-space experiences.
    */
  def resetPose(): Unit = js.native
  /**
    * The VRLayer provided to the VRDisplay will be captured and presented
    * in the HMD. Calling this function has the same effect on the source
    * canvas as any other operation that uses its source image, and canvases
    * created without preserveDrawingBuffer set to true will be cleared.
    * @param pose Define the pose to submit
    */
  def submitFrame(): Unit = js.native
  def submitFrame(pose: VRPose): Unit = js.native
}

