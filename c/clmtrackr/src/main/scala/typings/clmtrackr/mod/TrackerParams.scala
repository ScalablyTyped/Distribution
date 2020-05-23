package typings.clmtrackr.mod

import typings.clmtrackr.anon.UseWebWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackerParams extends js.Object {
  /** whether to use constant velocity model when fitting (default is true) */
  var constantVelocity: js.UndefOr[Boolean] = js.undefined
  /** object with parameters for facedetection : */
  var faceDetection: js.UndefOr[UseWebWorkers] = js.undefined
  /** threshold for when to assume we've lost tracking (default is 0.50) */
  var scoreThreshold: js.UndefOr[Double] = js.undefined
  /** the size of the searchwindow around each point (default is 11) */
  var searchWindow: js.UndefOr[Double] = js.undefined
  /** whether to stop tracking when the fitting has converged (default is false) */
  var stopOnConvergence: js.UndefOr[Boolean] = js.undefined
  /** whether to use webGL if it is available (default is true) */
  var useWebGL: js.UndefOr[Boolean] = js.undefined
}

object TrackerParams {
  @scala.inline
  def apply(
    constantVelocity: js.UndefOr[Boolean] = js.undefined,
    faceDetection: UseWebWorkers = null,
    scoreThreshold: js.UndefOr[Double] = js.undefined,
    searchWindow: js.UndefOr[Double] = js.undefined,
    stopOnConvergence: js.UndefOr[Boolean] = js.undefined,
    useWebGL: js.UndefOr[Boolean] = js.undefined
  ): TrackerParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constantVelocity)) __obj.updateDynamic("constantVelocity")(constantVelocity.get.asInstanceOf[js.Any])
    if (faceDetection != null) __obj.updateDynamic("faceDetection")(faceDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(scoreThreshold)) __obj.updateDynamic("scoreThreshold")(scoreThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchWindow)) __obj.updateDynamic("searchWindow")(searchWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnConvergence)) __obj.updateDynamic("stopOnConvergence")(stopOnConvergence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWebGL)) __obj.updateDynamic("useWebGL")(useWebGL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackerParams]
  }
}

