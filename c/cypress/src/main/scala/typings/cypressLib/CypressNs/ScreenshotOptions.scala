package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  var blackout: js.Array[java.lang.String]
  var capture: cypressLib.cypressLibStrings.runner | cypressLib.cypressLibStrings.viewport | cypressLib.cypressLibStrings.fullPage
  var clip: Dimensions
  var disableTimersAndAnimations: scala.Boolean
  var scale: scala.Boolean
  def afterScreenshot(doc: stdLib.Document): scala.Unit
  def beforeScreenshot(doc: stdLib.Document): scala.Unit
}

object ScreenshotOptions {
  @scala.inline
  def apply(
    afterScreenshot: js.Function1[stdLib.Document, scala.Unit],
    beforeScreenshot: js.Function1[stdLib.Document, scala.Unit],
    blackout: js.Array[java.lang.String],
    capture: cypressLib.cypressLibStrings.runner | cypressLib.cypressLibStrings.viewport | cypressLib.cypressLibStrings.fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: scala.Boolean,
    scale: scala.Boolean
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal(afterScreenshot = afterScreenshot, beforeScreenshot = beforeScreenshot, blackout = blackout, capture = capture.asInstanceOf[js.Any], clip = clip, disableTimersAndAnimations = disableTimersAndAnimations, scale = scale)
  
    __obj.asInstanceOf[ScreenshotOptions]
  }
}

