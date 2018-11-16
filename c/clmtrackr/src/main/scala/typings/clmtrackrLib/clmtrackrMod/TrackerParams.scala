package typings
package clmtrackrLib.clmtrackrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TrackerParams extends js.Object {
  /** whether to use constant velocity model when fitting (default is true) */
  var constantVelocity: js.UndefOr[scala.Boolean] = js.undefined
  /** object with parameters for facedetection : */
  var faceDetection: js.UndefOr[clmtrackrLib.Anon_UseWebWorkers] = js.undefined
  /** threshold for when to assume we've lost tracking (default is 0.50) */
  var scoreThreshold: js.UndefOr[scala.Double] = js.undefined
  /** the size of the searchwindow around each point (default is 11) */
  var searchWindow: js.UndefOr[scala.Double] = js.undefined
  /** whether to stop tracking when the fitting has converged (default is false) */
  var stopOnConvergence: js.UndefOr[scala.Boolean] = js.undefined
  /** whether to use webGL if it is available (default is true) */
  var useWebGL: js.UndefOr[scala.Boolean] = js.undefined
}

