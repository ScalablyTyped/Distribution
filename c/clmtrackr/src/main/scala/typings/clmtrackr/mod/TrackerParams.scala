package typings.clmtrackr.mod

import typings.clmtrackr.anon.UseWebWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackerParams extends js.Object {
  /** whether to use constant velocity model when fitting (default is true) */
  var constantVelocity: js.UndefOr[Boolean] = js.native
  /** object with parameters for facedetection : */
  var faceDetection: js.UndefOr[UseWebWorkers] = js.native
  /** threshold for when to assume we've lost tracking (default is 0.50) */
  var scoreThreshold: js.UndefOr[Double] = js.native
  /** the size of the searchwindow around each point (default is 11) */
  var searchWindow: js.UndefOr[Double] = js.native
  /** whether to stop tracking when the fitting has converged (default is false) */
  var stopOnConvergence: js.UndefOr[Boolean] = js.native
  /** whether to use webGL if it is available (default is true) */
  var useWebGL: js.UndefOr[Boolean] = js.native
}

object TrackerParams {
  @scala.inline
  def apply(): TrackerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackerParams]
  }
  @scala.inline
  implicit class TrackerParamsOps[Self <: TrackerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstantVelocity(value: Boolean): Self = this.set("constantVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantVelocity: Self = this.set("constantVelocity", js.undefined)
    @scala.inline
    def setFaceDetection(value: UseWebWorkers): Self = this.set("faceDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceDetection: Self = this.set("faceDetection", js.undefined)
    @scala.inline
    def setScoreThreshold(value: Double): Self = this.set("scoreThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreThreshold: Self = this.set("scoreThreshold", js.undefined)
    @scala.inline
    def setSearchWindow(value: Double): Self = this.set("searchWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchWindow: Self = this.set("searchWindow", js.undefined)
    @scala.inline
    def setStopOnConvergence(value: Boolean): Self = this.set("stopOnConvergence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnConvergence: Self = this.set("stopOnConvergence", js.undefined)
    @scala.inline
    def setUseWebGL(value: Boolean): Self = this.set("useWebGL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWebGL: Self = this.set("useWebGL", js.undefined)
  }
  
}

