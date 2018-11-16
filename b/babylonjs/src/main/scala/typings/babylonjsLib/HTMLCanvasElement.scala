package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends js.Object {
  /** Track wether a record is in progress */
  var isRecording: scala.Boolean = js.native
  var mozRequestPointerLock: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var msRequestPointerLock: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var webkitRequestPointerLock: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /** Capture Stream method defined by some browsers */
  def captureStream(): stdLib.MediaStream = js.native
  /** Capture Stream method defined by some browsers */
  def captureStream(fps: scala.Double): stdLib.MediaStream = js.native
  def requestPointerLock(): scala.Unit = js.native
}

