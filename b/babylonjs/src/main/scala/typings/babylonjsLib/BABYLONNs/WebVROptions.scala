package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Set of options to customize the webVRCamera
     */

trait WebVROptions extends js.Object {
  /**
           * Should the native controller meshes be initialized. (default: true)
           */
  var controllerMeshes: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
           */
  var customVRButton: js.UndefOr[stdLib.HTMLButtonElement] = js.undefined
  /**
           * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
           */
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * Creating a default HemiLight only on controllers. (default: true)
           */
  var defaultLightingOnControllers: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
           */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the scale of the vrDevice in babylon space. (default: 1)
           */
  var positionScale: js.UndefOr[scala.Double] = js.undefined
  /**
           * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
           */
  var rayLength: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
           */
  var trackPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If you don't want to use the default VR button of the helper. (default: false)
           */
  var useCustomVRButton: js.UndefOr[scala.Boolean] = js.undefined
}

