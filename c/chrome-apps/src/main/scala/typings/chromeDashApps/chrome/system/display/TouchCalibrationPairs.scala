package typings.chromeDashApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pairs of point used to calibrate the display.
  */
trait TouchCalibrationPairs extends js.Object {
  /** First pair of touch and display point required for touch calibration. */
  var pair1: TouchCalibrationPair
  /** Second pair of touch and display point required for touch calibration. */
  var pair2: TouchCalibrationPair
  /** Third pair of touch and display point required for touch calibration. */
  var pair3: TouchCalibrationPair
  /** Fourth pair of touch and display point required for touch calibration. */
  var pair4: TouchCalibrationPair
}

object TouchCalibrationPairs {
  @scala.inline
  def apply(
    pair1: TouchCalibrationPair,
    pair2: TouchCalibrationPair,
    pair3: TouchCalibrationPair,
    pair4: TouchCalibrationPair
  ): TouchCalibrationPairs = {
    val __obj = js.Dynamic.literal(pair1 = pair1, pair2 = pair2, pair3 = pair3, pair4 = pair4)
  
    __obj.asInstanceOf[TouchCalibrationPairs]
  }
}

