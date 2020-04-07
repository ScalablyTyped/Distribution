package typings.babylonjs

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement extends js.Object {
  /** Track wether a record is in progress */
  var isRecording: Boolean = js.native
  var mozRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  var msRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  var webkitRequestPointerLock: js.UndefOr[js.Function0[Unit]] = js.native
  /** Capture Stream method defined by some browsers */
  def captureStream(): MediaStream = js.native
  def captureStream(fps: Double): MediaStream = js.native
  def requestPointerLock(): Unit = js.native
}

