package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a WebVR camera.
     * The WebVR camera is Babylon's simple interface to interaction with Windows Mixed Reality, HTC Vive and Oculus Rift.
     * @example http://doc.babylonjs.com/how_to/webvr_camera
     */
@JSImport("babylonjs", "WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected ()
  extends babylonjsLib.BABYLONNs.WebVRFreeCamera {
  /**
           * Instantiates a WebVRFreeCamera.
           * @param name The name of the WebVRFreeCamera
           * @param position The starting anchor position for the camera
           * @param scene The scene the camera belongs to
           * @param webVROptions a set of customizable options for the webVRCamera
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates a WebVRFreeCamera.
           * @param name The name of the WebVRFreeCamera
           * @param position The starting anchor position for the camera
           * @param scene The scene the camera belongs to
           * @param webVROptions a set of customizable options for the webVRCamera
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, webVROptions: babylonjsLib.BABYLONNs.WebVROptions) = this()
}

