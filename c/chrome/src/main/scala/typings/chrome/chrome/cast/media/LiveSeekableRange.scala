package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.LiveSeekableRange")
@js.native
/**
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.LiveSeekableRange
  */
class LiveSeekableRange () extends js.Object {
  def this(start: Double) = this()
  def this(start: Double, end: Double) = this()
  def this(start: Double, end: Double, isMovingWindow: Boolean) = this()
  def this(start: Double, end: Double, isMovingWindow: Boolean, isLiveDone: Boolean) = this()
  var end: js.UndefOr[Double] = js.native
  var isLiveDone: js.UndefOr[Boolean] = js.native
  var isMovingWindow: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Double] = js.native
}

