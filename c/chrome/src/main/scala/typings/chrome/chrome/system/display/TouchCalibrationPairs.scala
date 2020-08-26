package typings.chrome.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchCalibrationPairs extends js.Object {
  /** First pair of touch and display point required for touch calibration. */
  var pair1: TouchCalibrationPair = js.native
  /** Second pair of touch and display point required for touch calibration. */
  var pair2: TouchCalibrationPair = js.native
  /** Third pair of touch and display point required for touch calibration. */
  var pair3: TouchCalibrationPair = js.native
  /** Fourth pair of touch and display point required for touch calibration. */
  var pair4: TouchCalibrationPair = js.native
}

object TouchCalibrationPairs {
  @scala.inline
  def apply(
    pair1: TouchCalibrationPair,
    pair2: TouchCalibrationPair,
    pair3: TouchCalibrationPair,
    pair4: TouchCalibrationPair
  ): TouchCalibrationPairs = {
    val __obj = js.Dynamic.literal(pair1 = pair1.asInstanceOf[js.Any], pair2 = pair2.asInstanceOf[js.Any], pair3 = pair3.asInstanceOf[js.Any], pair4 = pair4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchCalibrationPairs]
  }
  @scala.inline
  implicit class TouchCalibrationPairsOps[Self <: TouchCalibrationPairs] (val x: Self) extends AnyVal {
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
    def setPair1(value: TouchCalibrationPair): Self = this.set("pair1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPair2(value: TouchCalibrationPair): Self = this.set("pair2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPair3(value: TouchCalibrationPair): Self = this.set("pair3", value.asInstanceOf[js.Any])
    @scala.inline
    def setPair4(value: TouchCalibrationPair): Self = this.set("pair4", value.asInstanceOf[js.Any])
  }
  
}

